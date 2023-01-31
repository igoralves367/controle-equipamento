package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<ServicoListResponse> getTodosServicos() {
		log.info("[inicia] ServicoController - getTodosServicos");
		List<ServicoListResponse> servicos = servicoService.buscarTodosServicos();
		log.info("[finaliza] ServicoController - getTodosServicos");
		return servicos;
	}

	@Override
	public void deletaServicoComId(UUID idServico) {
		log.info("[inicia] ServicoController - deletaServicoComId");
		log.info("[idServico] {}", idServico);
		servicoService.deletaServicoComId(idServico);
		log.info("[finaliza] ServicoController - deletaServicoComId");
	}
}