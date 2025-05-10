import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        long fib1 = 1;
        long fib2 = 1;
        String resultado = "Os 15 primeiros números de Fibonacci são:\n";


        resultado += fib1 + "\n" + fib2 + "\n";


        for (int i = 3; i <= n; i++) {
            long fibNext = fib1 + fib2;
            resultado += fibNext + "\n";

            fib1 = fib2;
            fib2 = fibNext;
        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}