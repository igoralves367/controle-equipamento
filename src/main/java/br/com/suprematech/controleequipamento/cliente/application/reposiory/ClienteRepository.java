package br.com.suprematech.controleequipamento.cliente.application.reposiory;

import java.util.List;

import br.com.suprematech.controleequipamento.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}