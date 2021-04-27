package hu.nive.ujratervezes.kepesitovizsga.finelongwordonceagain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FineLongWordOnceAgainTest {

    @Test
    public void testGetFineLongWordOnceAgainButNowInAReverseWay() {
        char[][] fineLongWordInAnArrayOfArrays = new FineLongWordOnceAgain().getFineLongWordOnceAgainButNowInAReverseWay("IllegalArgumentException", 6);

        Assertions.assertEquals(19, fineLongWordInAnArrayOfArrays.length);
        Assertions.assertEquals('G', fineLongWordInAnArrayOfArrays[2][2]);
        Assertions.assertEquals('X', fineLongWordInAnArrayOfArrays[12][4]);
    }

    @Test
    public void testGetFineLongWordOnceAgainButNowInAReverseWayWithIllegalParameter() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new FineLongWordOnceAgain().getFineLongWordOnceAgainButNowInAReverseWay("IllegalArgumentException", 100));
        Assertions.assertEquals("Number of letters cannot be more than length of the word!", ex.getMessage());
    }
}