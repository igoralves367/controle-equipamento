package br.com.suprematech.controleequipamento.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.suprematech.controleequipamento.cliente.application.reposiory.ClienteRepository;
import br.com.suprematech.controleequipamento.cliente.domain.Cliente;
import br.com.suprematech.controleequipamento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor 
public class ClienteMongoRepository implements ClienteRepository {
	private final ClienteMongoSpringRepository clienteMongoSpringRepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteMongoRepository - salva");
		clienteMongoSpringRepository.save(cliente);
		log.info("[finaliza] ClienteMongoRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteMongoRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteMongoSpringRepository.findAll();
		log.info("[finaliza] ClienteMongoRepository - buscaTodosClientes");	
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteMongoRepository - buscaClienteAtravesId");
		Cliente cliente = clienteMongoSpringRepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
		log.info("[finaliza] ClienteMongoRepository - buscaClienteAtravesId");
		return cliente;
	}

	@Override
	public void deletaCliente(Cliente cliente) {
		log.info("[inicia] ClienteMongoRepository - deletaCliente");
		clienteMongoSpringRepository.delete(cliente);
		log.info("[finaliza] ClienteMongoRepository - deletaCliente");	
	}
}