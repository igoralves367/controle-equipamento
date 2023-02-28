package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.suprematech.controleequipamento.servico.domain.Servico;
import lombok.Value;
@Value
public class ServicoListResponse {
	private UUID idServico;
	private UUID idEquipamento;
	private String acessoriosDeixados;
	private String tipoDeServico;
	private String observacoes;
	
	public static List<ServicoListResponse> converte(List<Servico> servicos) {
		return servicos.stream()
				.map(ServicoListResponse::new)
				.collect(Collectors.toList());
	}

	public ServicoListResponse(Servico servico) {
		this.idServico = servico.getIdServico();
		this.idEquipamento = servico.getIdEquipamento();
		this.acessoriosDeixados = servico.getAcessoriosDeixados();
		this.tipoDeServico = servico.getTipoDeServico();
		this.observacoes = servico.getObservacoes();
	}	
}