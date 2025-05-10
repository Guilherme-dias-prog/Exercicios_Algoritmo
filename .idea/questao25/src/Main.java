import javax.swing.JOptionPane;

/*
algoritmo "volCilindro"
var
   raio, altura, vol: real
inicio
   escreva("Digite o raio da caixa d'água (em metros): ")
   leia(raio)
   escreva("Digite a altura da caixa d'água (em metros): ")
   leia(altura)

   vol <- 3.14159 * (raio * raio) * altura

   escreval("O vol da caixa d'água é: ", vol:0:2, " metros cúbicos")
fimalgoritmo
* */
public class Main {
    public static void main(String[] args) {
        String sraio = JOptionPane.showInputDialog("Digite o raio da caixa d'água :");
        String saltura = JOptionPane.showInputDialog("Digite a altura da caixa d'água :");

        double raio = Double.parseDouble(sraio);
        double altura = Double.parseDouble(saltura);

        double vol = Math.PI * Math.pow(raio, 2) * altura;

        String mensagem = "O volume da caixa d'água é: " + String.format("%.2f", vol) + " metros cúbicos";
        JOptionPane.showMessageDialog(null, mensagem);
    
    }
}