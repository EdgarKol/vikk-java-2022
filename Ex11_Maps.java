package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex11_Maps {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void creatingAnHashMap() {
        HashMap<String, Integer> nameWithAge = _____;

        assertEquals(________, nameWithAge.getClass().getName());
    }

    @Test
    void checkIfMapIsEmpty() {
        HashMap<String, Integer> nameWithAge = _____;

        assertTrue(______);
    }

    @Test
    void addingEntries() {
        HashMap<String, Integer> nameWithAge = new HashMap<>();
        nameWithAge.put("Oskar", _________);
        nameWithAge.put(________, _________);

        assertEquals(Map.of("Oskar", 6, "Birgit", 3), nameWithAge);
    }

    @Test
    void retrievingValues() {
        HashMap<String, Integer> nameWithAge = new HashMap<>();
        nameWithAge.put("Oskar", 6);
        nameWithAge.put("Birgit", 3);

        assertEquals(3, nameWithAge.get(________));
    }

    @Test
    void gettingAllKeys() {
        HashMap<String, Integer> nameWithAge = new HashMap<>();
        nameWithAge.put("Oskar", 6);
        nameWithAge.put("Birgit", 3);

        Set<String> keys = ___________;

        assertEquals(Set.of("Oskar", "Birgit"), keys);
    }

    @Test
    void checkIfMapContainsKey() {
        HashMap<String, Integer> nameWithAge = new HashMap<>();
        nameWithAge.put("Oskar", 6);
        nameWithAge.put("Birgit", 3);

        assertTrue(______);
        assertTrue(______);
        assertFalse(_______);
    }

    @Test
    void gettingAllValues() {
        HashMap<String, Integer> nameWithAge = new HashMap<>();
        nameWithAge.put("Oskar", 6);
        nameWithAge.put("Birgit", 3);

        Collection<Integer> values = nameWithAge.values();

        assertTrue(values.contains(_________));
        assertTrue(values.contains(_________));
    }

    @Test
    void updatingValue() {
        HashMap<String, Integer> nameWithAge = new HashMap<>();
        nameWithAge.put("Oskar", 6);
        nameWithAge.put("Birgit", 3);

        nameWithAge.put(________, nameWithAge.get("Oskar") + 1);

        assertEquals(7, nameWithAge.get("Oskar"));
    }

    @Test
    void valueOfaMapCanBeAnotherCollection() {
        HashMap<Integer, List<String>> ageWithNames = new HashMap<>();
        List<String> sixYearOlds = new ArrayList<>();
        sixYearOlds.add("Oskar");
        ageWithNames.put(6, sixYearOlds);
        List<String> threeYearOlds = new ArrayList<>();
        threeYearOlds.add("Birgit");
        threeYearOlds.add("Mammu");
        ageWithNames.put(3, threeYearOlds);

        ageWithNames.put(3, ____________);

        assertEquals(List.of("Birgit", "Mammu", "Leen"), ageWithNames.get(3));
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    private HashMap<String, Integer> _____;
    private boolean ______ = false;
    private boolean _______ = true;
    private String ________ = "";
    private Integer _________ = 1;
    private Set<String> ___________;
    private List<String> ____________;
}
