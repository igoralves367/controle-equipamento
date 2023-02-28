package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

import lombok.Value;
@Value
public class ServicoRequest {
	private UUID idEquipamento;
	@NotBlank
	private String acessoriosDeixados;
	@NotBlank
	private String tipoDeServico;
	@NotBlank
	private String observacoes;	
}