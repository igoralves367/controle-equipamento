package br.com.suprematech.controleequipamento.servico.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Document(collection = "Servico")
public class Servico {
	@Id
	private UUID idServico;
	private UUID idEquipamento;
	private String acessoriosDeixados;
	private String tipoDeServico;
	private String observacoes;	
}