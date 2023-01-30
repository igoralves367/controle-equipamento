package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Builder
@Value
public class ServicoResponse {
	private UUID idServico;
}