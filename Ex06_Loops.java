package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex06_Loops {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void combiningTextInALoop() {
        String sound = "A";
        for (int i = 1; i <= 3; i++) {
            sound += "H";
        }
        assertEquals(sound, ___);
    }

    @Test
    void forLoopsEndAtTheEnd() {
        String numbers = "# ";
        for (int i = 1; i <= ____; i++) {
            numbers += i;
            preventInfiniteLoops();
        }
        assertEquals("# 12345", numbers);
    }

    @Test
    void forLoopsCanStartAnywhere() {
        String answer = "Because ";
        for (int i = ____; i <= 9; i++) {
            answer += i;
            preventInfiniteLoops();
        }
        assertEquals("Because 789", answer);
    }

    @Test
    void forLoopsCanSkip() {
        String numbers = "# ";
        for (int i = 1; i <= 20; i += ____) {
            numbers = numbers + i + ",";
            preventInfiniteLoops();
        }
        assertEquals("# 1,3,5,7,9,11,13,15,17,19,", numbers);
    }

    @Test
    void forLoopsCanGoBackwards() {
        String numbers = "Countdown: ";
        for (int i = 9; i >= 1; i -= ____) {
            numbers += i;
            preventInfiniteLoops();
        }
        assertEquals("Countdown: 987654321", numbers);
    }

    @Test
    void forLoopsCanSkipUpAndDown() {
        String numbers = "# ";
        for (int i = 20; 0 < i && i <= 40; i -= ____) {
            numbers = numbers + i + ",";
            preventInfiniteLoops();
        }
        assertEquals("# 20,17,14,11,8,5,2,", numbers);
    }

    // @formatter:off
    @Test
    void semicolonsMessUpForLoops() {
        String sound = "A";
        for (int i = 1; i <= 13; i++); {
            sound += "H";
        }
        assertEquals(sound, ___);
    }
    // @formatter:on

    @Test
    void loopingThroughAnArray() {
        int[] numbers = {6, 8, 9, 9, 0, 8, 7, 4};
        int[] copy = new int[numbers.length];
        for (int i = 0; i < ____; i++) {
            copy[____] = numbers[____];
            preventInfiniteLoops();
        }

        assertArrayEquals(numbers, copy);
    }

    @Test
    void writeThisLoopYourself() {
        int[] numbers = {6, 8, 9, 9, 0, 8, 7, 4};
        int[] reversed = new int[numbers.length];

        // type numbers.fori and then hit tab

        assertArrayEquals(new int[]{4, 7, 8, 0, 9, 9, 8, 6}, reversed);
    }

    @Test
    void loopingThroughAnArrayEnhancedEdition() {
        int[] numbers = {6, 8, 9, 9, 0, 8, 7, 4};
        String result = "";

        for (int number : numbers) {
            result += ____;
        }

        assertEquals("68990874", result);
    }

    @Test
    void writeTheEnhancedLoopYourself() {
        int[] numbers = {6, 8, 9, 9, 0, 8, 7, 4};
        String result = "";

        // type numbers.for and then hit tab

        assertEquals("68990874", result);
    }

    @Test
    void useWhileWhenYouDontKnowYetHowOftenYouNeedToLoop() {
        Random random = new Random();
        boolean randomNumberWasSeven = false;
        while (!randomNumberWasSeven) {
            int randomNumber = random.nextInt(20);
            if (randomNumber == ________) {
                randomNumberWasSeven = _____;
            }
            preventInfiniteLoops();
        }

        assertTrue(randomNumberWasSeven);
    }

    @Test
    void leavingLoopsEarly() {
        String result = "";

        for (int i = 1; i <= 10; i++) {
            result += i;
            if (i == 5) {
                break;
            }
        }

        assertEquals(___, result);
    }

    @Test
    void stoppingTheIterationAndGoingBackToBeginningOfNextIteration() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            result += i;
        }
        assertEquals(____, result);
    }

    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    String ___ = "You need to fill in the blank ___";
    int ____ = 1;
    int ________ = -1;
    boolean _____ = false;
    int counter = 0;

    private void preventInfiniteLoops() {
        if (counter++ > 100) {
            throw new RuntimeException("You have created an infinite loop");
        }
    }
}
