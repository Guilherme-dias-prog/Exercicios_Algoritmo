import javax.swing.JOptionPane;

/*
algoritmo "AlturaPredio"
var
   alturapessoa, sombrapessoa, sombrapredio, alturapredio: real
inicio
   escreva("Digite a sua altura (em metros): ")
   leia(alturapessoa)
   escreva("Digite o comprimento da sua sombra (em metros): ")
   leia(sombrapessoa)
   escreva("Digite o comprimento da sombra do prédio (em metros): ")
   leia(sombrapredio)

   alturapredio <- (alturapessoa * sombrapredio) / sombrapessoa

   escreval("A altura do prédio é: ", alturapredio:0:2, " metros")
fimalgoritmo
*/
public class Main {
    public static void main(String[] args) {
        String salturaPessoa = JOptionPane.showInputDialog("Digite a sua altura :");
        String ssombraPessoa = JOptionPane.showInputDialog("Digite o comprimento da sua sombra :");
        String ssombraPredio = JOptionPane.showInputDialog("Digite o comprimento da sombra do prédio :");

        double alturaPessoa = Double.parseDouble(salturaPessoa);
        double sombraPessoa = Double.parseDouble(ssombraPessoa);
        double sombraPredio = Double.parseDouble(ssombraPredio);

        double alturaPredio = (alturaPessoa * sombraPredio) / sombraPessoa;

        String mensagem = "A altura do prédio é: " + String.format("%.2f", alturaPredio) + " metros";
        JOptionPane.showMessageDialog(null, mensagem);

    }
}