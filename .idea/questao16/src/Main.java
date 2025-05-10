/*
algoritmo "CalculoIngredientesSanduiche"
var
   quantsanduiches: inteiro
   pq, pp, ph: real
inicio
   escreva("Digite a quantidade de sanduíches a fazer: ")
   leia(quantsanduiches)

   pq <- quantsanduiches * 2 * 50     
   pp <- quantsanduiches * 1 * 50   
   ph <- quantsanduiches * 1 * 100 

   pq <- pq / 1000
   pp <- pp / 1000
   ph <- ph / 1000

   escreval("Quantidade de queijo necessário: ", pq:0:2, " kg")
   escreval("Quantidade de presunto necessário: ", pp:0:2, " kg")
   escreval("Quantidade de hambúrguer necessário: ", ph:0:2, " kg")
fimalgoritmo*/
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a quantidade de sanduíches a fazer:");
        int quantsanduiches = Integer.parseInt(input);

        double pq = quantsanduiches * 2 * 50;    
        double pp = quantsanduiches * 1 * 50;  
        double ph = quantsanduiches * 1 * 100; 

        pq /= 1000;
        pp /= 1000;
        ph /= 1000;

        String mensagem = "Quantidade de queijo necessário: " + String.format("%.2f", pq) + " kg\n" +
                "Quantidade de presunto necessário: " + String.format("%.2f", pp) + " kg\n" +
                "Quantidade de hambúrguer necessário: " + String.format("%.2f", ph) + " kg";
        JOptionPane.showMessageDialog(null, mensagem);

    }
}