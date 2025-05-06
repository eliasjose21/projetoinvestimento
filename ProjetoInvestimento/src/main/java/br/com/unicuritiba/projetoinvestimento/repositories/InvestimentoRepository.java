package br.com.unicuritiba.projetoinvestimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.projetoinvestimento.models.Investimento;

public interface InvestimentoRepository 
	extends JpaRepository<Investimento, Long>{

}
