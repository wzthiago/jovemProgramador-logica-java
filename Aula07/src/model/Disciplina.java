package model;

public class Disciplina {

	private int id;
	private String nomeDisciplina;
	private String profesor;
	private double horas;

	public Disciplina(int id, String nomeDisciplina, String profesor, double horas) {
		super();
		this.id = id;
		this.nomeDisciplina = nomeDisciplina;
		this.profesor = profesor;
		this.horas = horas;
	}

	public int getId() {
		return id;
	}

	public void setNome(int id) {
		this.id = id;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", profesor=" + profesor + ", horas=" + horas + "]";
	}

}
