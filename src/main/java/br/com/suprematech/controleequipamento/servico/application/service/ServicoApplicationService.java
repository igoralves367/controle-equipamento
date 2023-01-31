package br.com.suprematech.controleequipamento.servico.application.service;

import org.springframework.stereotype.Service;

import br.com.suprematech.controleequipamento.servico.application.api.ServicoRequest;
import br.com.suprematech.controleequipamento.servico.application.api.ServicoResponse;
import br.com.suprematech.controleequipamento.servico.application.repository.ServicoRepository;
import br.com.suprematech.controleequipamento.servico.domain.Servico;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ServicoApplicationService implements ServicoService {
	private final ServicoRepository servicoRepository;

	@Override
	public ServicoResponse criaServico(ServicoRequest servicoRequest) {
		log.info("[inicia] ServicoApplicationService - criaServico");
		Servico servico = servicoRepository.salvaServico(new Servico(servicoRequest));
		log.info("[finaliza] ServicoApplicationService - criaServico");
		return ServicoResponse.builder().idServico(servico.getIdEquipamento()).build();
	}
}	