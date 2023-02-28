package br.com.suprematech.controleequipamento.servico.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.suprematech.controleequipamento.servico.domain.Servico;

public interface ServicoMongoRepository extends MongoRepository<Servico, UUID>{
}