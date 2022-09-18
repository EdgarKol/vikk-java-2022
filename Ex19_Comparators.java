package ee.vikk.course;


import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.IntBinaryOperator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Exercises to create comparators using lambda expressions
 * and using the Comparator combinators. Some exercises
 * use a Person class, which is a simple POJO containing a last
 * name, first name, and age, with the obvious constructors and
 * getters.
 */
public class Ex19_Comparators {

    final Person michael = new Person("Michael", "Jackson", 51);
    final Person rod = new Person("Rod", "Stewart", 71);
    final Person paul = new Person("Paul", "McCartney", 74);
    final Person mick = new Person("Mick", "Jagger", 73);
    final Person jermaine = new Person("Jermaine", "Jackson", 61);

    /**
     * Write a Comparator that compare instances of String using their length.
     * For instance FOUR (4 letters) is greater than TWO (three letters)
     */
    @Test
    public void comparator01() {
        Comparator<String> compareByLength = _________;

        assertTrue(compareByLength.compare("FOUR", "TWO") > 0);
        assertTrue(compareByLength.compare("ONE", "SEVEN") < 0);
        assertTrue(compareByLength.compare("ONE", "TWO") == 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Check the static factory methods of the Comparator interface. Remember
    // how you implemented functions in the previous exercises. Write it using
    // a method reference.
    // </editor-fold>

    /**
     * Write a Comparator that compare instances of String using their length.
     * If the lengths are the same, then use the alphabetical order.
     */
    @Test
    public void comparator02() {
        Comparator<String> compareByLengthThenAlphabetical = _________;

        assertTrue(compareByLengthThenAlphabetical.compare("FOUR", "TWO") > 0);
        assertTrue(compareByLengthThenAlphabetical.compare("ONE", "SEVEN") < 0);
        assertTrue(compareByLengthThenAlphabetical.compare("ONE", "TWO") < 0);
        assertTrue(compareByLengthThenAlphabetical.compare("FOUR", "FIVE") > 0);
        assertTrue(compareByLengthThenAlphabetical.compare("EIGHT", "EIGHT") == 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use the previous comparator and check the default methods of the
    // Comparator interface.
    // Check also the factory methods of the Comparator interface, and remember
    // that String is comparable.
    // </editor-fold>

    /**
     * Write a Comparator that compares instances of Person using their lastName.
     */
    @Test
    public void comparator03() {
        Comparator<Person> comparebyLastName = __________;

        assertTrue(comparebyLastName.compare(michael, rod) < 0);
        assertTrue(comparebyLastName.compare(paul, paul) == 0);
        assertTrue(comparebyLastName.compare(michael, jermaine) == 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Check the static factory methods of the Comparator interface. Remember
    // how you implemented functions in the previous exercises. Write it using
    // a method reference.
    // </editor-fold>

    /**
     * Write a Comparator that compares instances of Person using their
     * lastName, and if their last name is the same, uses their first name.
     */
    @Test
    public void comparator04() {
        Comparator<Person> comparebyLastNameThenFirstName = __________;

        assertTrue(comparebyLastNameThenFirstName.compare(michael, rod) < 0);
        assertTrue(comparebyLastNameThenFirstName.compare(paul, paul) == 0);
        assertTrue(comparebyLastNameThenFirstName.compare(michael, jermaine) > 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use the previous comparator and check the default methods of the Comparator interface.
    // </editor-fold>

    /**
     * Write a Comparator that compares the people in the order reversed from
     * the one you wrote in the comparator04() exercise. That is, the person
     * with the greater last name should be ordered first. If two persons have
     * the same last name, the one with the greater first name should be
     * ordered first.
     */
    @Test
    public void comparator05() {
        Comparator<Person> comparebyLastNameThenFirstNameReversed = __________;

        assertFalse(comparebyLastNameThenFirstNameReversed.compare(michael, rod) < 0);
        assertTrue(comparebyLastNameThenFirstNameReversed.compare(paul, paul) == 0);
        assertFalse(comparebyLastNameThenFirstNameReversed.compare(michael, jermaine) > 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use the previous comparator and check the default methods of the Comparator interface.
    // </editor-fold>

    /**
     * Write a Comparator that compares the people in the same order than the
     * one you wrote in comparator04(), but that supports null values. The null
     * values should be considered greater than any non-null values.
     */
    @Test
    public void comparator06() {
        Comparator<Person> comparebyLastNameThenFirstNameWithNull = __________;

        assertTrue(comparebyLastNameThenFirstNameWithNull.compare(michael, rod) < 0);
        assertTrue(comparebyLastNameThenFirstNameWithNull.compare(paul, paul) == 0);
        assertTrue(comparebyLastNameThenFirstNameWithNull.compare(michael, jermaine) > 0);
        assertTrue(comparebyLastNameThenFirstNameWithNull.compare(mick, null) < 0);
        assertTrue(comparebyLastNameThenFirstNameWithNull.compare(null, mick) > 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Use the previous comparator and check the static methods of the Comparator interface.
    // </editor-fold>

    /**
     * Write a Comparator that compares two people by age.
     * Try to write the comparator so as to avoid boxing of primitives.
     */
    @Test
    public void comparator07() {
        Comparator<Person> comparebyAge = __________;

        assertTrue(comparebyAge.compare(michael, rod) < 0);
        assertTrue(comparebyAge.compare(paul, paul) == 0);
        assertTrue(comparebyAge.compare(mick, jermaine) > 0);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Look for static methods on the Comparator interface that
    // have primitive specializations.
    // </editor-fold>


    private static class Person {

        private String lastName;
        private String firstName;
        private int age;

        public Person(String firstName, String lastName, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public int getAge() {
            return age;
        }
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    private int ______;
    private Comparator<String> _________;
    private Comparator<Person> __________;
    private IntBinaryOperator ________;
}
