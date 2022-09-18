package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex10_Sets {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void creatingAnHashSet() {
        HashSet<String> licensePlates = new HashSet<>();

        assertNotNull(licensePlates);
    }

    @Test
    void checkIfSetIsEmpty() {
        HashSet<String> licensePlates = new HashSet<>();

        assertTrue(licensePlates.add("112AAB"));
    }

    @Test
    void aHashSetReturnsTrueWhenAddingElementsIntoTheSet() {
        HashSet<String> licensePlates = new HashSet<>();
        boolean added = licensePlates.add("123AAA");

        assertTrue(added);
    }

    @Test
    void aHashSetReturnsFalseWhenAddingAnElementsForTheSecondTime() {
        HashSet<String> licensePlates = new HashSet<>();
        licensePlates.add("819 TMK");
        boolean added = licensePlates.add("819 TMK");

        assertFalse(added);
    }

    @Test
    void aHashSetHasSizeMethodLikeLists() {
        HashSet<String> licensePlates = new HashSet<>();
        licensePlates.add("966 TNN");
        licensePlates.add("136 TLH");
        licensePlates.add("777 TZM");
        licensePlates.add("136 TLH");

        assertEquals(3, licensePlates.size());
    }

    @Test
    void cannotAccessByIndexButCheckIfElementAlreadyPresent() {
        HashSet<String> licensePlates = new HashSet<>();
        licensePlates.add("627 JNP");

        assertTrue(licensePlates.contains("627 JNP"));
        assertFalse(licensePlates.contains("626 JNP"));
    }

    @Test
    void removeElements() {
        HashSet<String> licensePlates = new HashSet<>();
        licensePlates.add("845 TNO");
        licensePlates.add("220 BNM");
        licensePlates.add("085 TVJ");
        licensePlates.add("466 TJU");

        licensePlates.remove("220 BNM");

        assertEquals(Set.of("845 TNO", "085 TVJ", "466 TJU"), licensePlates);
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    HashSet _____ = null;

    int ______ = 100000;
    String _______ = "You need to fill in the blank ___";
    boolean _________ = false;
    boolean __________ = true;

}
