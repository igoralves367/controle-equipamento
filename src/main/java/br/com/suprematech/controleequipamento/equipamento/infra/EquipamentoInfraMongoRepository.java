package br.com.suprematech.controleequipamento.equipamento.infra;

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
}