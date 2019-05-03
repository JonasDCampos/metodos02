import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Imovel imovel = new Imovel();
		
		cliente.setEmail("jonas@top.com");
		cliente.setNome("Zezé");
		cliente.setTelefone("19 98108 3791");
		
		
		imovel.setaVenda(true);
		imovel.setDisponivel(true);
		imovel.setEndereco("Top top landy");
		imovel.setProprietario(cliente);
		imovel.setValorAluguel(456);
		imovel.setValorImovel(75000);
		
		JOptionPane.showMessageDialog(null, imovel.identificar());
	}

}
