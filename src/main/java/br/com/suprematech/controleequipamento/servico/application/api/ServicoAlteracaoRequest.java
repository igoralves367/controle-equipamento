package br.com.suprematech.controleequipamento.servico.application.api;

import javax.validation.constraints.NotBlank;

import lombok.Value;
@Value
public class ServicoAlteracaoRequest {
	@NotBlank
	private String acessoriosDeixados;
	@NotBlank
	private String tipoDeServico;
	@NotBlank
	private String observacoes;	
}