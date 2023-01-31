package br.com.suprematech.controleequipamento.servico.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/servico")
public interface ServicoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ServicoResponse postServico(@Valid @RequestBody ServicoRequest servicoRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ServicoListResponse> getTodosServicos();
	
	@DeleteMapping(value = "/{idServico}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaServicoComId(@PathVariable UUID idServico);
}