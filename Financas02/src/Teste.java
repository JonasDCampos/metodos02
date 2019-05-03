import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Conta conta = new Conta(cliente, -8);
		
		cliente.setCpf("145 637 066 98");
		cliente.setEndereco("Top top landy");
		cliente.setNome("Gordito");
		cliente.setRendaMedia(3);

		conta.setAgencia("Bradesco");
		conta.setNumero("7");
		conta.setTitular(cliente);
		
		JOptionPane.showMessageDialog(null, conta.identificar());
	}

}
