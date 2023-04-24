package com.able.able.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.able.able.model.Tema;
import com.able.able.repository.TemaRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/temas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaController {
	
	@Autowired
	private TemaRepository temaRepository;

	
	// Procurar tema por titulo
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity <List<Tema>> getByTitulo (@PathVariable String titulo){
		return ResponseEntity.ok(temaRepository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	
	// Cadastrar tema
	@PostMapping
	public ResponseEntity <Tema> post (@Valid @RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(temaRepository.save(tema));
	}
	
}
