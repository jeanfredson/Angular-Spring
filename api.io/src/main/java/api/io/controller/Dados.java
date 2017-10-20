package api.io.controller;

public class Dados {

	private int id;
	private String nome;
	private String idade;

	public Dados() {

	}

	public Dados(int id, String nome, String idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	

}
