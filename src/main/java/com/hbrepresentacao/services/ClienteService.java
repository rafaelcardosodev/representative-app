package com.hbrepresentacao.services;

import com.hbrepresentacao.entities.Cliente;
import com.hbrepresentacao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    private List<Cliente> getAll() {
        return repository.findAll();
    }

    private Optional<Cliente> getById(Long id) {
        return repository.findById(id);
    }
}
