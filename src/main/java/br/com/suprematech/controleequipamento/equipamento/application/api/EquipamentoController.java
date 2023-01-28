package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
public class EquipamentoController implements EquipamentoAPI {

	@Override
	public EquipamentoResponse postEquipamento(UUID idCliente, EquipamentoRequest equipamentoRequest) {
		log.info("[inicia] EquipamentoController - postEquipamento");
		log.info("[idCliente] {}", idCliente);
		log.info("[finaliza] EquipamentoController - postEquipamento");
		return null;
	}
}