package br.com.suprematech.controleequipamento.servico.application.service;

import br.com.suprematech.controleequipamento.servico.application.api.ServicoRequest;
import br.com.suprematech.controleequipamento.servico.application.api.ServicoResponse;

public interface ServicoService {
	ServicoResponse criaServico(ServicoRequest servicoRequest);
}