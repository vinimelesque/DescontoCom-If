
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {

        int litros;
        float precoA, precoG;
        double valortotal;
        double porcenA1 = 3;
        double porcenA2 = 5;
        double porcenG1 = 4;
        double porcenG2 = 6;
        String combustivel;
        String mensagem;

        combustivel = JOptionPane.showInputDialog("Escolha o combustível que deseja abastecer: \n \n A = Álcool (etanol) \n G = Gasolina");

        if (combustivel.equals("A")) {
            mensagem = JOptionPane.showInputDialog("Você irá abastecer com Álcool (etanol). \nQuantos litros você deseja colocar?");
            litros = Integer.parseInt(mensagem);

            if (litros <= 20) {
                valortotal = litros * (3.77 - (3.77 * (porcenA1 / 100)));
                JOptionPane.showMessageDialog(null, "Você abasteceu " + litros + " litros com Álcool.");
                JOptionPane.showMessageDialog(null, "O valor é R$" + valortotal);
            } else {
                valortotal = litros * (3.77 - (3.77 * (porcenA2 / 100)));
                JOptionPane.showMessageDialog(null, "O valor é R$" + valortotal);
            }
        }

        if (combustivel.equals("G")) {
            mensagem = JOptionPane.showInputDialog("Você irá abastecer com Gasolina \nQuantos litros você deseja colocar?");
            litros = Integer.parseInt(mensagem);

            JOptionPane.showMessageDialog(null, "Você abasteceu " + litros + " litros com Gasolina.");

            if (litros <= 20) {
                valortotal = (litros * (4.99 - (4.99 * (porcenG1 / 100))));
                JOptionPane.showMessageDialog(null, "O valor é R$" + valortotal);

            } else {
                valortotal = (litros * (4.99 - (4.99 * (porcenG2 / 100))));
                JOptionPane.showMessageDialog(null, "O valor é R$" + valortotal);
            }
        }
    }
}
