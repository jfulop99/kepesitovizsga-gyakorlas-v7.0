package hu.nive.ujratervezes.kepesitovizsga.fractionreduction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionReductionTest {

    @Test
    public void testGetNumberOfNotReductiveFractions() {
        Assertions.assertEquals(48, new FractionReduction().getNumberOfNotReductiveFractions());
    }
}