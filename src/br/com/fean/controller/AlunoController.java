package br.com.fean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.fean.dto.AlunoDTO;
import br.com.fean.service.AlunoService;
import br.com.fean.service.DisciplinaService;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private DisciplinaService disciplinaService;
	
	@RequestMapping(value="cadastrar-aluno")
	public ModelAndView telaAluno() {
		ModelAndView model = new ModelAndView("cadastroAluno");
		model.addObject("listaDisciplinas", disciplinaService.buscarDisciplinas());
		model.addObject("aluno", new AlunoDTO());
		
		return model;
	}
	
	@RequestMapping(value="cadastrar-aluno", method=RequestMethod.POST)
	public String cadastrarAluno(AlunoDTO alunoDTO) {
		alunoService.cadastrarAluno(alunoDTO);
		
		return "redirect:listar-alunos";
	}
	
	@RequestMapping(value="listar-alunos")
	public ModelAndView buscarAlunos(){
		ModelAndView model = new ModelAndView("listarAlunos");
		model.addObject("listaAlunos", alunoService.buscarAlunos());
		return model;
	}
	
	@RequestMapping("remover-aluno")
	public String removerAluno(AlunoDTO alunoDTO) {
		alunoService.removerAluno(alunoDTO);
		
		return "redirect:listar-alunos";
	}
	
	@RequestMapping("alterar-aluno")
	public ModelAndView telaAlterarAluno(AlunoDTO alunoDTO) {
		ModelAndView model = new ModelAndView("cadastroAluno");
		model.addObject("aluno", alunoService.buscarAluno(alunoDTO));
		model.addObject("listaDisciplinas", disciplinaService.buscarDisciplinas());
		
		return model;
	}
	
	@RequestMapping(value="alterar-aluno", method=RequestMethod.POST)
	public String alterarAluno(AlunoDTO alunoDTO) {
		alunoService.alterarAluno(alunoDTO);
		
		return "redirect:listar-alunos";
	}

}
