package br.com.suprematech.controleequipamento.cliente.application.api;

import java.util.UUID;

import br.com.suprematech.controleequipamento.cliente.domain.Cliente;
import lombok.Value;
@Value
public class ConsultaClienteResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpfCnpj;
	
	public ConsultaClienteResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.cpfCnpj = cliente.getCpfCnpj();
	}	
}