package com.joao.clientmanager.service;

import com.joao.clientmanager.dto.ClientRequest;
import com.joao.clientmanager.dto.ClientResponse;
import com.joao.clientmanager.exception.ClientNotFoundException;
import com.joao.clientmanager.repository.ClientRepository;
import com.joao.clientmanager.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    private Client toEntity(ClientRequest request) {
        return new Client(request.getName(), request.getCpf(), request.getEmail(), request.getPhone());
    }

    private ClientResponse toResponse(Client client){
        return new ClientResponse(client.getId(), client.getName(),  client.getCpf(), client.getEmail(), client.getPhone());
    }

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<ClientResponse> findAll() {
        return repository.findAll().stream().map(this::toResponse).toList();
    }

    public ClientResponse findById(Long id){
        return toResponse(repository.findById(id).orElseThrow(() -> new ClientNotFoundException(id)));
    }

    public ClientResponse save(ClientRequest request){
        return toResponse(repository.save(toEntity(request)));
    }

    public ClientResponse update(Long id, ClientRequest request){
        Client existing = repository.findById(id).orElseThrow(() -> new ClientNotFoundException(id));
        existing.setName(request.getName());
        existing.setCpf(request.getCpf());
        existing.setEmail(request.getEmail());
        existing.setPhone(request.getPhone());

        return toResponse(repository.save(existing));
    }

    public void delete(Long id){
        repository.findById(id).orElseThrow(() -> new ClientNotFoundException(id));
        repository.deleteById(id);
    }
}
