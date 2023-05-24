package fatec.labbd.provalabbd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.labbd.provalabbd.entity.Lancamento;
import fatec.labbd.provalabbd.repository.Lancamentos;
    
@Service
public class LancamentoSevice implements ILancamentoService {

    @Autowired
    private Lancamentos lancamentoRepo;

    public List<Lancamento> buscarTodos() {
        return lancamentoRepo.findAll();
    }

    public Lancamento novoLancamento(Lancamento lancamento) {
        return lancamentoRepo.save(lancamento);
    }
    
}
