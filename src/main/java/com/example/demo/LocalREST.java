package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.RepositorioLocal;
import com.example.demo.entidade.Local;

@RestController
@RequestMapping("/destinos")
public class LocalREST {
	@Autowired
	private RepositorioLocal repositorio;
	
	@GetMapping
	public List<Local> listar () {
		return repositorio.findAll();
	}
	
	
	 /*@PostMapping
	  public void salvar(@RequestBody RepositorioLocal repositorio) {
		repositorio.save(repositorio);
	 }
	 
	 @PutMapping
	 public void alterar(@RequestBody RepositorioLocal repositorio) {
		if (repositorio.getId()>0)
			repositorio.save(repositorio);
	 }
	 
	 @DeleteMapping
	 public void excluir(@RequestBody RepositorioLocal repositorio) {
		repositorio.delete((Local) repositorio);
	 }
	 
	 
	*/
}
