package ee.vikk.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class Ex12_Classes {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void allClassesHaveDefaultConstructor() {
        Phone phone = ____________;

        assertNotNull(phone);
    }

    // for now, ignore the static keyword before class
    static class Phone {
    }

    @Test
    void allClassesAreObjects() {
        Object phone = new Phone();

        assertEquals(________, phone instanceof Object);
    }

    @Test
    void methodsThatAllObjectsHave() {
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        assertEquals(__________, phone.hashCode());
        assertEquals(__________, phone2.hashCode());
        assertEquals(__________, phone3.hashCode());

        assertFalse(phone.equals(phone2));

        assertEquals(___________, phone.toString());

        assertEquals(___________, phone.getClass().getName());
        assertEquals(___________, phone.getClass().getCanonicalName());
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // Try the following too:
    // Create the phone class in a separate file instead of it being an inner class here.
    // You can also do this by putting the Cursor on Phone in line 29 and click F6.
    // This will move the class and Intellij asks you if it shall become a top level class.
    // </editor-fold>

    @Test
    void weCanOverwriteTheseMethods() {
        Tablet tablet = new Tablet();
        Tablet anotherTablet = new Tablet();

        assertEquals(___________, tablet.toString());
        assertEquals(___________, anotherTablet.toString());
    }

    static class Tablet {
        @Override
        public String toString() {
            return "a tablet";
        }
    }

    @Test
    void constructorsCanTakeParametersLikeMethods() {
        Car car = _____________;

        assertNotNull(car);
    }

    static class Car {

        public Car(String maker) {

        }
    }

    @Test
    void classesCanHaveMoreThanOneConstructor() {
        Student oskar = new Student("Oskar");
        Student birgit = new Student("Birgit", "Informatics");
        fail("remove this line once you ran the test and learnt something!");
    }

    static class Student {

        public Student(String name) {

        }

        public Student(String name, String program) {

        }
    }


    @Test
    void variablesWePassInConstructorAreUsuallyAssignedToFields() {
        Teacher teacher = new Teacher("Lars", "Eckart");

        assertEquals(___________, teacher.getFirstName());
        assertEquals(___________, teacher.getLastName());
    }

    static class Teacher {

        private final String firstName;
        private final String lastName;

        public Teacher(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    @Test
    void callingOneConstructorFromAnother() {
        Person birgit = new Person("Birgit");

        assertEquals(__________, birgit.getAge());
    }

    static class Person {

        private final String name;
        private final int age;

        public Person(String name) {
            this(name, 0);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    @Test
    void fieldsDontNeedToBeExposedThroughGetters() {
        Watch watch = new Watch("Casio", "G-Shock GA-100-1A1");

        assertEquals(___________, watch.description());
    }

    static class Watch {

        private final String maker;
        private final String model;

        public Watch(String maker, String model) {
            this.maker = maker;
            this.model = model;
        }

        public String description() {
            return "%s %s".formatted(maker, model);
        }
    }

    @Test
    void overwriteEqualsAndHashCodeWithTheHelpOfIntellij() {
        Dollar dollar = new Dollar(1);
        Dollar anotherDollar = new Dollar(1);
        Dollar againAnotherDollar = new Dollar(5);

        assertTrue(dollar.equals(anotherDollar));
        assertFalse(dollar.equals(againAnotherDollar));
        assertEquals(dollar.hashCode(), anotherDollar.hashCode());
        assertNotEquals(dollar.hashCode(), againAnotherDollar.hashCode());
    }


    static class Dollar {
        private final int cents;

        public Dollar(int cents) {
            this.cents = cents;
        }


        // use shortcut alt + insert on Windows?!
        // or from the menu on the top: Code -> Generate
    }

    /*
    Once you're done with this exercise, rewrite Pet to be an interface.
     */
    @Test
    void inheritance() {
        Pet pet = new Dog();
        Pet anotherPet = new Cat();

        assertEquals("Wuff Wuff", pet.makeNoise());
        assertEquals("Miau Miau", anotherPet.makeNoise());
    }

    static abstract class Pet {

        abstract String makeNoise();
    }

    static class Dog extends Pet {
        @Override
        String makeNoise() {
            return ___________;
        }
    }

    static class Cat extends Pet {
        @Override
        String makeNoise() {
            return ___________;
        }
    }


    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    private static String ___________ = "You need to fill in the blank ___";
    private int __________ = -99;
    private boolean ________ = false;
    private Phone ____________ = null;
    private Car _____________;

    private Class<Phone> _________;
}
