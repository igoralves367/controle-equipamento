package br.com.suprematech.controleequipamento.equipamento.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;
@Value
public class EquipamentoRequest {
	@NotNull
	private String tipoDeImpressora;
	@NotNull
	private String marca;
	@NotBlank
	private String modelo;
	@NotNull
	private String numeroDeSerie;
}