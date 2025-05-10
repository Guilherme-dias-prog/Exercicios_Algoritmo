import javax.swing.JOptionPane;

/*
algoritmo "CalculoSalario"
var
   hrsnormais, hrsext: real
   valrshrnorm, valrhrext, salario_bruto, salario_liquido, descont: real
inicio
   escreva("Digite as horas normais trabalhadas: ")
   leia(hrsnormais)
   escreva("Digite as horas extras trabalhadas: ")
   leia(hrsext)

   valrshrnorm <- 10.00
   valrhrext <- 15.00

   salario_bruto <- (hrsnormais * valrshrnorm) + (hrsext * valrhrext)

   descont <- salario_bruto * 0.10
   salario_liquido <- salario_bruto - descont

   escreval("Salário Bruto: R$", salario_bruto:0:2)
   escreval("Salário Líquido (com 10% de descont): R$", salario_liquido:0:2)
fimalgoritmo
* */
public class Main {
    public static void main(String[] args) {
        String shrnorm = JOptionPane.showInputDialog("Digite as horas normais trabalhadas:");
        String shrext = JOptionPane.showInputDialog("Digite as horas extras trabalhadas:");

        double horasNormais = Double.parseDouble(shrnorm);
        double horasExtras = Double.parseDouble(shrext);

        double valorhrnorm = 10.00;
        double valorhrext = 15.00;

        double salarioBruto = (horasNormais * valorhrnorm) + (horasExtras * valorhrext);

        double descont = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - descont;

        String mensagem = "Salário Bruto: R$" + String.format("%.2f", salarioBruto) + "\n" +
                "Salário Líquido (com 10% de descont): R$" + String.format("%.2f", salarioLiquido);
        JOptionPane.showMessageDialog(null, mensagem);

    }
}