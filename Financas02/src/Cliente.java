
public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private double rendaMedia;

	//Construtor 1
	public Cliente() {
		this.nome = "";
		this.cpf = "";
		this.endereco = "";
		this.rendaMedia = 0.0;
	}
	
	//Construtor 2
	public Cliente(String nome, String cpf, String endereco, double rendaMedia) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rendaMedia = rendaMedia;
	}
	
	
	//Métodos de acesso
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRendaMedia() {
		return rendaMedia;
	}
	public void setRendaMedia(double rendaMedia) {
		this.rendaMedia = rendaMedia;
	}

	
}