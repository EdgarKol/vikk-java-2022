package ee.vikk.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex03_Strings {
    //  How to do deep dive:
    //  Step 1: Select the method name (stringsAreObjectsAndHaveAConstructor on line 20) Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void stringsAreObjectsAndAreCreatedByCallingTheConstructor() {
        assertEquals("hello Oskar", new String(______));
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // This exercise is just to show that you can call a constructor,
    // even though you probably will never do that/
    // </editor-fold>

    @Test
    void stringsCanAlsoBeCreatedWithoutUsingTheConstructor() {
        assertEquals(_________, "hello Birgit");
    }

    @Test
    void stringsCanBeConcatenatedByMultipleStrings() {
        assertEquals(_________, "hello" + " " + "Oskar");
    }

    @Test
    void testingStringsForEquality() {
        assertTrue(_________.equals("Oskar"));
        assertTrue(_________.equals("Bit" + "git"));
        assertTrue("Viljandi" == _________);
        assertEquals(____, "Anton".compareTo("Zorro"));
        assertEquals(____, "A".compareTo("B"));
        assertEquals(____, "B".compareTo("A"));
    }

    @Test
    void stringsExposeTheirLength() {
        assertEquals(5, ____);
    }

    @Test
    void emptyStrings() {
        assertTrue(_________.isEmpty());
    }

    @Test
    void nonEmptyStrings() {
        assertFalse(______.isEmpty());
    }

    @Test
    void blankStrings() {
        assertTrue(_________.isBlank());
        assertTrue(_________.isBlank());
        assertTrue(_________.isBlank());
    }

    @Test
    void stringsCanBeModified() {
        String name = "Oskar";
        assertEquals("OSKAR", _________);
        assertEquals("oskar", _________);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Type name. and then search through the methods that are shown in the list.
    // </editor-fold>

    @Test
    void whiteSpaceInStringsMatters() {
        assertEquals(_________, "Oskar   ");
    }

    @Test
    void stringsCanBeTrimmedOrStripped() {
        assertEquals(_________, "Tom   ".trim());
        assertEquals(_________, "   Tom".trim());
        assertEquals(_________, "   Tom   ".trim());
        assertEquals(_________, "   Tom   ".strip());
        assertEquals(_________, "   Tom   ".stripLeading());
        assertEquals(_________, "   Tom   ".stripTrailing());
        assertEquals(_________, "     ".trim());
        assertEquals(_________, "     ".strip());
    }

    @Test
    void canAskAStringIfItContainsAnotherString() {
        assertTrue("Oskar".contains(_________));

        assertFalse(_________.contains("git"));
    }

    @Test
    void canAskForLetterAtLocation() {
        assertEquals(__, "Oskar".charAt(2));
        assertEquals('r', "Oskar".charAt(____));
    }

    @Test
    void canAskForLocationOfLetter() {
        assertEquals(____, "Oskar".indexOf('k'));
        assertEquals(-1, "Bitgit".indexOf(__));
        assertEquals(____, "Ananas".indexOf('a'));
        assertEquals(____, "Ananas".lastIndexOf('a'));
    }

    @Test
    void askStringForSubstring() {
        assertEquals(_________, "Oskar".substring(2));
        assertEquals(_________, "Oskar".substring(2, 3));
        assertEquals(_________, "Oskar".substring(2, 4));
    }

    @Test
    void canCheckTheBeginningAndEnd() {
        assertTrue("Oskar".startsWith(_________));
        assertTrue("Oskar".startsWith(_________));
        assertTrue("Oskar".startsWith(_________));

        assertTrue("Oskar".endsWith(_________));
        assertTrue("Oskar".endsWith(_________));
        assertTrue("Oskar".endsWith(_________));
    }

    @Test
    void canRepeatMultipleTimes() {
        assertEquals(_________, "Birgit! ".repeat(2));
        assertEquals("Oskar! Oskar! Oskar! Oskar! Oskar! Oskar! Oskar! Oskar! Oskar! ", "Oskar! ".repeat(____));
    }

    @Test
    void replaceSingleCharacters() {
        assertEquals(_________, "Birgit".replace('r', 'l'));
        assertEquals(_________, "Birgit".replace("r", "l"));
    }

    @Test
    void replaceMultipleCharacters() {
        assertEquals(_________, "Birgit".replace("Bir", "Os").replace("git", "kar"));
    }

    @Test
    void formattingStrings() {
        assertEquals(_________, "Oskar is " + 6 + " years old.");
        assertEquals(_________, "Oskar is %d years old.".formatted(6));
        assertEquals(_________, "Birgit is %.1f years old.".formatted(3.4));
        assertEquals("Oskar is older than Birgit", "%s is older than %s".formatted(_________, _________));
    }

    @Test
    void stringsCanBeSplitIntoParts() {
        assertArrayEquals(new String[]{"O", "s", "k", "a", "r"}, "Oskar".split(_________));
        assertArrayEquals(_____, "Ananass".split("a"));
        assertArrayEquals(_____, "Lars Oskar Birgit".split(" "));
    }

    @Test
    void stringsCanBeSplitButSomeSeperatorsAreSpecial() {
        assertArrayEquals(_____, "tere.Viljandi.kuidas.ilm.on".split("\\."));

        assertArrayEquals(new String[]{"tere", "hommikust"}, "tere|hommikust".split(_________));

        assertArrayEquals(new String[]{_________}, "tere hommikust\nkuidas sa magasid".split("\\s+"));
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    String _________ = "You need to fill in the blank ___";
    String ______ = "";
    String[] _____ = new String[0];
    int ____ = -99;
    char __ = ' ';
}
