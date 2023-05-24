package fatec.labbd.provalabbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fatec.labbd.provalabbd.entity.Lancamento;

public interface Lancamentos extends JpaRepository<Lancamento, Long>{
    
}
