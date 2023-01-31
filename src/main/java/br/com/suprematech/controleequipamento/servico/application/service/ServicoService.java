package br.com.suprematech.controleequipamento.servico.application.service;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.controleequipamento.servico.application.api.ServicoListResponse;
import br.com.suprematech.controleequipamento.servico.application.api.ServicoRequest;
import br.com.suprematech.controleequipamento.servico.application.api.ServicoResponse;

public interface ServicoService {
	ServicoResponse criaServico(ServicoRequest servicoRequest);
	List<ServicoListResponse> buscarTodosServicos();
	void deletaServicoComId(UUID idServico);
}