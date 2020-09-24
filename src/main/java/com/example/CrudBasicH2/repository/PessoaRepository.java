package com.example.CrudBasicH2.repository;

import com.example.CrudBasicH2.entity.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
