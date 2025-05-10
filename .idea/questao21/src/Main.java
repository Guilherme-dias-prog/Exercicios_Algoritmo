import javax.swing.JOptionPane;

/*
algoritmo "FabricaRefrigerantes"
var
   quantlata, quantgarrafa600, quantgarrafa2L: inteiro
   taamanholata, taamanhogarrafa600, taamanhogarrafa2L, totlitros: real
inicio
   escreva("Digite a quantidade de latas de 350 ml: ")
   leia(quantlata)
   escreva("Digite a quantidade de garrafas de 600 ml: ")
   leia(quantgarrafa600)
   escreva("Digite a quantidade de garrafas de 2 litros: ")
   leia(quantgarrafa2L)

   taamanholata <- 0.350
   taamanhogarrafa600 <- 0.600
   taamanhogarrafa2L <- 2.0

   totlitros <- (quantlata * taamanholata) +
                   (quantgarrafa600 * taamanhogarrafa600) +
                   (quantgarrafa2L * taamanhogarrafa2L)

   escreval("Total de litros comprados: ", totlitros:0:2, " litros")
fimalgoritmo
*/
public class Main {
    public static void main(String[] args) {
        String slata = JOptionPane.showInputDialog("Digite a quantidade de latas de 350 ml:");
        String sgarrafa600 = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 600 ml:");
        String sgarrafa2L = JOptionPane.showInputDialog("Digite a quantidade de garrafas de 2 litros:");

        int quantlata = Integer.parseInt(slata);
        int quantgarrafa600 = Integer.parseInt(sgarrafa600);
        int quantgarrafa2L = Integer.parseInt(sgarrafa2L);

        double tamanhoLata = 0.350;
        double tamanhoGarrafa600 = 0.600;
        double tamanhoGarrafa2L = 2.0;

        double totlitros = (quantlata * tamanhoLata) +
                (quantgarrafa600 * tamanhoGarrafa600) +
                (quantgarrafa2L * tamanhoGarrafa2L);

        String mensagem = "Total de litros comprados: " + String.format("%.2f", totlitros) + " litros";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}