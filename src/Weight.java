import javax.swing.*;

public class Weight {

    public static void kiloToPound(double value){
        double pounds= value * 2.205;
        JOptionPane.showMessageDialog(null, value + " Kilograms are equivalent to " + pounds + " Pounds");
    }

    public static void poundToKilo(double value){
        double kilos= value / 2.205;
        JOptionPane.showMessageDialog(null, value + " Pounds are equivalent to " + kilos + " Kilograms");
    }
}
