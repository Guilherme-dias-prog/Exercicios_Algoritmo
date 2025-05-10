import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String resultado = "";
        int contador = 0;

        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                resultado += i + "\n";
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Números entre 1000 e 1999 que divididos por 11 dão resto 5:\n" +
                        "Total de números encontrados: " + contador + "\n\n" +
                        resultado);

    }
}