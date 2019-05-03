
public class Imovel {

	private Cliente proprietario ;
	private String endereco;
	private double valorImovel;
	private double valorAluguel;
	private boolean aVenda;
	private boolean disponivel;

	
	//Construtor
	public Imovel(){
		this.proprietario = new Cliente();
		this.endereco = "";
		this.valorImovel = 0;
		this.valorAluguel = 0;
		this.aVenda = false;
		this.disponivel = true;
	}
	
	//Métodos de acesso
	public Cliente getProprietario() {
		return proprietario;
	}
	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public boolean isaVenda() {
		return aVenda;
	}
	public void setaVenda(boolean aVenda) {
		this.aVenda = aVenda;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	//Identificar
	public String identificar() {
		String mensagem1 = this.isaVenda() ? "Sim" : "Não";
		String mensagem2 = this.isDisponivel() ? "Sim" : "Não";
		
		return "Nome do proprieário: " + this.proprietario.getNome() + "\nEstá à venda: " + mensagem1 + "\nEstá disponível: " + mensagem2;
	}
	
}