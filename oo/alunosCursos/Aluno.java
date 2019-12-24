package oo.alunosCursos;

import java.util.ArrayList;

public class Aluno {
	String nome;
	ArrayList<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;		
	}
	
	public String toString() {
		return this.nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

}
