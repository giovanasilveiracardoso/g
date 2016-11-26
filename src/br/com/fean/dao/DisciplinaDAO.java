package br.com.fean.dao;

import java.util.List;

import br.com.fean.entity.Disciplina;

/**
 * @author giovana.cardoso
 *
 */
public interface DisciplinaDAO {

	List<Disciplina> buscarDisciplinas();
	Disciplina buscarDisciplina(Disciplina disciplina);
	
}
