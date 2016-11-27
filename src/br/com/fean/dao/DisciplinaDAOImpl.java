package br.com.fean.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fean.entity.Disciplina;

/**
 * @author giovana.cardoso
 *
 */
@Repository
public class DisciplinaDAOImpl implements DisciplinaDAO {

	private static List<Disciplina> disciplinas;
	
	static {
		Disciplina disciplina = new Disciplina();
		disciplina.setId(1);
		disciplina.setNome("Estrutura de dados");
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setId(2);
		disciplina2.setNome("Banco de dados");
		
		disciplinas = new ArrayList<Disciplina>();
		disciplinas.add(disciplina);
		disciplinas.add(disciplina2);
	}
	
	@Override
	public List<Disciplina> buscarDisciplinas(){
		System.out.println("Buscados com Sucesso");
		return disciplinas;
	}
	
	@Override
	public Disciplina buscarDisciplina(Disciplina disciplina) {
		System.out.println("Buscada com Sucesso");
		return disciplinas.get(disciplinas.indexOf(disciplina));
	}
	
}
