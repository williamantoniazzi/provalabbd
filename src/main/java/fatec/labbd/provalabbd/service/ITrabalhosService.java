package fatec.labbd.provalabbd.service;

import java.util.List;

import fatec.labbd.provalabbd.entity.Trabalho;

public interface ITrabalhosService {

    public List<Trabalho> buscarTodos(); // Listar todos

    public Trabalho buscarPorId(Long id); // Busca por ID
    
    public Trabalho novoTrabalho(Trabalho trabalho); //Cadastro de item

}