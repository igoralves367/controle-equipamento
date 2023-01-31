package br.com.suprematech.controleequipamento.servico.application.repository;

import br.com.suprematech.controleequipamento.servico.domain.Servico;

public interface ServicoRepository {
	Servico salvaServico(Servico servico);
}