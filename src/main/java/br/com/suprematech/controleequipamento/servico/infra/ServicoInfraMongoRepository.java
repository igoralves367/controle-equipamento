package br.com.suprematech.controleequipamento.servico.infra;

import org.springframework.stereotype.Repository;

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
}