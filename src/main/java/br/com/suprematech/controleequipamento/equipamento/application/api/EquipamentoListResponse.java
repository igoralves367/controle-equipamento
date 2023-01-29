package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;
@Value
public class EquipamentoListResponse {
	private UUID idEquipamento;
	private UUID idCliente;
	@NotNull
	private String tipoDeImpressora;
	@NotNull
	private String marca;
	@NotBlank
	private String modelo;
	@NotNull
	private String numeroDeSerie;
}