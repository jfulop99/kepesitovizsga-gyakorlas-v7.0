package hu.nive.ujratervezes.kepesitovizsga.exam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TheoryTestExam extends Exam {
    public TheoryTestExam(String name, LocalDateTime startOfExam) {
        super(name, startOfExam, 1, ExamType.THEORY_TEST);
    }

    @Override
    public Map<String, LocalDateTime> getExamsBySpecialPredicate(List<Exam> exams) {
        return exams.stream().filter(exam -> exam.getName().contains("fejlesztő")).collect(Collectors.toMap(Exam::getName, Exam::getBeginTime));
    }
}
