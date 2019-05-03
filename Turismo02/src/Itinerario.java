
public class Itinerario {

	private String meioTransporte;
	private String origemida;
	private String destinolda;
	private String origemVolta;
	private String DestinoVolta;
	private double valor;
	
	
	//Construtores
	public Itinerario() {
		this.meioTransporte = "";
		this.origemida = "";
		this.destinolda = "";
		this.origemVolta = "";
		DestinoVolta = "";
		this.valor = 0;
	}
	
	public Itinerario(String meioTransporte, String origemida, String destinolda, String origemVolta,
			String destinoVolta, double valor) {
		this.meioTransporte = meioTransporte;
		this.origemida = origemida;
		this.destinolda = destinolda;
		this.origemVolta = origemVolta;
		DestinoVolta = destinoVolta;
		this.valor = valor;
	}

	
	//Métodos de acesso
	public String getMeioTransporte() {
		return meioTransporte;
	}

	public void setMeioTransporte(String meioTransporte) {
		this.meioTransporte = meioTransporte;
	}

	public String getOrigemida() {
		return origemida;
	}

	public void setOrigemida(String origemida) {
		this.origemida = origemida;
	}

	public String getDestinolda() {
		return destinolda;
	}

	public void setDestinolda(String destinolda) {
		this.destinolda = destinolda;
	}

	public String getOrigemVolta() {
		return origemVolta;
	}

	public void setOrigemVolta(String origemVolta) {
		this.origemVolta = origemVolta;
	}

	public String getDestinoVolta() {
		return DestinoVolta;
	}

	public void setDestinoVolta(String destinoVolta) {
		DestinoVolta = destinoVolta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}