import javax.swing.*;

public class ExchangeRate {



    public static void pesoToDollar(double value){
            double dollars=  value / 16.72;
            JOptionPane.showMessageDialog(null, value + " Mexican pesos are equivalent to " + dollars + " Dollars");
    }

    public static void dollarToPeso(double value){
        double peso= 16.72 * value;
        JOptionPane.showMessageDialog(null, value + " Dollars are equivalent to " + peso + " Mexican pesos");
    }

    public static void pesoToEuro(double value){
        double euro=  value / 18.80;
        JOptionPane.showMessageDialog(null, value + " Mexican pesos are equivalent to " + euro + " Euros");
        //JOptionPane.showConfirmDialog(null, "Would yoy like to continue?");
    }

    public static void euroToPeso(double value){
        double peso= 18.80 * value;
        JOptionPane.showMessageDialog(null, value + " Euros are equivalent to " + peso + " Mexican pesos");
    }

    public static void pesoToSterlingPounds(double value){
        double pound=  value / 21.87;
        JOptionPane.showMessageDialog(null, value + " Mexican pesos are equivalent to " + pound + " Sterling pounds");
        //JOptionPane.showConfirmDialog(null, "Would yoy like to continue?");
    }

    public static void sterlingPoundsToPeso(double value){
        double peso= 21.87 * value;
        JOptionPane.showMessageDialog(null, value + " Sterling pounds are equivalent to " + peso + " Mexican pesos");
    }

    public static void pesoToYen(double value){
        double yen=  value / 0.12;
        JOptionPane.showMessageDialog(null, value + " Mexican pesos are equivalent to " + yen + " Yens");
        //JOptionPane.showConfirmDialog(null, "Would yoy like to continue?");
    }

    public static void yenToPeso(double value){
        double peso= 21.87 * value;
        JOptionPane.showMessageDialog(null, value + " Yens are equivalent to " + peso + " Mexican pesos");
    }

    public static void pesoToWon(double value){
        double won=  value / 0.013;
        JOptionPane.showMessageDialog(null, value + " Mexican pesos are equivalent to " + won + " Wons");
        //JOptionPane.showConfirmDialog(null, "Would yoy like to continue?");
    }

    public static void wonToPeso(double value){
        double peso= Math.round(.013 * value);
        JOptionPane.showMessageDialog(null, value + " Wons are equivalent to " + peso + " Mexican pesos");
    }

}
