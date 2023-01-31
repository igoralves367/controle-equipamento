package br.com.suprematech.controleequipamento.servico.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.suprematech.controleequipamento.servico.application.api.ServicoRequest;
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
	@NotBlank
	private String acessoriosDeixados;
	@NotBlank
	private String tipoDeServico;
	@NotBlank
	private String observacoes;	
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Servico(ServicoRequest servicoRequest) {
		this.idServico = UUID.randomUUID();;
		this.idEquipamento = servicoRequest.getIdEquipamento();
		this.acessoriosDeixados = servicoRequest.getAcessoriosDeixados();
		this.tipoDeServico = servicoRequest.getTipoDeServico();
		this.observacoes = servicoRequest.getObservacoes();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}