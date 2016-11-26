package br.com.fean.service;

import java.util.List;

import br.com.fean.dto.DisciplinaDTO;
import br.com.fean.entity.Disciplina;

/**
 * @author giovana.cardoso
 *
 */
public interface DisciplinaService {

	List<DisciplinaDTO> buscarDisciplinas();

	Disciplina buscarDisciplina(Disciplina disciplina);

}
