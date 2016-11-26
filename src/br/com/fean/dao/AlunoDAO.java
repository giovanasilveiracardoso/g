package br.com.fean.dao;

import java.util.List;

import br.com.fean.entity.Aluno;

/**
 * @author giovana.cardoso
 *
 */
public interface AlunoDAO {

	void cadastrarAluno(Aluno aluno);
	void alterarAluno(Aluno aluno);
	List<Aluno> buscarAlunos();
	void removerAluno(Aluno aluno);
	Aluno buscarAluno(Aluno aluno);
	
}
