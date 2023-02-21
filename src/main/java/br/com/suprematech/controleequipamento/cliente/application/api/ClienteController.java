package br.com.suprematech.controleequipamento.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.suprematech.controleequipamento.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente( ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[Finaliza] ClienteController - postCliente");	
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscarTodosClientes();
		log.info("[Finaliza] ClienteController - getTodosClientes");
		return clientes;
	}

	@Override
	public void deleClienteComId(UUID idCliente) {
		log.info("[inicia] ClienteController - deleClienteComId");
		log.info("[idCliente] {}", idCliente);
		clienteService.deletaClienteAtravesId(idCliente);
		log.info("[Finaliza] ClienteController - deleClienteComId");		
	}

	@Override
	public void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest) {
		log.info("[inicia] ClienteController - patchAlteraCliente");
		log.info("[idCliente] {}", idCliente);
		clienteService.patchAlteraCliente(idCliente, clienteAlteracaoRequest);
		log.info("[Finaliza] ClienteController - patchAlteraCliente");
	}

	@Override
	public List<ConsultaCliente> getConsultaCliente(UUID idCliente) {
		log.info("[inicia] ClienteController - getConsultaCliente");
		log.info("[idCliente] {}", idCliente);
		log.info("[Finaliza] ClienteController - getConsultaCliente");
		return null;
	}
}