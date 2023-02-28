package br.com.suprematech.controleequipamento.cliente.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.suprematech.controleequipamento.cliente.domain.Cliente;

public interface ClienteMongoSpringRepository extends MongoRepository<Cliente, UUID>{
}