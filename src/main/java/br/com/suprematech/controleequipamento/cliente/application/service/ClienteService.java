package br.com.suprematech.controleequipamento.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.suprematech.controleequipamento.cliente.application.api.ClienteAlteracaoRequest;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteListResponse;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteRequest;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscarTodosClientes();
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
	void deletaClienteAtravesId(UUID idCliente);
}