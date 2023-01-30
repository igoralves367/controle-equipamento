package br.com.suprematech.controleequipamento.servico.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.suprematech.controleequipamento.servico.application.service.ServicoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ServicoController implements ServicoAPI {
	private final ServicoService servicoService;

	@Override
	public ServicoResponse postServico(ServicoRequest servicoRequest) {
		log.info("[inicia] ServicoController - postServico");
		ServicoResponse servico = servicoService.criaServico(servicoRequest);
		log.info("[finaliza] ServicoController - postServico");
		return servico;
	}
}