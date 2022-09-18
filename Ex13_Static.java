package ee.vikk.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex13_Static {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void determineTheMaximumOfTwoNumbers() {
        int max = Math.max(7, 9);

        assertEquals(__________, max);
    }

    @Test
    void determineTheMinimumOfTwoNumbers() {
        double min = Math.min(5.5, _________);

        assertEquals(5.5, min);
    }

    @Test
    void roundingNumbers() {
        long result = Math.round(1.1);
        assertEquals(___________, result);
        result = Math.round(2.5);
        assertEquals(___________, result);
        result = Math.round(3.8);
        assertEquals(___________, result);

        double x = 1.1;
        int y = (int) x;
        assertEquals(__________, y);

        double a = 1.9;
        int b = (int) a;
        assertEquals(__________, b);
    }

    @Test
    void flooringNumbers() {
        double result = Math.floor(1.1);
        assertEquals(_________, result);
        result = Math.floor(2.5);
        assertEquals(_________, result);
        result = Math.floor(3.8);
        assertEquals(_________, result);
    }

    @Test
    void absoluteValueOfNumbers() {
        int result = Math.abs(-2);
        assertEquals(__________, result);
    }

    @Test
    void anAlternativeToRandomClass() {
        for (int i = 0; i < 1000; i++) {
            int result = (int) (Math.random() * 6);
            assertTrue(_________ <= result && result < __________);
        }
    }

    @Test
    void usingAStaticMethodInsteadOfConstructor() {
        Person person = _____________;
        assertEquals(24, person.getAge());
    }

    static class Person {
        private int age;

        private Person(int age) {
            this.age = age;
        }

        public static Person withAge(int age) {
            return new Person(age);
        }

        public int getAge() {
            return age;
        }
    }

    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    private final double _________ = 0.0;
    private final int __________ = 0;
    private final long ___________ = 0;
    private Person _____________;
}
