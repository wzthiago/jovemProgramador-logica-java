package br.com.jovemprogramador.aplicacao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.AlunoDisciplina;
import model.Disciplina;

public class ProgramaExercicioPoo {

	public static void main(String[] args) {

		List<Disciplina> lista = new ArrayList<>();

		Aluno aluno = new Aluno(01, "José dos Santos", 00001, "js@email.com");
		Disciplina disciplina = new Disciplina(01, "Programação Java", "Rogério", 320);

		Disciplina disciplina1 = new Disciplina(02, "Programação Java", "Rogério", 320);
		Disciplina disciplina2 = new Disciplina(03, "Teste", "Nazareno", 220);
		Disciplina disciplina3 = new Disciplina(04, "Projeto Integrado", "Rogério", 120);

		lista.add(disciplina);
		lista.add(disciplina1);
		lista.add(disciplina2);
		lista.add(disciplina3);

		AlunoDisciplina aluno_disciplina = new AlunoDisciplina(01, aluno, lista, new Date(2024, 05, 24));

		System.out.println("Cadastro de Disciplinas");
		System.out.println("Aluno: " + aluno_disciplina.getAluno().getNome());
		System.out.println("Disciplina: " + aluno_disciplina.getAluno().getNome());
		System.out.println("Horas: " + aluno_disciplina.getDisciplina().get(0).getHoras());
		System.out.println("Data: " + aluno_disciplina.getDataMatricula());

		for (Disciplina disciplinas : lista) {
			System.out.println("Disciplina: " + disciplinas);

		}

	}

}
