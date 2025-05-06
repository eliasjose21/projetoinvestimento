package br.com.unicuritiba.projetoinvestimento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.projetoinvestimento.models.Investimento;
import br.com.unicuritiba.projetoinvestimento.repositories.InvestimentoRepository;

@RestController
public class InvestimentoController {

	@Autowired
	InvestimentoRepository repository;
	
	@GetMapping("/investimentos")
	public ResponseEntity<List<Investimento>> getInvestimentos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/investimentos/{id}")
	public ResponseEntity<Investimento> getInvestimento(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id).get());
	}
	
	@PostMapping("/investimentos")
	public ResponseEntity<Investimento> saveInvestimento(@RequestBody Investimento investimento){
		Investimento savedInvestimento = repository.save(investimento);
		return ResponseEntity.ok(savedInvestimento);
	}
	
	@PutMapping("/investimentos/{id}")
	public ResponseEntity<Investimento> updateInvestimento(@PathVariable long id, @RequestBody Investimento investimento){
		investimento.setId(id);
		Investimento savedInvestimento = repository.save(investimento);
		return ResponseEntity.ok(savedInvestimento);
	}
	
	@DeleteMapping("/investimentos/{id}")
	public void removeInvestimento(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
