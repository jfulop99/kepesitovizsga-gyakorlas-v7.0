package hu.nive.ujratervezes.kepesitovizsga.exam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam {

    private String name;
    private LocalDateTime beginTime;
    private int durationOfExam;
    private static int durationOfIdentification = 1;
    private ExamType type;

    public Exam(String name, LocalDateTime beginTime, int durationOfExam, ExamType type) {
        this.name = name;
        this.beginTime = beginTime;
        this.durationOfExam = durationOfExam;
        this.type = type;
    }

    public ExamType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public int getDurationOfExam() {
        return durationOfExam;
    }

    public static int getDurationOfIdentification() {
        return durationOfIdentification;
    }

    public LocalDateTime getBeginTimeOfExam() {
        return beginTime.minus(Duration.ofHours(durationOfIdentification));
    }

    public LocalDateTime getEndTimeOfExam() {
        return beginTime.plus(Duration.ofHours(durationOfExam));
    }

    public List<Exam> getExamsInChronologicalOrder(List<Exam> exams) {
        return exams.stream()
                .sorted(Comparator.comparing(Exam::getBeginTimeOfExam))
                .collect(Collectors.toList());
    }

    public Map<String, LocalDateTime> getExamsBySpecialPredicate(List<Exam> exams) {
        return null;
    }

}
