package modelo;

public class Usuario {
	
	private int id;
	
	private String nome;
	
	private String senha;
	
	private String email;
	
	private String telefone;
	
	private int qtdadeXp;
	
	public void printUser(Usuario user) {
		System.out.println("Nome do usuário: " + user.getNome());
		System.out.println("Email cadastrado: " + user.getEmail());
		System.out.println("Telefone: " + user.getTelefone());
		System.out.println("Quantidade de XP: " + user.getQtdadeXp());
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
	 this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
	 this.nome = nome;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
	 this.senha = senha;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
	 this.email = email;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
	 this.telefone = telefone;
	}
	
	public int getQtdadeXp() {
		return this.qtdadeXp;
	}
	
	public void setQtadeXp(int qtdadeXp) {
	 this.qtdadeXp = qtdadeXp;
	}
}
