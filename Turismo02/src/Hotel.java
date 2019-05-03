
public class Hotel {
	
	private String nome;
	private int diarias;
	private double valor;

	
	//Construtores
	public Hotel() {
		this.nome = "";
		this.diarias = 0;
		this.valor = 0;
	}
	
	public Hotel(String nome, int diarias, double valor) {
		this.nome = nome;
		this.diarias = diarias;
		this.valor = valor;
	}
	
	
	//Métodos de acesso
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	//Hospedagem
	public double totalHospedagem(){
		double valor = 0;
		
		valor = (this.diarias*this.valor);
		
		return valor;
	}
}