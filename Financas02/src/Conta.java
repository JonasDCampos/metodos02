
public class Conta {

	private String agencia;
	private String numero;
	private Cliente titular;
	private double saldo;
	
	//Construtor 1
	public Conta() {
		this.agencia = "";
		this.numero = "";
		this.titular = new Cliente();
		this.saldo = 0;
	}
	
	//Construtor 2
	public Conta(String agencia, String numero, Cliente titular, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Construtor 3
	public Conta(Cliente titular, double saldo) {
		this.agencia = "";
		this.numero = "";
		this.titular = titular;
		this.saldo = saldo;
	}

	//Métodos de acesso
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Idenfificar
	public String identificar(){
		String mensagem = "";
		
		if(this.getSaldo() == 0){
			mensagem = "Titular: " + this.titular.getNome() + "\nSaldo zero.";
		}else{
			if(this.getSaldo() > 0){
				mensagem = "Titular: " + this.titular.getNome() + "\nSaldo positivo.";
			}else{
				mensagem = "Titular: " + this.titular.getNome() + "\nSaldo negativo." + 
			"\n Você pode realizar um empréstimo de: " + this.titular.getRendaMedia()*3;
			}	
		}
		return mensagem;
		
	}
}
