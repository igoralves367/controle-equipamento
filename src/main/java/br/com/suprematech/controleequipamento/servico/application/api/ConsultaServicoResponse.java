package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.UUID;

import br.com.suprematech.controleequipamento.servico.domain.Servico;
import lombok.Value;
@Value
public class ConsultaServicoResponse {

	private UUID idServico;
	private UUID idEquipamento;
	private String acessoriosDeixados;
	private String tipoDeServico;
	private String observacoes;
	
	public ConsultaServicoResponse(Servico servico) {
		this.idServico = servico.getIdServico();
		this.idEquipamento = servico.getIdEquipamento();
		this.acessoriosDeixados = servico.getAcessoriosDeixados();
		this.tipoDeServico = servico.getTipoDeServico();
		this.observacoes = servico.getObservacoes();
	}
}