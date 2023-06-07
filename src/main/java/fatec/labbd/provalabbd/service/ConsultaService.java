package fatec.labbd.provalabbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.labbd.provalabbd.entity.Consulta;
import fatec.labbd.provalabbd.repository.ConsultaRepository;

@Service
public class ConsultaService implements IConsultaService{
    
    @Autowired
    private ConsultaRepository consultaRepo;

    public List<Consulta> buscarTodos() {
        return consultaRepo.findAll();
    }

    public Consulta novo(Consulta consulta) {
        return consultaRepo.save(consulta);
    }
}
