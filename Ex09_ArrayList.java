package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex09_ArrayList {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void creatingAnArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        assertNotNull(numbers);
    }

    @Test
    void creatingAnArrayListAsList() {
        List<Integer> numbers = new ArrayList<>();

        assertEquals("java.util.ArrayList", numbers.getClass().getName());
    }

    @Test
    void checkIfListIsEmpty() {
        ArrayList<Integer> numbers = new ArrayList<>();

        assertTrue(numbers.isEmpty());
        assertTrue(numbers.size() == 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Which method is better?
    // </editor-fold>

    @Test
    void addingElementsIntoTheListAndRetrievingThemByIndex() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(77);

        assertEquals(77, numbers.get(0));
    }

    @Test
    void arrayListHasSizeMethodNotLength() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(54);

        assertEquals(1, numbers.size());
    }

    @Test
    void accessingByIndex() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);

        assertEquals(2, numbers.get(1));
    }

    @Test
    void accessingAnArrayListOutsideOfItsBoundsThrowsException() {
        ArrayList<Integer> numbers = new ArrayList<>();

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> numbers.get(4))
                .withMessage("Index 4 out of bounds for length 0");
    }

    @Test
    void removeElementsByIndex() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);
        numbers.add(8);

        numbers.remove(3);

        assertEquals(List.of(6, 3, 2), numbers);
    }

    @Test
    void removeElementsByObject() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lars");
        names.add("Oskar");
        names.add("Birgit");
        names.add("Karl");

        names.remove("Karl");

        assertEquals(List.of("Lars", "Oskar", "Birgit"), names);
    }

    @Test
    void checkingIfElementInList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lars");
        names.add("Oskar");
        names.add("Birgit");

        assertTrue(names.contains("Lars"));
    }

    @Test
    void overwritingValues() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lars");
        names.add("Oskar");
        names.add("Pirgit");

        names.set(2, "Birgit");

        assertEquals("Birgit", names.get(2));
    }

    @Test
    void duplicateValues() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lars");
        names.add("Oskar");
        names.add("Birgit");
        names.add("Oskar");

        assertEquals(List.of("Lars", "Oskar", "Birgit", "Oskar"), names);
        assertEquals(4, names.size());
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    ArrayList<Integer> _____ = new ArrayList<>();
    ArrayList<Integer> __________ = null;

    int ______ = 100000;
    String _______ = "You need to fill in the blank ___";

}
