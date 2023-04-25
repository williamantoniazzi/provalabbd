package fatec.labbd.provalabbd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.labbd.provalabbd.entity.Trabalho;
import fatec.labbd.provalabbd.repository.Trabalhos;

@Service
public class TrabalhosSevice {
    
    @Autowired
    private Trabalhos trabRepo;

    public Trabalho buscarPorId(Long id) {
        Optional<Trabalho> trabOp = trabRepo.findById(id);
        if(trabOp.isPresent()) {
            return trabOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public List<Trabalho> buscarTodos() {
        return trabRepo.findAll();
    }

    public Trabalho novoTrabalho(Trabalho trabalho) {
        if(trabalho == null ||
                trabalho.getId() == null ||
                trabalho.getTitulo() == null ||
                trabalho.getData_hora() == null ||
                trabalho.getDescricao() == null ||
                trabalho.getGrupo() == null ||
                trabalho.getNota() == null ||
                trabalho.getJustificativa() == null) {
            throw new IllegalArgumentException("Dados inválidos!");
        }
        return trabRepo.save(trabalho);
    }

}
