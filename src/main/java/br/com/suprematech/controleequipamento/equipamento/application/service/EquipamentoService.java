package br.com.suprematech.controleequipamento.equipamento.application.service;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.controleequipamento.equipamento.application.api.BuscaEquipamentoResponse;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoAlteracaoRequest;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoListResponse;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoRequest;
import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoResponse;

public interface EquipamentoService {
	EquipamentoResponse criaEquipamento(EquipamentoRequest equipamentoRequest);
	List<EquipamentoListResponse> buscarTodosEquipamentos();
	void deletaEquipamentoComId(UUID idEquipamento);
	void patchAlteraEquipamento(UUID idEquipamento, EquipamentoAlteracaoRequest equipamentoAlteracaoRequest);
	BuscaEquipamentoResponse buscarEquipamentoComId(UUID idEquipamento);
}