package br.com.suprematech.controleequipamento.equipamento.application.service;

import org.springframework.stereotype.Service;

import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoResponse;
import br.com.suprematech.controleequipamento.equipamento.application.repository.EquipamentoRepository;
import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class EquipamentoApplicationService implements EquipamentoService {
	private final EquipamentoRepository equipamentoRepository;

	@Override
	public EquipamentoResponse criaEquipamento(EquipamentoRequest equipamentoRequest) {
		log.info("[inicia] EquipamentoApplicationService - criaEquipamento");
		Equipamento equipamento = equipamentoRepository.salvaEquipamento(new Equipamento(equipamentoRequest));
		log.info("[finaliza] EquipamentoApplicationService - criaEquipamento");
		return EquipamentoResponse.builder().idEquipamento(equipamento.getIdEquipamento()).build();
	}
}