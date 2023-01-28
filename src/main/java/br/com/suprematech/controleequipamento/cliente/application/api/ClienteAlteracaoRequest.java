package br.com.suprematech.controleequipamento.cliente.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Value;
@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
}