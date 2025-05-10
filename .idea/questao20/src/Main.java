import javax.swing.JOptionPane;

/*
 algoritmo "ConfeccaoBlusas"
var
   quantblusa, quantnovelos: inteiro
   noveloblusa: real
inicio
   escreva("Digite a quantidade de blusas produzidas: ")
   leia(quantblusa)
   escreva("Digite a quantidade de novelos gastos: ")
   leia(quantnovelos)

   noveloblusa <- quantnovelos / quantblusa

   escreval("Quantidade de novelos gastos por blusa: ", noveloblusa:0:2)
fimalgoritmo
 */
public class Main {
    public static void main(String[] args) {
        String sblusas = JOptionPane.showInputDialog("Digite a quantidade de blusas produzidas:");
        String snovelos = JOptionPane.showInputDialog("Digite a quantidade de novelos gastos:");

        int quantblusa = Integer.parseInt(sblusas);
        int quantnovelos = Integer.parseInt(snovelos);

        double noveloblusa = (double) quantnovelos / quantblusa;

        String mensagem = "Quantidade de novelos gastos por blusa: " + String.format("%.2f", noveloblusa);
        JOptionPane.showMessageDialog(null, mensagem);

    }
}