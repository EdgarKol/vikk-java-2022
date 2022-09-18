package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Ex15_Exceptions {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void someMethodsAreRiskyAndLetYouKnowAboutIt() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/main/resources/" + _____));

        assertEquals("From fairest creatures we desire increase,", lines.get(0));
    }

    @Test
    void butSomeMethodsCanBeRiskyAndDontTellYou() {
        ArrayList<Integer> numbers = new ArrayList<>();

        assertEquals(0, numbers.get(6));
    }

    @Test
    void aThrownExceptionDoesNotHaveToCrashYourProgramBecauseYouCanCatchIt() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/" + _____));
            assertEquals("From fairest creatures we desire increase,", lines.get(0));
        } catch (NoSuchFileException e) {
            assertEquals(________________, e.getMessage());
            assertEquals(________________, e.getClass().getName());
        } catch (IOException e) {
            assertEquals(________________, e.getClass().getName());
        }
    }

    @Test
    void codeYouWriteCanAlsoThrowExceptionsIfYouWant() {
        try {
            Person person = new Person();
            person.setAge(___);
            fail("You should set an age that causes the method to throw the exception");
        } catch (IllegalArgumentException e) {
            assertEquals(__________________, e.getMessage());
        }
    }

    static class Person {
        public int age;

        private void setAge(int age) {
            if (age < 0 || 120 < age) {
                throw new IllegalArgumentException(age + " is not a valid age");
            }
        }
    }

    @Test
    void exceptionsShouldExplainPreconditions() throws Exception {
        Game game = new Game();
        /* Add needed line here */
        int result = game.play();
        assertEquals(11, result);
    }

    @Test
    void youCanRethrowExceptionsAsAnotherException() {
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> baking())
                .withMessage("Oops, something went wrong.")
                .withCauseInstanceOf(BakingException.class);
    }

    private void baking() {
        turnOvenOn();
        try {
            bake();
        } catch (BakingException e) {
            // throw an IllegalStateException here, with a custom message
        }
    }

    @Test
    void useFinallyToPutCodeThatMustRunRegardlessOfAnException() {
        try {
            turnOvenOn();
            bake();
        } catch (BakingException e) {
            System.out.println("Oh no, something went wrong. Don't forget to turn off the oven!");
            throw new RuntimeException(e);
        }
        turnOvenOff();
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // This test will always fail, but look at the console output and check if the oven is turned off.
    // </editor-fold>

    private void bake() throws BakingException {
        throw new BakingException();
    }

    static class BakingException extends Exception {
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    String _____ = "SonnetI.tx";
    String ________________ = "what does the exception tell you?";
    String __________________ = "You need to fill in the blank ___";
    int ___ = 9000;


    private void turnOvenOn() {
        System.out.println("turning oven on");
    }

    private void turnOvenOff() {
        System.out.println("turning oven off");
    }

    private static class Game {
        boolean on = false;

        public void turnOn() {
            on = true;
        }

        public int play() {
            if (!on) {
                throw new GamingException("Before you can play a game you need to turn it on.\n game.turnOn()");
            }
            return 11;
        }
    }

    private static class GamingException extends RuntimeException {

        public GamingException(String string, Object... params) {
            super(String.format(string, params));
        }
    }
}
