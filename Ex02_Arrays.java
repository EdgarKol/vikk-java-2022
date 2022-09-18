package ee.vikk.course;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex02_Arrays {
    //  How to do deep dive:
    //  Step 1: Select the method name (arraysAreInitializedWithFixedLength on line 18) Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void arraysAreInitializedWithFixedLength() {
        assertArrayEquals(new int[5], _______);
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Initialise an array with the same length.
    // </editor-fold>

    @Test
    void newArrayIsInitialisedWithDefaultValuesIntegers() {
        int[] array = new int[5];
        assertEquals(____, array[0]);
        assertEquals(____, array[1]);
        assertEquals(____, array[2]);
        assertEquals(____, array[3]);
        assertEquals(____, array[4]);
    }

    @Test
    void newArrayIsInitialisedWithDefaultValuesBooleans() {
        boolean[] array = new boolean[2];
        assertEquals(_____, array[0]);
        assertEquals(_____, array[1]);
    }

    @Test
    void accessingAnArrayOutsideOfItsBoundsThrowsException() {
        int[] array = new int[5];
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> assertEquals(0, array[____]))
                .withMessage("Index 5 out of bounds for length 5");
    }

    @Test
    void arraysCanBeInitializedWithValues() {
        int[] array = new int[]{____, ____};
        assertEquals(7, array[0]);
        assertEquals(3, array[1]);
    }

    @Test
    void arraysCanBeInitializedWithValuesWithShorterSyntaxToo() {
        int[] array = {____, ____};
        assertEquals(7, array[0]);
        assertEquals(3, array[1]);
    }

    @Test
    void settingValuesInsideAnArray() {
        int[] array = {3, 7};
        array[0] = ____;
        assertEquals(5, array[____]);
        array[1] = ____;
        assertEquals(8, array[____]);
    }

    @Test
    void arraysExposeTheirLength() {
        int[] array = {3, 7, 16};
        assertEquals(____, array.length);
    }

    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    int[] _______ = new int[1];
    int ____ = 1;
    boolean _____ = true;
}
