package br.com.suprematech.controleequipamento.equipamento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
@Document(collection = "Equipamento")
public class Equipamento {
	@Id
	private UUID idEquipamento;
	private UUID idClienteDono;
	@NotNull
	private String tipoDeImpressora;
	@NotNull
	private String marca;
	@NotBlank
	private String modelo;
	@NotNull
	private String numeroDeSerie;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
}