package br.com.fean.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fean.dao.AlunoDAO;
import br.com.fean.dao.AlunoDAOImpl;
import br.com.fean.dto.AlunoDTO;
import br.com.fean.entity.Aluno;
import br.com.fean.entity.Disciplina;

/**
 * @author giovana.cardoso
 *
 */
@Service
public class AlunoServiceImpl implements AlunoService {

	private AlunoDAO alunoDAO;
	private DisciplinaService disciplinaService;
	
	public AlunoServiceImpl() {
		alunoDAO = new AlunoDAOImpl();
		disciplinaService = new DisciplinaServiceImpl();
	}
	
	@Override
	public void cadastrarAluno(AlunoDTO alunoDTO) {
		alunoDAO.cadastrarAluno(this.criarEntityAluno(alunoDTO));
	}

	@Override
	public void alterarAluno(AlunoDTO alunoDTO) {
		alunoDAO.alterarAluno(this.criarEntityAluno(alunoDTO));
	}
	
	@Override
	public List<AlunoDTO> buscarAlunos(){
		return this.creatyListDTOAluno(alunoDAO.buscarAlunos());
	}
	
	private List<AlunoDTO> creatyListDTOAluno(List<Aluno> alunos) {
		List<AlunoDTO> alunosDTO = new ArrayList<AlunoDTO>();
		
		for (Aluno aluno : alunos) {
			AlunoDTO alunoDTO = this.criarDTOAluno(aluno);
			
			alunosDTO.add(alunoDTO);
		}
		
		return alunosDTO;
	}

	private Aluno criarEntityAluno(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno();
		aluno.setCpf(alunoDTO.getCpf());
		aluno.setId(alunoDTO.getId());
		aluno.setIdade(alunoDTO.getIdade());
		aluno.setDataDeNascimento(alunoDTO.getDataDeNascimento());
		aluno.setNome(alunoDTO.getNome());
		
		Disciplina disciplina = new Disciplina();
		disciplina.setId(alunoDTO.getIdDisciplina());
		
		aluno.setDisciplina(disciplinaService.buscarDisciplina(disciplina));
		
		return aluno;
	}

	@Override
	public void removerAluno(AlunoDTO alunoDTO) {
		alunoDAO.removerAluno(new Aluno(alunoDTO.getId()));
	}
	
	@Override
	public AlunoDTO buscarAluno(AlunoDTO alunoDTO) {
		Aluno aluno = new Aluno(alunoDTO.getId());
		aluno = alunoDAO.buscarAluno(aluno);
		return this.criarDTOAluno(aluno);
	}

	private AlunoDTO criarDTOAluno(Aluno aluno) {
		AlunoDTO alunoDTO = new AlunoDTO();
		alunoDTO.setId(aluno.getId());
		alunoDTO.setNome(aluno.getNome());
		alunoDTO.setCpf(aluno.getCpf());
		alunoDTO.setIdade(aluno.getIdade());
		alunoDTO.setDataDeNascimento(aluno.getDataDeNascimento());
		alunoDTO.setIdDisciplina(aluno.getDisciplina().getId());
		alunoDTO.setNomeDisciplina(aluno.getDisciplina().getNome());
		
		return alunoDTO;
	}

}
