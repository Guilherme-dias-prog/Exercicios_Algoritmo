import javax.swing.JOptionPane;

/*
algoritmo "TonelRefresco"
var
   lrefresco, propagua, propsuco, lagua, lsuco: real
inicio
   escreva("Digite a quantidade de litros de refresco desejada: ")
   leia(lrefresco)

   propagua <- 8.0 / 10.0
   propsuco <- 2.0 / 10.0
   lagua <- lrefresco * propagua
   lsuco <- lrefresco * propsuco

   escreval("Para fazer ", lrefresco:0:2, " litros de refresco, são necessários:")
   escreval("Água: ", lagua:0:2, " litros")
   escreval("Suco: ", lsuco:0:2, " litros")
fimalgoritmo
*  */
public class Main {
    public static void main(String[] args) {
        String slitrosRefresco = JOptionPane.showInputDialog("Digite a quantidade de litros de refresco desejada:");
        double litrosRefresco = Double.parseDouble(slitrosRefresco);

        double proporcaoAgua = 8.0 / 10.0; 
        double proporcaoSuco = 2.0 / 10.0; 

        double litrosAgua = litrosRefresco * proporcaoAgua;
        double litrosSuco = litrosRefresco * proporcaoSuco;

        String mensagem = "Para fazer " + litrosRefresco + " litros de refresco, são necessários:\n" +
                "Água: " + String.format("%.2f", litrosAgua) + " litros\n" +
                "Suco: " + String.format("%.2f", litrosSuco) + " litros";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}