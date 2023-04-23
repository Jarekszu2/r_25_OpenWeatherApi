package openweather;

import openweather.model.Current;

public class Main {
    public static void main(String[] args) {

        Utilities utilities = new Utilities();

        System.out.println();

        // https://openweathermap.org/   Username:maniek_m  Email:jarekszu2@gmail.com   Password:maniekManiek

        // https://openweathermap.org/       GUIDE        Current state

        // Zadajemy użytkownikowi serię pytań o informacje pogodowe jakie chciały uzyskać.
        // Pytania:
        //      - typ pogody (obecna, dzisiejsza (przyszła godzinowa), na 16 dni)
        //      - parametry, które nas interesują (wiatr, temperatura... itd.)

        String requestPresent = "http://api.openweathermap.org/data/2.5/weather?q=Elblag,pl&appid=5b0c78974922cbe51c892b9e213ad59e&mode=xml&lang=pl&units=metric";
        Current current = utilities.getCurrentFromOpenWeatherApiXML(requestPresent);
//        System.out.println(current);

        if (current != null) {
            System.out.println("Miasto: " + current.getCity().getName()
                                + ", temperatura: " + current.getTemperature().getValue() + " " + current.getTemperature().getUnit()
                                + ", stan nieba: " + current.getClouds().getName() + ".");
        } else {
            System.err.println("Brak danych.");
        }
    }
}
