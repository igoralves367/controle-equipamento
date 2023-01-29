package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.suprematech.controleequipamento.equipamento.domain.Equipamento;
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
	
	public static List<EquipamentoListResponse> converte(List<Equipamento> equipamentos) {
		// TODO Auto-generated method stub
		return null;
	}
}