package br.com.fean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author giovana.cardoso
 */
@Controller
@RequestMapping("/")
public class InitController {

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage() {
        return "redirect:aluno/listar-alunos";
    }
	
}
