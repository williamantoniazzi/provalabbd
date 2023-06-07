package fatec.labbd.provalabbd.service;

import java.util.List;

import fatec.labbd.provalabbd.entity.Consulta;

public interface IConsultaService {
    
    public List<Consulta> buscarTodos();

    public Consulta novo(Consulta consulta);
}
