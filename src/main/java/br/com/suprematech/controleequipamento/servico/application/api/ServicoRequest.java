package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.UUID;

import lombok.Value;
@Value
public class ServicoRequest {
	private UUID idEquipamento;
	private String acessoriosDeixados;
	private String tipoDeServico;
	private String observacoes;	
}