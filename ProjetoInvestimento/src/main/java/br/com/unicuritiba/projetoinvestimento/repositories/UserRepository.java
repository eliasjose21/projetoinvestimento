package br.com.unicuritiba.projetoinvestimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.projetoinvestimento.models.User;

public interface UserRepository
        extends JpaRepository<User, Long>{

}
