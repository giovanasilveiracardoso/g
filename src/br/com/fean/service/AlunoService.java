package br.com.fean.service;

import java.util.List;

import br.com.fean.dto.AlunoDTO;

/**
 * @author giovana.cardoso
 *
 */
public interface AlunoService {

	void cadastrarAluno(AlunoDTO alunoDTO);
	void alterarAluno(AlunoDTO alunoDTO);
	List<AlunoDTO> buscarAlunos();
	void removerAluno(AlunoDTO alunoDTO);
	AlunoDTO buscarAluno(AlunoDTO alunoDTO);

}
