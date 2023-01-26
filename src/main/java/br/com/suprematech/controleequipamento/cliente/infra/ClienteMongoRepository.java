package br.com.suprematech.controleequipamento.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.suprematech.controleequipamento.cliente.application.reposiory.ClienteRepository;
import br.com.suprematech.controleequipamento.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor 
public class ClienteMongoRepository implements ClienteRepository {
	private final ClienteMongoSpringRepository clienteMongoSpringRepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteMongoSpringRepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}
}