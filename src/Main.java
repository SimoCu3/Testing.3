/*
CONSEGNA:
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
*/

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        System.out.println(dateLong("2023-03-01T13:00:00Z"));

        System.out.println(dateFull("2023-03-01T13:00:00Z"));

    }

    public static String dateLong(String s){
        ZonedDateTime date = OffsetDateTime.parse(s).atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        String dateString = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        return dateString;
    }

    public static String dateFull(String s){
        ZonedDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        String dateString = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return dateString;
    }
}