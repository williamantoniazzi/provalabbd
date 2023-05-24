package fatec.labbd.provalabbd.service;

import java.util.List;

import fatec.labbd.provalabbd.entity.Lancamento;

public interface ILancamentoService {

    public List<Lancamento> buscarTodos(); // Listar todos

   // public Trabalho buscarPorId(Long id); // Busca por ID
    
    public Lancamento novoLancamento(Lancamento lancamento); //Cadastro de item

}
