package br.com.leo.repositories;

import br.com.leo.model.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoriy extends JpaRepository<person, Long> {


}
