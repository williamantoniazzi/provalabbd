package fatec.labbd.provalabbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fatec.labbd.provalabbd.entity.Trabalho;

@Repository
public interface Trabalhos extends JpaRepository<Trabalho, Long>{
    
}
