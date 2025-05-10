import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double capacidadae = 20 * 1000;
        double perdaphr = 400;
        double ttempotot = 0;


        while (capacidadae > 0) {
            capacidadae -= perdaphr;
            ttempotot += 1;
        }

        JOptionPane.showMessageDialog(null,
                "O garrafão estará vazio em " + ttempotot + " horas.");
    }
}