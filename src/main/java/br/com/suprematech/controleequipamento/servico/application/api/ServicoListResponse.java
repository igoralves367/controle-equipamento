package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.List;
import java.util.UUID;

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
		// TODO Auto-generated method stub
		return null;
	}	
}