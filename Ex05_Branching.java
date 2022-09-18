package ee.vikk.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex05_Branching {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void whereAreWe() {
        String classLocation = "";
        if (true) {
            classLocation = ___;
        }
        assertEquals("Viljandi", classLocation);
    }

    @Test
    void neverEverEver() {
        String dessert = "pudding";
        if (false) {
            dessert = "kohuke";
        }
        assertEquals(___, dessert);
    }

    @Test
    void notEverEverEver() {
        String dessert = "kohuke";
        if (!_____) {
            dessert = "ketchup";
        }
        assertEquals("kohuke", dessert);
    }

    @Test
    void isThePopeCatholic() {
        String pope = "";
        if (_____) {
            pope = "Catholic";
        }
        assertEquals("Catholic", pope);
    }

    @Test
    void trueOrFalse() {
        String animal = "cat";
        boolean elephant = _____;
        if (elephant) {
            animal = "flat " + animal;
        }
        assertEquals("flat cat", animal);
    }

    @Test
    void letSleepingBabiesLie() {
        String babySounds = "";
        boolean sleeping = ______;
        if (sleeping) {
            babySounds = "zzzzzzzzzzzz";
        } else {
            babySounds = "waaaaaahhh!";
        }
        assertEquals("waaaaaahhh!", babySounds);
    }

    @Test
    void howCoachThinks() {
        String coachSays = "try harder";
        int percentEffort = ____;
        if (percentEffort == 110) {
            coachSays = "good job";
        }
        assertEquals("good job", coachSays);
    }

    @Test
    void lessThan() {
        String modeOfTransportation = "";
        int age = ____;
        if (age < 18) {
            modeOfTransportation = "keep walking";
        } else {
            modeOfTransportation = "drive away";
        }
        assertEquals("keep walking", modeOfTransportation);
    }

    @Test
    void greaterThan() {
        String kidSays = "";
        int numberOfIceCreams = ____;
        if (numberOfIceCreams > 4) {
            kidSays = "I think I'm gonna barf";
        } else {
            kidSays = "More ice cream!";
        }
        assertEquals("I think I'm gonna barf", kidSays);
    }

    @Test
    void notEqual() {
        String playerSays = "";
        int cards = ____;
        if (cards != 52) {
            playerSays = "Not playing with a full deck!";
        } else {
            playerSays = "Game on!";
        }
        assertEquals("Game on!", playerSays);
    }

    @Test
    void equalsForStrings() {
        String knockKnock = "";
        String whosThere = ___;
        if (whosThere.equals("bananas")) {
            knockKnock = "Who's there?";
        } else if (whosThere.equals("orange")) {
            knockKnock = "Orange you glad I didn't say bananas?";
        }
        assertEquals("Who's there?", knockKnock);
    }

    @Test
    void thisAndThat() {
        String time = "";
        int score = ____;
        int years = ____;
        if (score == 4 && years == 7) {
            time = "Presidential";
        }
        assertEquals("Presidential", time);
    }

    @Test
    void theBeginningOrEnd() {
        String shoppingList = "";
        int age = ____;
        if (age <= 2 || 90 <= age) {
            shoppingList = "diapers";
        }
        assertEquals("diapers", shoppingList);
    }

    @Test
    void ifOnAutobahn() {
        String status = "";
        int speed = ____;
        if (speed <= 80) {
            status = "too slow";
        } else if (speed == 130) {
            status = "advisory speed limit";
        } else if (speed >= 130 && speed <= 250) {
            status = "fast";
        } else if (speed > 250) {
            status = "way too fast";
        } else {
            status = "somewhat slow";
        }
        assertEquals("fast", status);
    }

    @Test
    void nestedIfOrDogsBarking() {
        String status = "";
        String animal = "DOG";
        boolean isLarge = ______;
        if (animal.equalsIgnoreCase("dog")) {
            if (isLarge) {
                status = "Wuff Wuff";
            } else {
                status = "Wau Wau";
            }
        }
        assertEquals("Wau Wau", status);
    }

    // @formatter:off
    @Test
    void semicolonsMessUpIfStatements() {
        String dessert = "chocolate";
        if (false); {
            dessert = "ketchup";
        }
        assertEquals(___, dessert);
    }
    // @formatter:on

    @Test
    void forCompletenessThereIsAlsoDoWhileLoop() {
        int number = 7;
        int iterations = 0;
        do {
            iterations++;
            number += 2;
        } while (number < 12);
        assertEquals(________, number);
        assertEquals(________, iterations);
    }

    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    boolean _____ = false;
    boolean ______ = true;
    String ___ = "You need to fill in the blank ___";
    Integer ____ = null;
    int ________;

    String ___() {
        return ___;
    }
}
