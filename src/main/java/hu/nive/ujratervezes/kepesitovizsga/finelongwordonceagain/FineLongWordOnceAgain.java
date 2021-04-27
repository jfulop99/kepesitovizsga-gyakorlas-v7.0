package hu.nive.ujratervezes.kepesitovizsga.finelongwordonceagain;

public class FineLongWordOnceAgain {
    public char[][] getFineLongWordOnceAgainButNowInAReverseWay(String longWord, int column) {
        if (column > longWord.length()) {
            throw new IllegalArgumentException("Number of letters cannot be more than length of the word!");
        }
        char[][] result = new char[longWord.length() - column +1][column];
        char[] chars = longWord.toUpperCase().toCharArray();
        for (int i = 0; i <= longWord.length() - column; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = chars[i + j];
            }
        }
        return result;
    }
}
