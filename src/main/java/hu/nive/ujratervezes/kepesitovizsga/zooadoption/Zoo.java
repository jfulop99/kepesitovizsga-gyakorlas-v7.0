package hu.nive.ujratervezes.kepesitovizsga.zooadoption;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Zoo {
    List<Person> people = new ArrayList<>();
    List<Adoption> adoptions = new ArrayList<>();
    public void loadAdoptiveParentsFromDatabase(DataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select person_name, email, animal, adoption_date from zooadoptions order by id")) {
            getResult(ps);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query", sqlException);
        }


    }

    private void getResult(PreparedStatement ps) throws SQLException {
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                people.add(new Person(rs.getString("person_name"), rs.getString("email")));
                adoptions.add(new Adoption(rs.getString("animal"), rs.getDate("adoption_date").toLocalDate()));
            }
        }
    }

    public Adoption getFirstAdoption() {
        return adoptions.stream()
                .min(Comparator.comparing(Adoption::getAdoptionDate))
                .orElseThrow();
    }

    public List<String> getAnimalNamesReverseOrdered() {
        return adoptions.stream()
                .sorted(Comparator.comparing(Adoption::getAnimal).reversed())
                .map(Adoption::getAnimal)
                .collect(Collectors.toList());
    }

    public Person getExactPerson(String email) {
        return people.stream()
                .filter(person -> person.getEmail().equals(email))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("No such person among the adoptive parents!"));
    }

    public List<String> getTextsOfLetters(String fileName) {
        String template = "";

        try {
            template = new String (Files.readAllBytes(Path.of("src/main/resources/" + fileName)));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            String finalTemplate = "";
            finalTemplate = template.replace("{orokbefogado_szulo}", people.get(i).getName())
                    .replace("{orokbefogadott_allat}", adoptions.get(i).getAnimal())
                    .replace("{datum}", "2021-10-04")
                    .replace("{idopont}", "17:00");
            result.add(finalTemplate);
        }
        return result;
    }
}
