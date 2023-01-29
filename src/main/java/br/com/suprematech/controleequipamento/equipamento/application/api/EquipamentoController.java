package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.suprematech.controleequipamento.equipamento.application.service.EquipamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
@RequiredArgsConstructor
public class EquipamentoController implements EquipamentoAPI {
	private final EquipamentoService equipamentoService;

	@Override
	public EquipamentoResponse postEquipamento(EquipamentoRequest equipamentoRequest) {
		log.info("[inicia] EquipamentoController - postEquipamento");
		EquipamentoResponse equipamento = equipamentoService.criaEquipamento(equipamentoRequest);
		log.info("[finaliza] EquipamentoController - postEquipamento");
		return equipamento;
	}

	@Override
	public List<EquipamentoListResponse> getTodosEquipamentos() {
		log.info("[inicia] EquipamentoController - getTodosEquipamentos");
		log.info("[finaliza] EquipamentoController - getTodosEquipamentos");
		return null;
	}
}