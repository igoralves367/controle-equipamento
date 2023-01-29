package br.com.suprematech.controleequipamento.equipamento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.suprematech.controleequipamento.equipamento.application.api.EquipamentoRequest;
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
	private UUID idCliente;
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
	
	public Equipamento(EquipamentoRequest equipamentoRequest) {
		this.idEquipamento = UUID.randomUUID();
		this.idCliente = equipamentoRequest.getIdCliente();
		this.tipoDeImpressora = equipamentoRequest.getTipoDeImpressora();
		this.marca = equipamentoRequest.getMarca();
		this.modelo = equipamentoRequest.getModelo();
		this.numeroDeSerie = equipamentoRequest.getNumeroDeSerie();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}