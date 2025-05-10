import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int calculo,numero=0,soma=0,maior=0,menor=0;
        boolean primeiroValor = true;

        for (int i=0;i<500;i++){
            int valor=Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR"));
            soma+=valor;
            if (valor<0){
               JOptionPane.showMessageDialog(null,"digite um valor positivo");
            }else{
                if (primeiroValor) {
                    maior = valor;
                    menor = valor;
                    primeiroValor = false;
                } else {
                    if (valor > maior) {
                        maior = valor;
                    }

                    // Atualiza o menor valor
                    if (valor < menor) {
                        menor = valor;
                    }
            }

        }
        }Double media= (double) (soma/500);
        JOptionPane.showMessageDialog(null,"o maior valor é "+maior+"o menor valor é " +menor+"  a media é "+ media);

    }}
