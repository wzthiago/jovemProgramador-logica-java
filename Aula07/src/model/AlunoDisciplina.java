package model;

import java.sql.Date;
import java.util.List;

public class AlunoDisciplina {

	private int id;
	private Aluno aluno;
	private List<Disciplina> disciplina;
	private Date dataMatricula;

	public AlunoDisciplina(int id, Aluno aluno, List<Disciplina> disciplina, Date dataMatricula) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.dataMatricula = dataMatricula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	@Override
	public String toString() {
		return "AlunoDisciplina [id=" + id + ", aluno=" + aluno + ", disciplina=" + disciplina + ", dataMatricula="
				+ dataMatricula + "]";
	}

}