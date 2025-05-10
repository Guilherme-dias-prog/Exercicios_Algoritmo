import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int calculo=1;
        int fatorial=Integer.parseInt(JOptionPane.showInputDialog("digite o valor do fatorial"));
        for(int i=fatorial;i>0;i=i-1){
                 calculo=i*calculo;
                 int outro=calculo;
        }JOptionPane.showMessageDialog(null,calculo);
    }
}