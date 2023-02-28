package br.com.suprematech.controleequipamento.equipamento.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.suprematech.controleequipamento.equipamento.application.repository.EquipamentoRepository;
import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;
import br.com.suprematech.controleequipamento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class EquipamentoInfraMongoRepository implements EquipamentoRepository {
	private final EquipamentoMongoRepository equipamentoMongoRepository;

	@Override
	public Equipamento salvaEquipamento(Equipamento equipamento) {
		log.info("[inicia] EquipamentoInfraRepository - salvaEquipamento");
		try {
			equipamentoMongoRepository.save(equipamento);
		} catch (DataIntegrityViolationException e) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "Equipamento já cadastrado", e);
		}
		log.info("[finaliza] EquipamentoInfraRepository - salvaEquipamento");
		return equipamento;
	}

	@Override
	public List<Equipamento> buscarTodosEquipamentos() {
		log.info("[inicia] EquipamentoInfraMongoRepository - buscarTodosEquipamentos");
		List<Equipamento> todosEquipamentos = equipamentoMongoRepository.findAll();
		log.info("[finaliza] EquipamentoInfraMongoRepository - buscarTodosEquipamentos");
		return todosEquipamentos;
	}
	
	@Override
	public void deletaEquipamento(Equipamento equipamento) {
		log.info("[inicia] EquipamentoInfraMongoRepository - deletaEquipamento");
		equipamentoMongoRepository.delete(equipamento);
		log.info("[finaliza] EquipamentoInfraMongoRepository - deletaEquipamento");	
	}

	@Override
	public Equipamento buscarEquipamentoComId(UUID idEquipamento) {
		log.info("[inicia] ClienteMongoRepository - buscaClienteAtravesId");
		Equipamento equipamento = equipamentoMongoRepository.findById(idEquipamento)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Equipamento não encontrado"));
		log.info("[finaliza] ClienteMongoRepository - buscaClienteAtravesId");
		return equipamento;
	}
}