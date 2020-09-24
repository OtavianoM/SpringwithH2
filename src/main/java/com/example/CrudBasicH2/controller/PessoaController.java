package com.example.CrudBasicH2.controller;

import com.example.CrudBasicH2.repository.PessoaRepository;
import com.example.CrudBasicH2.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public Iterable<Pessoa> list(){
        return repository.findAll();
    }
}
