package br.com.suprematech.controleequipamento.equipamento.application.service;

import java.util.UUID;

import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoResponse;

public interface EquipamentoService {
	EquipamentoResponse criaEquipamento(UUID idCliente, EquipamentoRequest equipamentoRequest);
}