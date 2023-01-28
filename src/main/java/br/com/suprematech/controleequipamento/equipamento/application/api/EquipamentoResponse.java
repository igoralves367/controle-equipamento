package br.com.suprematech.controleequipamento.equipamento.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class EquipamentoResponse {
	private UUID idEquipamento;
}