package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;
import lombok.Value;
@Value
public class BuscaEquipamentoResponse {
	
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
	
	public BuscaEquipamentoResponse(Equipamento equipamento) {
		this.idEquipamento = equipamento.getIdEquipamento();
		this.idCliente = equipamento.getIdCliente();
		this.tipoDeImpressora = equipamento.getTipoDeImpressora();
		this.marca = equipamento.getMarca();
		this.modelo = equipamento.getModelo();
		this.numeroDeSerie = equipamento.getNumeroDeSerie();
	}	
}