package br.com.suprematech.controleequipamento.equipamento.application.service;

import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoResponse;

public interface EquipamentoService {
	EquipamentoResponse criaEquipamento(EquipamentoRequest equipamentoRequest);
}