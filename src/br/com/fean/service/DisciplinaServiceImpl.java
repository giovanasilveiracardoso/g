package br.com.fean.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fean.dao.DisciplinaDAO;
import br.com.fean.dao.DisciplinaDAOImpl;
import br.com.fean.dto.DisciplinaDTO;
import br.com.fean.entity.Disciplina;

/**
 * @author giovana.cardoso
 *
 */
@Service
public class DisciplinaServiceImpl implements DisciplinaService {

	private DisciplinaDAO disciplinaDAO;
	
	public DisciplinaServiceImpl() {
		disciplinaDAO = new DisciplinaDAOImpl();
	}
	
	@Override
	public List<DisciplinaDTO> buscarDisciplinas(){
		return this.creatyListDTODisciplina(disciplinaDAO.buscarDisciplinas());
	}
	
	private List<DisciplinaDTO> creatyListDTODisciplina(List<Disciplina> disciplinas) {
		List<DisciplinaDTO> disciplinasDTO = new ArrayList<DisciplinaDTO>();
		
		for (Disciplina disciplina : disciplinas) {
			DisciplinaDTO disciplinaDTO = this.criarDTODisciplina(disciplina);
			
			disciplinasDTO.add(disciplinaDTO);
		}
		
		return disciplinasDTO;
	}

	private DisciplinaDTO criarDTODisciplina(Disciplina disciplina) {
		DisciplinaDTO disciplinaDTO = new DisciplinaDTO();
		disciplinaDTO.setId(disciplina.getId());
		disciplinaDTO.setNome(disciplina.getNome());
		
		return disciplinaDTO;
	}

	@Override
	public Disciplina buscarDisciplina(Disciplina disciplina) {
		return disciplinaDAO.buscarDisciplina(disciplina);
	}

}
