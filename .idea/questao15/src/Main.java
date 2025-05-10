/*
algoritmo "DivisaoDaConta"
var
total, vc, va, vf: real
totalint: inteiro
        inicio
escreva("Digite o valor total da conta: R$")
leia(total)

totalint <- trunc(total / 3)

vc <- totalint
va <- totalint

vf <- total - (vc + va)

escreval("Carlos deve pagar: R$", vc)
escreval("André deve pagar: R$", va)
escreval("Felipe deve pagar: R$", vf)
fimalgoritmo
*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor total da conta:");
        double total = Double.parseDouble(input);

        int totalInteiro = (int) (total / 3);

        double vc = totalInteiro;
        double va = totalInteiro;

        double vf = total - (vc + va);

        String mensagem = "Carlos deve pagar: R$" + vc + "\n" +
                "André deve pagar: R$" + va + "\n" +
                "Felipe deve pagar: R$" + vf;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
        
