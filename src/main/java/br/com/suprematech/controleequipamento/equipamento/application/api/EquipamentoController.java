package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;

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
		List<EquipamentoListResponse> equipamentos = equipamentoService.buscarTodosEquipamentos();
		log.info("[finaliza] EquipamentoController - getTodosEquipamentos");
		return equipamentos;
	}

	@Override
	public void deletaEquipamentoComId(UUID idEquipamento) {
		log.info("[inicia] EquipamentoController - deletaEquipamentoComId");
		log.info("[idCliente] {}", idEquipamento);
		equipamentoService.deletaEquipamentoComId(idEquipamento);
		log.info("[Finaliza] EquipamentoController - deletaEquipamentoComId");	
	}

	@Override
	public void patchAlteraEquipamento(UUID idEquipamento,
			EquipamentoAlteracaoRequest equipamentoAlteracaoRequest) {
		log.info("[inicia] EquipamentoController - patchAlteraEquipamento");
		log.info("[idEquipamento] {}", idEquipamento);
		log.info("[Finaliza] EquipamentoController - patchAlteraEquipamento");	
	}
}