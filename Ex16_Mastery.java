package ee.vikk.course;

import org.junit.jupiter.api.Test;

class Ex16_Mastery {
    //  How to do deep dive, solving 1 test at the time:
    //  Step 1: Delete /* and */ at the beginning&end from a test.
    //  Step 2: Take care of the compilation errors. Alt+Enter should be able to always help you!
    //          It is okay if methods return wrong values for now, we care about compilation, not passing tests
    //  Step 3: Once it compiles, run the test.
    //  Step 4: Implement the methods so that the tests pass.
    //  Step 5: Consider at least one thing you just learned
    //  Step 6: Advance to the next test by moving the multi-line comment behind the next test.
    //
    // here multi line comment start
    @Test
    void locations() {
        /*
        double latitude = 58.380102;
        double longitude = 26.722512;
        Location location = new Location(latitude, longitude);

        assertEquals(58.380102, location.getLatitude());
        assertEquals(26.722512, location.getLongitude());
        */
    }

    @Test
    void contacts_name() {
        /*
        Contact contact = Contact.from("Lars", "Eckart", "lars.eckart@hey.com", "Tartu");

        assertEquals("Lars Eckart", contact.getName());
        */
    }

    @Test
    void contacts_email() {
        /*
        Contact contact = Contact.from("Lars", "Eckart", "lars.eckart@hey.com", "Tartu");

        assertEquals("lars.eckart@hey.com", contact.getEmail());
        assertEquals("hey.com", contact.getEmailProvider());
        */
    }

    @Test
    void contacts_email_alias() {
        /*
        Contact lars = Contact.from("Lars", "Eckart", "lars.eckart+vikk@hey.com", "Tartu");

        assertTrue(lars.hasEmailAlias());
        assertEquals("lars.eckart@hey.com", lars.getEmailWithoutAlias());


        Contact oskar = Contact.from("Oskar", "Eckart", "oskar.eckart@kids.com", "Tartu");

        assertFalse(oskar.hasEmailAlias());
        */
    }

    @Test
    void addressbook_search_by_town() {
        /*
        Addressbook addressbook = new Addressbook();
        Contact lars = Contact.from("Lars", "Eckart", "lars.eckart+vikk@hey.com", "Tartu");
        Contact oskar = Contact.from("Oskar", "Eckart", "oskar.eckart@kids.com", "Tartu");
        Contact kaja = Contact.from("Kaja", "Kallas", "kaja.kallas@riigikogu.ee", "Tallinn");

        addressbook.add(lars);
        addressbook.add(oskar);
        addressbook.add(kaja);

        assertEquals(List.of(lars, oskar, kaja), addressbook.contactsFrom("Ta"));
        assertEquals(List.of(lars, oskar, kaja), addressbook.contactsFrom("ta"));
        assertEquals(List.of(lars, oskar), addressbook.contactsFrom("tar"));
        */
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // For these assertions to pass, you will need to overwrite equals() in Contact class.
    // Again, Intellij can help you with this like in Ex12_Classes.
    // </editor-fold>

    @Test
    void address_book_search_by_name() {
        /*
        Addressbook addressbook = new Addressbook();
        Contact lars = Contact.from("Lars", "Eckart", "lars.eckart+vikk@hey.com", "Tartu");
        Contact liis = Contact.from("Liis", "Lemsalu", "liis.lemsalu@example.com", "Tallinn");
        Contact oskar = Contact.from("Oskar", "Eckart", "oskar.eckart@kids.com", "Tartu");

        addressbook.add(lars);
        addressbook.add(liis);
        addressbook.add(oskar);

        assertEquals(List.of(lars, liis), addressbook.contactsWithName("L"));
        */
    }

    @Test
    void chessboard() {
        /*
        Chessboard chessboard = new Chessboard();
        chessboard.place("Queen (white)", "D1");
        chessboard.place("Queen (black)", "D8");

        String column = "D";
        String row = "1";

        assertEquals("Queen (white)", chessboard.atLocation(column, row));
        */
    }

    @Test
    void isikukood_male() {
        /*
        Isikukood isikukood = Isikukood.from("38507221234");

        assertTrue(isikukood.isMale());
        assertFalse(isikukood.isFemale());
        */
    }

    @Test
    void isikukood_female() {
        /*
        Isikukood isikukood = Isikukood.from("61904151234");

        assertTrue(isikukood.isFemale());
        assertFalse(isikukood.isMale());
        */
    }

    @Test
    void isikukood_birthday() {
        /*
        Isikukood isikukood = Isikukood.from("38508061234");
        Isikukood anotherIsikukood = Isikukood.from("61904151234");

        assertEquals(LocalDate.of(1985, 8, 6), isikukood.getDateOfBirth());
        assertEquals(LocalDate.of(2019, 4, 15), anotherIsikukood.getDateOfBirth());
        */
    }

    @Test
    void isikukood_valid_checksum() {
        /*
        Isikukood isikukood = Isikukood.from("37605030299");
        assertEquals(9, isikukood.getKontrollnumber());
        */
    }
    // Hint:
    // <editor-fold defaultstate="collapsed">
    // I didn't fully understand everything at https://et.wikipedia.org/wiki/Isikukood#Kontrollnumber
    // but if you do, feel free to give it a try
    // </editor-fold>

    @Test
    void sideLengthsInCentimeters() {
        /*
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(10, 20);
        int radius = 4;
        Shape circle = new Circle(radius);

        assertEquals(100, square.area());
        assertEquals(200, rectangle.area());
        assertEquals(50.26, circle.area(),0.01 );
        */
    }
}
