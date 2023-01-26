package br.com.suprematech.controleequipamento.cliente.application.service;

import java.util.List;

import br.com.suprematech.controleequipamento.cliente.application.api.ClienteListResponse;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteRequest;
import br.com.suprematech.controleequipamento.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscarTodosClientes();
}