import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double capacidade = 20 * 1000;
        double vazao = 50;
        double temptot = 0;

        while (capacidade > 0) {
            capacidade -= vazao;
            temptot += 0.5;
        }

        JOptionPane.showMessageDialog(null,
                "O garrafão estará vazio em " + temptot + " horas.");
    }
}