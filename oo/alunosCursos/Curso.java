package oo.alunosCursos;

import java.util.ArrayList;

public class Curso {
	String nome;
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return this.nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	String obterListaDeAlunos() {
		String lista =  "Lista de alunos matriculados no curso " + this.nome + "\n";
		
		for(Aluno aluno: this.alunos) {
			lista += aluno.nome + "\n";
		}		
		return lista;
	}

}
