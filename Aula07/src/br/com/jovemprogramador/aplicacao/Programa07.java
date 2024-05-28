package br.com.jovemprogramador.aplicacao;

import java.sql.Date;

import model.Consulta;
import model.Medico;
import model.Paciente;

public class Programa07 {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente(1, "Fabio", "123456");
		Medico medico = new Medico(1, "Roberto", "Geral");
		
		// COMPOSIÇÃO
		Consulta consulta = new Consulta(1, new Date(2024,05,24), "Rotina" , paciente , medico);
		
		System.out.println("Consulta Cadastrado");
		System.out.println("Data " + consulta.getData());
		System.out.println("Paciente: " + consulta.getPaciente().getNome());
		System.out.println("Médico: " + consulta.getMedico().getNome());
		

	}

}
