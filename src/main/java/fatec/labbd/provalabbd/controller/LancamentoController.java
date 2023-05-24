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

import fatec.labbd.provalabbd.entity.Lancamento;
import fatec.labbd.provalabbd.service.ILancamentoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/facalancamento")
public class LancamentoController {

    @Autowired
    private ILancamentoService service;

    @GetMapping
    public List<Lancamento> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping
    public Lancamento novoLancamento(@RequestBody Lancamento lancamento) {
        return service.novoLancamento(lancamento);
    }
    
}
