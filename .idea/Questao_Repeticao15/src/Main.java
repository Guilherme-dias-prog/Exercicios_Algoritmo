import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cont = 0; 
        int num = 2;  
        String numPerfeitos = "";

        while (cont < 5) {
            if (ehnumPerfeito(num)) {
                numPerfeitos += num + "\n";
                cont++;
            }
            num++;
        }

       
        JOptionPane.showMessageDialog(null,
                "Os 5 primeiros números perfeitos são:\n" + numPerfeitos);
    }
    public static boolean ehnumPerfeito(int num) {
        int somaDivisores = 0;

       
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDivisores += i; 
            }
        }

       
        return somaDivisores == num;
    }

}
