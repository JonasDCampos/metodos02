import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Itinerario iti= new Itinerario();
		Hotel hotel = new Hotel ("S�o Vicente", 4, 750);
		Pacote pacote = new Pacote("Viagem", hotel, iti, 200);
		
		//Atribui��o
		iti.setMeioTransporte("Avi�o Primeira Executivo");
		iti.setOrigemida("S�o Paulo");
		iti.setDestinoVolta("Fernando de Noronha");
		iti.setOrigemVolta("S�o Paulo");
		iti.setDestinoVolta("Buenos Aires");
		iti.setValor(20000);
		
		JOptionPane.showMessageDialog(null, pacote.identificar());
		JOptionPane.showMessageDialog(null, pacote.TotalPacote());
		JOptionPane.showMessageDialog(null, pacote.valoresPacote());
	}
}