package oo.alunosCursos;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Thiago");
		Aluno aluno2 = new Aluno("Aline");
		Aluno aluno3 = new Aluno("Jhonatan");
		Aluno aluno4 = new Aluno("Cassia");
		
		Curso curso1 = new Curso("Logica de Programação");
		Curso curso2 = new Curso("Programação Orientada a Objetos");
		Curso curso3 = new Curso("C++");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno4);
		
		aluno3.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso2);
		aluno1.adicionarCurso(curso2);
		
		System.out.println(curso1.obterListaDeAlunos());
		System.out.println(curso2.obterListaDeAlunos());
		System.out.println(curso3.obterListaDeAlunos());		
		
	}
}
