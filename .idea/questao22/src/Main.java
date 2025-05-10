import javax.swing.JOptionPane;

/*
algoritmo "CofrinhoPedrinho"
var
   moedas1Cent, moedas5Cent, moedas10Cent, moedas25Cent, moedas50Cent, moedas1Real: inteiro
   valor1Cent, valor5Cent, valor10Cent, valor25Cent, valor50Cent, valor1Real, tot: real
inicio
   escreva("Digite a quantidade de moedas de 1 centavo: ")
   leia(moedas1Cent)
   escreva("Digite a quantidade de moedas de 5 centavos: ")
   leia(moedas5Cent)
   escreva("Digite a quantidade de moedas de 10 centavos: ")
   leia(moedas10Cent)
   escreva("Digite a quantidade de moedas de 25 centavos: ")
   leia(moedas25Cent)
   escreva("Digite a quantidade de moedas de 50 centavos: ")
   leia(moedas50Cent)
   escreva("Digite a quantidade de moedas de 1 real: ")
   leia(moedas1Real)

   valor1Cent <- 0.01
   valor5Cent <- 0.05
   valor10Cent <- 0.10
   valor25Cent <- 0.25
   valor50Cent <- 0.50
   valor1Real <- 1.00

   tot <- (moedas1Cent * valor1Cent) +
                       (moedas5Cent * valor5Cent) +
                       (moedas10Cent * valor10Cent) +
                       (moedas25Cent * valor25Cent) +
                       (moedas50Cent * valor50Cent) +
                       (moedas1Real * valor1Real)

   escreval("Total economizado: R$", tot:0:2)
fimalgoritmo
*/
public class Main {
    public static void main(String[] args) {
        String s1cent = JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 centavo:");
        String s5cent = JOptionPane.showInputDialog("Digite a quantidade de moedas de 5 centavos:");
        String s10cent = JOptionPane.showInputDialog("Digite a quantidade de moedas de 10 centavos:");
        String s25cent = JOptionPane.showInputDialog("Digite a quantidade de moedas de 25 centavos:");
        String s50cent = JOptionPane.showInputDialog("Digite a quantidade de moedas de 50 centavos:");
        String s1real = JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 real:");

        int moedas1Cent = Integer.parseInt(s1cent);
        int moedas5Cent = Integer.parseInt(s5cent);
        int moedas10Cent = Integer.parseInt(s10cent);
        int moedas25Cent = Integer.parseInt(s25cent);
        int moedas50Cent = Integer.parseInt(s50cent);
        int moedas1Real = Integer.parseInt(s1real);

        double valor1Cent = 0.01;
        double valor5Cent = 0.05;
        double valor10Cent = 0.10;
        double valor25Cent = 0.25;
        double valor50Cent = 0.50;
        double valor1Real = 1.00;

        double tot = (moedas1Cent * valor1Cent) +
                (moedas5Cent * valor5Cent) +
                (moedas10Cent * valor10Cent) +
                (moedas25Cent * valor25Cent) +
                (moedas50Cent * valor50Cent) +
                (moedas1Real * valor1Real);

        String mensagem = "Total economizado: R$" + String.format("%.2f", tot);
        JOptionPane.showMessageDialog(null, mensagem);

    }
}