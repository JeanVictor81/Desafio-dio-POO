package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Curso Java POO");
		curso.setDescricao("Curso de POO em JAVA");
		curso.setCargoHoraria(80);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Ajuda aula 4");
		mentoria.setDescricao("ajudando nas dificuldades dos alunos");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso);
		System.out.println(mentoria);
		
		
	}

}
