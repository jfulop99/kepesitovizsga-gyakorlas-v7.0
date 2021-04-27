package hu.nive.ujratervezes.kepesitovizsga.exam;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticalTestExam extends Exam {
    public PracticalTestExam(String name, LocalDateTime startTimeOfExam) {
        super(name, startTimeOfExam, 3, ExamType.PRACTICAL_TEST);
    }

    @Override
    public Map<String, LocalDateTime> getExamsBySpecialPredicate(List<Exam> exams) {
        return exams.stream()
                .filter(exam -> exam.getBeginTime().toLocalTime().isAfter(LocalTime.NOON))
                .collect(Collectors.toMap(Exam::getName, Exam::getBeginTime));
    }
}
