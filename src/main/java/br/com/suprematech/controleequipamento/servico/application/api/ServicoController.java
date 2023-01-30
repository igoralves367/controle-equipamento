package br.com.suprematech.controleequipamento.servico.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class ServicoController implements ServicoAPI {

	@Override
	public ServicoResponse postServico(ServicoRequest servicoRequest) {
		log.info("[inicia] ServicoController - postServico");
		log.info("[finaliza] ServicoController - postServico");
		return null;
	}
}