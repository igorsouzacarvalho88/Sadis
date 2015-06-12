package test;

import universidade.Aluno;

public interface IAlunoDAO {

	public void addAluno(Aluno aluno);
	public void deleteAluno(String matricula);
	public void updateAluno(Aluno aluno);
	
	
}
