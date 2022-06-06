package com.bwoo.javaeight._06_localdatetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeObj {

    @Test
    void testLocalDateTime() {

        // LocalDateTime is better than the java.util.Date
        // We don't need to worry about Timezones.
        // To work with Timezone, use Instant.
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime ldtTomorrow = localDateTime.plusDays(1);

        String format = ldtTomorrow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format);
        System.out.println(ldtTomorrow.getYear());
    }

    @Test
    void testZoneDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
        System.out.println(zonedDateTime1);
    }

    @Test
    void testLocalDateOrTime() {
        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate: " + ld);

        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime: " + lt);
    }
}
