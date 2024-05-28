package model;

public class Aluno {
	
	private int id;
	private String nome;
	private long matricula;
	private String email;
	
	public Aluno(int id, String nome, long matricula, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setNome(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + "]";
	}
	
}
