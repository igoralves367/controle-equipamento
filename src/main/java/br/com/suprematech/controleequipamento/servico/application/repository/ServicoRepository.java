package br.com.suprematech.controleequipamento.servico.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.controleequipamento.servico.domain.Servico;

public interface ServicoRepository {
	Servico salvaServico(Servico servico);
	List<Servico> buscarTodosServicos();
	Servico buscarServicoComId(UUID idServico);
	void deletaServico(Servico servico);
}