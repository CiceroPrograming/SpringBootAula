package com.br.aulaweb01.aulaweb01.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.aulaweb01.aulaweb01.Model.Aluno;

@Controller
public class AlunoController {

    List<Aluno> alunos = new ArrayList<>();

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public String lista(Aluno aluno) {
        int id = alunos.size() + 1;
        alunos.add(new Aluno(id, aluno.getNome(), aluno.getUsuario()));

        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView cadastro() {
        ModelAndView mv = new ModelAndView("lista");
        mv.addObject("Alunos", alunos);
        return mv;
    }

    @PostMapping("/excluir")
    public String excluir(int id) {

    }

}
