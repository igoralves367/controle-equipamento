package br.com.suprematech.controleequipamento.servico.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.suprematech.controleequipamento.handler.APIException;
import br.com.suprematech.controleequipamento.servico.application.repository.ServicoRepository;
import br.com.suprematech.controleequipamento.servico.domain.Servico;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Repository
@RequiredArgsConstructor
public class ServicoInfraMongoRepository implements ServicoRepository {
	private final ServicoMongoRepository servicoMongoRepository;

	@Override
	public Servico salvaServico(Servico servico) {
		log.info("[inicia] ServicoInfraMongoRepository - salvaServico");
		servicoMongoRepository.save(servico);
		log.info("[finaliza] ServicoInfraMongoRepository - salvaServico");
		return servico;
	}

	@Override
	public List<Servico> buscarTodosServicos() {
		log.info("[inicia] ServicoInfraMongoRepository - buscarTodosServicos");
		List<Servico> todosServicos = servicoMongoRepository.findAll();
		log.info("[finaliza] ServicoInfraMongoRepository - buscarTodosServicos");
		return todosServicos;
	}

	@Override
	public Servico buscarServicoComId(UUID idServico) {
		log.info("[inicia] ServicoInfraMongoRepository - buscarServicoComId");
		Servico servico = servicoMongoRepository.findById(idServico)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Servico não encontrado"));
		log.info("[finaliza] ServicoInfraMongoRepository - buscarServicoComId");
		return servico;
	}

	@Override
	public void deletaServico(Servico servico) {
		log.info("[inicia] ServicoInfraMongoRepository - deletaServico");
		servicoMongoRepository.delete(servico);
		log.info("[finaliza] ServicoInfraMongoRepository - deletaServico");
	}
}