import javax.swing.JOptionPane;
public class TesteVeiculo {

	public static void main(String[] args){

		double vel1= 
        Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade do veiculo 1?"));
        String modelo1 = JOptionPane.showInputDialog("Qual o modelo do veiculo 1?");

        double vel2= 
        Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade do veiculo 2?"));
        String modelo2 = JOptionPane.showInputDialog("Qual o modelo do veiculo 2?");

        Veiculo v1 = new Veiculo(vel1, modelo1);
		Veiculo v2 = new Veiculo(vel2, modelo2);

        v1.setVelocidade(vel1);
        v1.setModelo(modelo1);

        v2.setVelocidade(vel2);
        v2.setModelo(modelo2);

        v1.ré();
        v1.freio();

        v2.ré();
        v2.freio();

        JOptionPane.showMessageDialog(null, "v1: " + v1.getVelocidade() + ", " + v1.getModelo());

        JOptionPane.showMessageDialog(null, String.format(
            "v2: %.2f, %s",
            v2.getVelocidade(),
            v2.getModelo()
        ));

	}
}