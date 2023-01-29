package br.com.suprematech.controleequipamento.equipamento.application.repository;

import java.util.List;

import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;

public interface EquipamentoRepository {
	Equipamento salvaEquipamento(Equipamento equipamento);
	List<Equipamento> buscarTodosEquipamentos();
}