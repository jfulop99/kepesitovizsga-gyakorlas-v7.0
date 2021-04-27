package hu.nive.ujratervezes.kepesitovizsga.zooadoption;

import java.time.LocalDate;

public class Adoption {
    private String animal;
    private LocalDate adoptionDate;

    public Adoption(String animal, LocalDate adoptationDate) {
        this.animal = animal;
        this.adoptionDate = adoptationDate;
    }

    public String getAnimal() {
        return animal;
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adoption adoption = (Adoption) o;

        if (animal != null ? !animal.equals(adoption.animal) : adoption.animal != null) return false;
        return adoptionDate != null ? adoptionDate.equals(adoption.adoptionDate) : adoption.adoptionDate == null;
    }

    @Override
    public int hashCode() {
        int result = animal != null ? animal.hashCode() : 0;
        result = 31 * result + (adoptionDate != null ? adoptionDate.hashCode() : 0);
        return result;
    }
}
