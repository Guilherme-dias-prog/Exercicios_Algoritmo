import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int voto;
        int votfir = 0;
        int voteu = 0;
        int votb = 0;
        int votn = 0;
        int toteleitor = 0;


        while (true) {
            String input = JOptionPane.showInputDialog(
                    "Digite o código do voto:\n" +
                            "1 - Firmino\n" +
                            "2 - Eugênia\n" +
                            "0 - Branco\n" +
                            "9 - Nulo\n" +
                            "-1 - Encerrar a votação"
            );
            voto = Integer.parseInt(input);

            if (voto == -1) {
                break;
            }

            switch (voto) {
                case 1:
                    votfir++;
                    break;
                case 2:
                    voteu++;
                    break;
                case 0:
                    votb++;
                    break;
                case 9:
                    votn++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código de voto inválido. Tente novamente.");
                    continue;
            }

            toteleitor++;
        }

        String vencedor;
        if (votfir > voteu) {
            vencedor = "Firmino";
        } else {
            vencedor = "Eugênia";
        }

        JOptionPane.showMessageDialog(null,
                "Resultado da eleição:\n" +
                        "a) Vencedor: " + vencedor + "\n" +
                        "b) Votos em branco: " + votb + "\n" +
                        "c) Votos nulos: " + votn + "\n" +
                        "d) Total de eleitores: " + toteleitor
        );

    }
}