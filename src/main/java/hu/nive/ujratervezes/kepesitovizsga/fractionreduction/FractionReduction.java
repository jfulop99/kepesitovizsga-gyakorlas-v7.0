package hu.nive.ujratervezes.kepesitovizsga.fractionreduction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FractionReduction {
    public int getNumberOfNotReductiveFractions() {
        List<Integer> dividers = IntStream.range(2,144 /2).filter(x -> 144 % x == 0).boxed().collect(Collectors.toList());
        int counter = 144;
        for (int i = 1; i <= 144; i++) {
            for (int j = 0; j < dividers.size(); j++) {
                int divider = dividers.get(j);
                if (i % divider == 0) {
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }
}
