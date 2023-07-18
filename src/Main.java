import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {


        String options = JOptionPane.showInputDialog(null, "Select a conversion option", "Menu", -1, null, new Object[]{"Currency Converter", "Temperature Converter", "Weight Converter"}, "choose").toString();

        while (true) {

            try {

                if (options == "Temperature Converter") {
                    switch (JOptionPane.showInputDialog(null, "What type of conversion do you want to do?", "Menu", -1, null, new Object[]{"Celsius to Fahrenheit", "Celsius to Kelvin", "Fahrenheit to Celsius", "Kelvin to Celsius", "Kelvin to Fahrenheit", "Fahrenheit to Kelvin"}, "choose").toString()) {
                        case "Celsius to Fahrenheit" -> {
                            Temperature.celsiusToFahrenheit(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many Celsius degrees do you want to convert to Fahrenheit?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Program finished");
                            }
                        }
                        case "Celsius to Kelvin" -> {
                            Temperature.celsiusToKelvin(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many Celsius degrees do you want to convert to Kelvin?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Fahrenheit to Celsius" -> {
                            Temperature.fahrenheitToCelsius(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many Fahrenheit degrees do you want to convert to Celsius?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Kelvin to Celsius" -> {
                            Temperature.kelvinToCelsius(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many Kelvin do you want to convert to Celsius?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Kelvin to Fahrenheit" -> {
                            Temperature.kelvinToFahrenheit(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many Kelvin do you want to convert to Fahrenheit?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Fahrenheit to Kelvin" -> {
                            Temperature.fahrenheitToKelvin(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many Fahrenheit degrees do you want to convert to Kelvin?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                    }
                } else if (options == "Currency Converter") {
                    switch (JOptionPane.showInputDialog(null, "What type of currency exchange do you want to do?", "Menu", -1, null, new Object[]{"Mexican peso to Dollar", "Dollar to Mexican peso", "Mexican peso to Euro", "Euro to Mexican peso", "Mexican peso to Pound", "Pound to Mexican peso", "Mexican peso to Yen", "Yen to Mexican peso", "Mexican peso to Won", "Won to Mexican Peso"}, "Elegir").toString()) {
                        case "Mexican peso to Dollar" -> {
                            ExchangeRate.pesoToDollar(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many pesos do you want to convert to dollars?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Dollar to Mexican peso" -> {
                            ExchangeRate.dollarToPeso(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many dollars do you want to convert to mexican pesos?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Mexican peso to Euro" -> {
                            ExchangeRate.pesoToEuro(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many pesos do you want to convert to euros?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Euro to Mexican peso" -> {
                            ExchangeRate.euroToPeso(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many euros do you want to convert to mexican pesos?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Mexican peso to Sterling pounds" -> {
                            ExchangeRate.pesoToSterlingPounds(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many pesos do you want to convert to sterling pounds?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Sterling pounds to Mexican peso" -> {
                            ExchangeRate.sterlingPoundsToPeso(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many sterling pounds do you want to convert to mexican pesos?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Mexican peso to Yen" -> {
                            ExchangeRate.pesoToYen(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many pesos do you want to convert to yens?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Yen to Mexican peso" -> {
                            ExchangeRate.dollarToPeso(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many yens do you want to convert to mexican pesos?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Mexican peso to Won" -> {
                            ExchangeRate.pesoToWon(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many pesos do you want to convert to wons?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Won to Mexican Peso" -> {
                            ExchangeRate.wonToPeso(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many wons do you want to convert to mexican pesos?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                    }
                } else if (options == "Weight Converter") {
                    switch (JOptionPane.showInputDialog(null, "What type of weight conversion do you want to do?", "Menu", -1, null, new Object[]{"Kilos to pounds", "Pounds to kilos"}, "Elegir").toString()) {
                        case "Kilos to pounds" -> {
                            Weight.kiloToPound(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many kilos do you want to convert to pounds?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                        case "Pounds to kilos" -> {
                            Weight.poundToKilo(Double.parseDouble(String.valueOf(JOptionPane.showInputDialog("How many pounds do you want to convert to kilos?"))));
                            int response = JOptionPane.showConfirmDialog(null, "Would you like to do another conversion?");
                            if (JOptionPane.OK_OPTION == response) {
                                System.out.println("Enter");
                            } else {
                                JOptionPane.showMessageDialog(null, "Good Bye");
                            }
                        }
                    }
                }

            } catch (java.lang.NumberFormatException nfe ) {
                JOptionPane.showConfirmDialog(null, "Please enter a valid number");
            }


        }

    }
}

