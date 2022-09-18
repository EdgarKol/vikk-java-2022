package ee.vikk.course;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex01_Primitive_Types {
    //  How to do deep dive:
    //  Step 1: Select the method name (numbersDoNotNeedQuotes on line 21) Press the Run Button
    //  Step 2: Read the name of the method that failed
    /*  Step 3: Fill in the blank (___) to make it pass
        Step 4: Consider at least one thing you just learned
        Step 5: Advance to the next method
        Do not change anything except the blank (___)
    */
    @Test
    void numbersDoNotNeedQuotes() {
        assertEquals(42, ___);
    }

    @Test
    void largestNumberForIntegers() {
        assertEquals(Integer.MAX_VALUE, ___);
    }

    @Test
    void smallestNumberForIntegers() {
        assertEquals(Integer.MIN_VALUE, ___);
    }

    @Test
    void veryLargeNumbersAreLongAndUsePostfixL() {
        assertEquals(2647483647L, ___);
    }

    @Test
    void forReadabilityCanAddUnderscore() {
        assertEquals(2_647_483_647L, ___);
    }

    @Test
    void textIsCalledStringAndTheyNeedDoubleQuotes() {
        assertEquals("Green", ___________);
    }

    @Test
    void stringsCanIncludeSpaces() {
        assertEquals("This is a string", ___________);
    }

    @Test
    void singleLetterWithDoubleQuotesIsAString() {
        assertEquals("R", ___________);
    }

    @Test
    void singleLetterWithSingleQuoteAreCalledChar() {
        assertEquals('R', __);
    }

    @Test
    void thisStringValueIsStillASingleLine() {
        assertEquals("Line 1 " +
                     "Line 1", ___________);
    }

    @EnabledOnOs({OS.MAC, OS.LINUX})
    @Test
    void specialSymbolForNewLineOnMac() {
        assertEquals("Line 1\nLine 2", ___________);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Text blocks start with three """ and then begin in the next line.
    // </editor-fold>

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void specialSymbolForNewLineOnWindows() {
        assertEquals("Line 1\r\nLine 2", ___________);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Text blocks start with three """ and then begin in the next line.
    // </editor-fold>

    @EnabledOnOs({OS.MAC, OS.LINUX})
    @Test
    void textBlocksAreMultiLineStringsMac() {
        assertEquals("Line 1\nLine 2\nLine 3", ________);
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void textBlocksAreMultiLineStringsWindows() {
        assertEquals("Line 1\r\nLine 2\r\nLine 3", ________);
    }

    @Test
    void booleansCanBeTrueOrFalse() {
        assertTrue(_____);
    }

    @Test
    void booleansCanBeTrueOrFalse2() {
        assertFalse(______);
    }

    @Test
    void decimalNumbersUseDotAsSeparator() {
        assertEquals(4.4, _______);
    }

    @Test
    void doingMathWithIntegers() {
        assertEquals(4 + 3, _______);
        assertEquals(12 - 2, _______);
        assertEquals(3 * 3, _______);
        assertEquals(15 / 5, _______);
    }

    @Test
    void carefulWhenDoingMathWithIntegers() {
        assertEquals(27 / 9, ___);
        assertEquals(28 / 9, ___);
        assertEquals(29 / 9, ___);
        assertEquals(4 / 20, _______);
        assertEquals(4.0 / 20, _______);
    }

    @Test
    void moduloOperatorToCalculateTheRemainder() {
        assertEquals(17 % 3, ___);
        assertEquals(9 % 5, ___);
        assertEquals(10 % 5, ___);
        assertEquals(18 % 2, ___);
        assertEquals(19 % 2, ___);
    }

    @Test
    void usingVariables() {
        int myFavoriteNumber = 101;
        assertEquals(___, myFavoriteNumber);
    }

    @Test
    void precedence() {
        int x = 1;
        int y = 2;
        int z = 3;
        assertEquals(___, y * y - 2 + z);
        assertEquals(___, x + y - 2 / 2 + z);
        assertEquals(___, x + (y - 2) / (2 + z));
    }

    @Test
    void addingTextWithText() {
        String name = "Peter" + " " + "Pan";
        assertEquals(___________, name);
    }

    @Test
    void addingTextWithInt() {
        String name = "Henry The " + 8;
        assertEquals(___________, name);
    }

    @Test
    void textIsTextEvenWhenItsNumbers() {
        String age = "3" + "4";
        assertEquals(___________, age);
    }

    @Test
    void stringsCanBeConvertedToIntegersInSomeCases() {
        int number = Integer.parseInt(___________);
        assertEquals(7, number);
    }

    @Test
    void stringsCanBeConvertedToLongInSomeCases() {
        String largeNumber = "2647483647";
        long number = ____;
        assertEquals(2647483647L, number);
    }

    @Test
    void stringsCanBeConvertedToBooleansInSomeCases() {
        assertTrue(Boolean.parseBoolean(__________));
        assertTrue(Boolean.parseBoolean(__________));
        assertFalse(Boolean.parseBoolean(_________));
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Try if capitalization matters.
    // </editor-fold>

    @Test
    void integersCanBeConvertedToStrings() {
        int integer = ___;
        String numberAsString = String.valueOf(integer);
        assertEquals("77", numberAsString);
    }

    @Test
    void integersCanAlsoBeConvertedToStringsThisWay() {
        String numberAsString = "" + ___;
        assertEquals("55", numberAsString);
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    String ___________ = "You need to fill in the blank ___";
    String __________ = "You need to fill in the blank ___";
    String _________ = "true";
    String ________ = """
            You need to fill in the blank ___ with a text block that starts with 3 \"""";
    char __ = ' ';
    int ___ = -1;
    long ____ = 1L;
    boolean _____ = false;
    boolean ______ = true;
    double _______ = 1.0;

}
