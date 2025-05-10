import javax.swing.JOptionPane;

/*
algoritmo "GranjaFrangotech"
var
   quantfrangos: inteiro
   custo_chip, custoali, gasto_tot: real
inicio
   escreva("Digite a quantidade de frangos: ")
   leia(quantfrangos)

   custo_chip <- 4.00
   custoali <- 3.50

   gasto_tot <- quantfrangos * (custo_chip + (2 * custoali))

   escreval("Gasto total para marcar todos os frangos: R$", gasto_tot:0:2)
fimalgoritmo
*/
public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a quantidade de frangos:");
        int quantfrangos = Integer.parseInt(input);

        double custoChip = 4.00;
        double custoali = 3.50;


        double gastotot = quantfrangos * (custoChip + (2 * custoali));

        String mensagem = "Gasto total para marcar todos os frangos: R$" + String.format("%.2f", gastotot);
        JOptionPane.showMessageDialog(null, mensagem);

    }
}