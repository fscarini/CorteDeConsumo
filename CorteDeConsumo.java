import javax.swing.JOptionPane;

public class CorteDeConsumo{
    public static void main(String[] args) {
        int qntdapto, numapto, aptoconsumidor = 0;
        double m_cubico, litros, maiorgasto = 0.0;

        String input = JOptionPane.showInputDialog("Digite a quantidade de apartamentos:");
        qntdapto = Integer.parseInt(input);

        for (int N = 1; N <= qntdapto; N++) {
            input = JOptionPane.showInputDialog("Digite o número do apartamento:");
            numapto = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("Digite a quantidade gasta de água em Litros:");
            litros = Double.parseDouble(input);

            m_cubico = litros / 1000.0;
            JOptionPane.showMessageDialog(null, "O apartamento " + numapto + " gastou " + m_cubico + " m³.");

            if (N == 1 || maiorgasto < m_cubico) {
                aptoconsumidor = numapto;
                maiorgasto = m_cubico;
            }
        }

        JOptionPane.showMessageDialog(null, "O apartamento " + aptoconsumidor + " foi o que mais consumiu água, tendo consumido um total de: " + maiorgasto + " m³.");
    }
}