
public class Pacote {

	private String descricao;
	private Hotel hotel;
	private Itinerario itinerario;
	private double taxa;

	
	//Construtores
	public Pacote() {
		this.descricao = "";
		this.hotel = new Hotel();
		this.itinerario = new Itinerario();
		this.taxa = 0;
	}
	
	public Pacote(String descricao, Hotel hotel, Itinerario itinerario, double taxa) {
		this.descricao = descricao;
		this.hotel = hotel;
		this.itinerario = itinerario;
		this.taxa = taxa;
	}


	//Metodos de acesso
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Itinerario getItinerario() {
		return itinerario;
	}

	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	//Identificar
	public String identificar() {
		String mensagem = this.descricao + 
				"\nNome do hotel: " + this.hotel.getNome() + 
				"\nMeio de transporte: " + this.itinerario.getMeioTransporte();
		
		return mensagem;
	}
	
	
	//Total do pacote
	public String TotalPacote() {
		double total=0;
		String mensagem="";
		
		total = this.hotel.totalHospedagem() + this.itinerario.getValor() + this.taxa;
		
		mensagem="Valor total do pacote: "+ total;
		return mensagem;
	}
	
	
	//Valores do pacote
	public String valoresPacote() {
		double total=0;
		String mensagem="";
		
		total = this.hotel.totalHospedagem() + this.itinerario.getValor() + this.taxa;
		
		mensagem="Valor total do pacote: "+ total +
				"\n	Valor total da hospedagem: " + this.hotel.totalHospedagem() +
				"\n	Valor do itinerário: " + this.itinerario.getValor()+
				"\n	Valor das taxas: " + this.taxa;
		return mensagem;
	}
}