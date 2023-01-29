package br.com.suprematech.controleequipamento.equipamento.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;

public interface EquipamentoMongoRepository extends MongoRepository<Equipamento, UUID>{
}