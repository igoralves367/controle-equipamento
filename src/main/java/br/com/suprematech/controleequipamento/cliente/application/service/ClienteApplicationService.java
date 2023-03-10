package br.com.suprematech.controleequipamento.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.suprematech.controleequipamento.cliente.application.api.ClienteAlteracaoRequest;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteListResponse;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteRequest;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteResponse;
import br.com.suprematech.controleequipamento.cliente.application.api.ConsultaClienteResponse;
import br.com.suprematech.controleequipamento.cliente.application.reposiory.ClienteRepository;
import br.com.suprematech.controleequipamento.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build(); 
	}

	@Override
	public List<ClienteListResponse> buscarTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscarTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscarTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[inicia] ClienteApplicationService - pathAlteraCliente");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		cliente.altera(clienteAlteracaoRequest);
		clienteRepository.salva(cliente);
		log.info("[finaliza] ClienteApplicationService - pathAlteraCliente");
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - deletaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		clienteRepository.deletaCliente(cliente);
		log.info("[finaliza] ClienteApplicationService - deletaClienteAtravesId");	
	}

	@Override
	public ConsultaClienteResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return new ConsultaClienteResponse(cliente);
	}
}