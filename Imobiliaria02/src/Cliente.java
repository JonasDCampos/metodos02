
public class Cliente {
	
	private String nome;
	private String telefone;
	private String email;

		//Construtor 1
		public Cliente() {
		this.nome = "";
		this.telefone = "";
		this.email = "";
	}
	
		//Construtor 2
		public Cliente(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	//M�todos de acesso
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}	
}
