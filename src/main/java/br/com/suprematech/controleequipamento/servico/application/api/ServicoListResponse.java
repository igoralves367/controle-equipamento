package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.UUID;

import lombok.Value;
@Value
public class ServicoListResponse {
	private UUID idServico;
	private UUID idEquipamento;
	private String acessoriosDeixados;
	private String tipoDeServico;
	private String observacoes;	
}