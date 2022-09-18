package ee.vikk.course;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex14_DateTime {
    //  How to do deep dive:
    //  Step 1: Select the method name, Press the Run Button
    //  Step 2: Read the name of the method that failed
    //  Step 3: Fill in the blank (___) to make it pass
    //  Step 4: Consider at least one thing you just learned
    //  Step 5: Advance to the next method
    //  Do not change anything except the blank (___)
    //
    @Test
    void gettingASpecificLocalDate() {
        LocalDate localDate = LocalDate.of(2019, 4, 18);

        String formatted = localDate.format(DateTimeFormatter.ISO_DATE);

        assertEquals(___________, formatted);
    }

    @Test
    void gettingTheCurrentLocalDate() {
        LocalDate now = LocalDate.now();

        assertEquals(LocalDate.of(2022, 9, 5), now);
    }

    @Test
    void parseLocalDateFromString() {
        LocalDate localDate = LocalDate.parse("2022-09-05");
        assertEquals(LocalDate.of(____________, ____________, ____________), localDate);
    }

    @Test
    void parseLocalDateFromStringInDifferentFormat() {
        LocalDate localDate = LocalDate.parse("2022/09/17", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        assertEquals(LocalDate.of(____________, ____________, ____________), localDate);
    }

    @Test
    void canAddDaysToLocalDate() {
        LocalDate localDate = LocalDate.parse("2022-09-05");

        LocalDate nextLesson = localDate.plusDays(11);

        assertEquals(LocalDate.of(2022, 9, ____________), nextLesson);
    }

    @Test
    void canAddWeeksToLocalDate() {
        LocalDate localDate = LocalDate.parse("2022-09-05");

        LocalDate nextLiveLesson = localDate.plusWeeks(4);

        assertEquals(LocalDate.of(2022, ____________, ____________), nextLiveLesson);
    }

    @Test
    void canAddMonthsToLocalDate() {
        LocalDate localDate = LocalDate.parse("2022-09-05");

        LocalDate nextLiveLesson = localDate.plusMonths(2);

        assertEquals(LocalDate.of(2022, ____________, 05), nextLiveLesson);
    }

    @Test
    void canAddDaysToLocalDateAnotherWay() {
        LocalDate localDate = LocalDate.parse("2022-09-05");

        LocalDate nextLesson = localDate.plus(10, ChronoUnit.DAYS);

        assertEquals(LocalDate.of(2022, 9, ____________), nextLesson);
    }

    @Test
    void canAlsoSubtractFromLocalDate() {
        LocalDate localDate = LocalDate.parse("2022-09-05");

        LocalDate nextLesson = localDate.minus(10, ChronoUnit.DAYS);

        assertEquals(LocalDate.of(2022, 8, ____________), nextLesson);
    }

    @Test
    void determineDayOfWeekForLocalDate() {
        DayOfWeek christmas = LocalDate.parse("2022-12-24").getDayOfWeek();

        assertEquals(__________, christmas);
    }

    @Test
    void relationShipBetweenDates() {
        LocalDate today = LocalDate.parse("2022-09-05");
        LocalDate nextLiveLesson = LocalDate.parse("2022-10-03");

        assertFalse(today.isBefore(nextLiveLesson));
        assertTrue(today.isAfter(nextLiveLesson));
    }

    @Test
    void fromLocalDateToLocalDateTime() {
        LocalDate localDate = LocalDate.parse("2022-09-05");

        LocalDateTime localDateTime = localDate.atStartOfDay();

        assertEquals(LocalDateTime.of(____________, Month.SEPTEMBER, 5, 0, 0, 0), localDateTime);
    }

    @Test
    void gettingTheCurrentDateAndTime() {
        LocalDateTime now = LocalDateTime.now();

        String formatted = now.format(DateTimeFormatter.ISO_DATE_TIME);

        assertEquals("2022-08-30T23:43:20.510543", formatted);
    }

    @Test
    void howManyDaysTilYourBirthdayUsingPeriod() {
        LocalDate myNextBirthDay = LocalDate.of(____________, ____________, ____________);

        Period period = Period.between(______________, myNextBirthDay);

        assertEquals(____________, period.getDays());
        assertEquals(____________, period.getMonths());
        assertEquals(____________, period.getYears());
    }

    @Test
    void howManyDaysTilYourBirthdayUsingDuration() {
        LocalDate myNextBirthDay = LocalDate.of(____________, ____________, ____________);

        Duration duration = Duration.between(______________, myNextBirthDay.atStartOfDay());

        assertEquals(____________, duration.toDays());
        assertEquals(____________, duration.toHours());
    }

    @Test
    void howManyDaysAgoWasChristmas() {
        LocalDate lastChristmas = LocalDate.of(2021, 12, 24);

        Duration duration = Duration.between(______________, ______________);

        assertEquals(255, duration.toDays());
    }

    /**
     * Ignore the following, it's needed to compile & run the exercises.
     */
    private LocalDate _____________;
    private LocalDate ______________ = LocalDate.of(2000, 1, 1);
    private int ____________ = 1;
    private String ___________;
    private DayOfWeek __________;
}
