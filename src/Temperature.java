import java.awt.Component;
import javax.swing.JOptionPane;

public class Temperature {
    public Temperature() {
    }

    public static void celsiusToFahrenheit(double degrees) {
        double fahrenheit = degrees * 9.0 / 5.0 + 32.0;
        JOptionPane.showMessageDialog(null, degrees + " °C are " + fahrenheit + " °F");
    }

    public static void celsiusToKelvin(double degrees) {
        double kelvin = degrees + 273.15;
        JOptionPane.showMessageDialog(null, degrees + " °C are " + kelvin + " K");
    }

    public static void fahrenheitToCelsius(double degrees) {
        double celsius = (degrees - 32.0) * 5.0 / 9.0;
        JOptionPane.showMessageDialog(null, degrees + " °F are " + celsius + " °C");
    }

    public static void kelvinToCelsius(double degrees) {
        double celsius = degrees - 273.15;
        JOptionPane.showMessageDialog(null, degrees + " K are " + celsius + " °C");
    }

    public static void kelvinToFahrenheit(double degrees) {
        double celsius = (degrees - 273.15) * 9.0 / 5.0 + 32.0;
        JOptionPane.showMessageDialog(null, degrees + " K are " + celsius + " °F");
    }

    public static void fahrenheitToKelvin(double degrees) {
        double celsius = (degrees - 32.0) * 5.0 / 9.0 + 273.15;
        JOptionPane.showMessageDialog(null, degrees + " °F are " + celsius + " K");
    }
}

