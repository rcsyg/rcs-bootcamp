package lv.accenture.bootcamp.ifaces.temperature;

public class TemperatureLauncher {

    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        FarenheitConverter farenheitConverter = new FarenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();
        System.out.println("Celsius degrees : " + celsiusConverter.convert(15));
        System.out.println("Farenheit degrees : " + farenheitConverter.convert(15));
        System.out.println("Kelvin degrees : " + kelvinConverter.convert(15));
    }

}
