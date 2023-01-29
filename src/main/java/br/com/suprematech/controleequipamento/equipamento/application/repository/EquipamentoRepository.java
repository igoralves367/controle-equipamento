package br.com.suprematech.controleequipamento.equipamento.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;

public interface EquipamentoRepository {
	Equipamento salvaEquipamento(Equipamento equipamento);
	List<Equipamento> buscarTodosEquipamentos();
	void deletaEquipamento(Equipamento equipamento);
	Equipamento buscarEquipamentoComId(UUID idEquipamento);
}