package br.com.suprematech.controleequipamento.equipamento.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoListResponse;
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

	@Override
	public List<EquipamentoListResponse> buscarTodosEquipamentos() {
		log.info("[inicia] EquipamentoApplicationService - buscarTodosEquipamentos");
		List<Equipamento> equipamentos = equipamentoRepository.buscarTodosEquipamentos();
		log.info("[finaliza] EquipamentoApplicationService - buscarTodosEquipamentos");
		return EquipamentoListResponse.converte(equipamentos);
	}
}