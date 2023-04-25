package fatec.labbd.provalabbd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.labbd.provalabbd.entity.Trabalho;
import fatec.labbd.provalabbd.service.ITrabalhosService;

@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")
public class TrabalhoController {

    @Autowired
    public ITrabalhosService service;

    @GetMapping
    public List<Trabalho> buscarTodosTrabahos() {
        return service.buscarTodos();
    }

    @PostMapping
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho) {
        return service.novoTrabalho(trabalho);
    }

    @GetMapping(value = "/id/{trabalho}")
    public Trabalho buscarPorId(@PathVariable("trabalho") Long id) {
        return service.buscarPorId(id);
    }
    
}