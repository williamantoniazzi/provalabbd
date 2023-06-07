package fatec.labbd.provalabbd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.labbd.provalabbd.entity.Consulta;
import fatec.labbd.provalabbd.service.IConsultaService;
    
    @RestController
    @CrossOrigin
    @RequestMapping(value = "/consulta")
    public class ConsultaController {
    
        @Autowired
        private IConsultaService service;
    
        @GetMapping
        public List<Consulta> buscarTodos() {
            return service.buscarTodos();
        }
    
        @PostMapping
        public Consulta novo(@RequestBody Consulta consulta) {
            return service.novo(consulta);
        }
    
    }
