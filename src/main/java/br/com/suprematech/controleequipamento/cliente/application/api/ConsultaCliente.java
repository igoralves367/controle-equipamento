package br.com.suprematech.controleequipamento.cliente.application.api;

import java.util.UUID;

import lombok.Value;
@Value
public class ConsultaCliente {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpfCnpj;
}