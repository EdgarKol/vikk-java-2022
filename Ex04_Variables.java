package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex04_Variables {
    //  How to do deep dive:
    //  Step 1: Select the method name (youCanReadVariables on line 22) Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void youCanReadVariables() {
        int numberOfDesserts = 5;
        assertEquals(____, numberOfDesserts);
    }

    @Test
    void youCanSaveValuesInVariables() {
        int numberOfBrothers = ____;
        assertEquals(10, numberOfBrothers);
    }

    @Test
    void youCanDeclareVariablesAndAssignValuesLater() {
        int numberOfSisters;
        numberOfSisters = ____;
        assertEquals(1, numberOfSisters);
    }

    @Test
    void youCanDoMathWithVariables() {
        int ____ = 3 + 4;
        assertEquals(7, numberOfHarryPotterBooks);
    }

    @Test
    void youCanChangeVariables() {
        int milkTastiness = 6;
        addChocolate();
        milkTastiness = 10;
        assertEquals(milkTastiness, ____);
    }

    @Test
    void youCanAddToAVariable() {
        int age = 11;
        celebrateBirthday();
        age += ____;
        assertEquals(12, age);
    }

    @Test
    void youCanAddInMultipleWays() {
        int bakersDozen = 12;
        bakersDozen = bakersDozen + ____;
        assertEquals(13, bakersDozen);
    }

    @Test
    void youCanAddOneInOneMoreWay() {
        int bearsInACave = 3;
        andTheLittleOneSaid("I'm lonely, come back here");
        bearsInACave++;
        assertEquals(bearsInACave, ____);
    }

    @Test
    void youCanSubtractFromAVariable() {
        int amountOfHomework = 3;
        amountOfHomework -= ____;
        assertEquals(0, amountOfHomework);
    }

    @Test
    void youCanSubtractOneInOneMoreWay() {
        int bottlesOfBeerOnTheWall = 99;
        bottlesOfBeerOnTheWall--;
        assertEquals(____, bottlesOfBeerOnTheWall);
    }

    @Test
    void youCanMultiplyVariables() {
        int volumeOfMyVoice = 2;
        int volumeMyMomHears = volumeOfMyVoice * 5;
        assertEquals(____, volumeMyMomHears);
    }

    @Test
    void youCanDivideVariables() {
        int inches = 36;
        int feet = ____ / 12;
        assertEquals(3, feet);
    }

    @Test
    void variablesOnlyExistWithinTheMethod() {
        String xmasList = "bike";
        dreamBigger(); // This method is directly below
        assertEquals(xmasList, ___);
    }

    private void dreamBigger() {
        String xmasList = "skateboard";
    }

    @Test
    void methodsCanReturnValues() {
        String result = returnsString(); // This method is directly below
        assertEquals(result, ___);
    }

    String returnsString() {
        return "gum";
    }

    @Test
    void anotherMethodsCanReturnIntegerValues() {
        int result = returnsInteger(); // This method is directly below
        assertEquals(____, result);
    }

    int returnsInteger() {
        return 77;
    }

    @Test
    void javaProvidesClassesWithMethodsThatAlsoReturnIntegers() {
        int result = new Random().nextInt(________);
        assertFalse(result < 0, result + " is negative!");
        assertTrue(result < 11, result + " is larger than 10!");
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Remember how we get a random number here, you'll need this later.
    // </editor-fold>

    @Test
    void randomNextIntCanAlsoHaveLowerBound() {
        int result = new Random().nextInt(_____, ________);
        assertFalse(result < 3, result + " is less than 3!");
        assertTrue(result < 11, result + " is larger than 10!");
    }

    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    String ___ = "You need to fill in the blank ___";
    int ____ = 10000;
    int _____ = 12;
    int ________ = 500000;
    int numberOfHarryPotterBooks;

    String ___() {
        return ___;
    }

    private void addChocolate() {
    }

    private void celebrateBirthday() {
    }

    private void andTheLittleOneSaid(String string) {
    }
}
