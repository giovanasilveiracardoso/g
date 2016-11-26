package br.com.fean.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fean.entity.Aluno;

/**
 * @author giovana.cardoso
 *
 */
public class AlunoDAOImpl implements AlunoDAO {

	private static List<Aluno> alunos;
	
	static {
		alunos = new ArrayList<Aluno>();
	}
	
	@Override
	public void cadastrarAluno(Aluno aluno) {
		AlunoDAOImpl.alunos.add(aluno);
		System.out.println("Criado com Sucesso");
	}

	@Override
	public void alterarAluno(Aluno aluno) {
		alunos.set(alunos.indexOf(aluno), aluno);
		System.out.println("Alterado com Sucesso");
	}
	
	@Override
	public Aluno buscarAluno(Aluno aluno) {
		System.out.println("Buscado com Sucesso");
		return alunos.get(alunos.indexOf(aluno));
	}
	
	@Override
	public List<Aluno> buscarAlunos(){
		System.out.println("Buscados com Sucesso");
		return alunos;
	}
	
	@Override
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
		System.out.println("Removido com Sucesso");
	}

}
