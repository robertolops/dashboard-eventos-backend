package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Alarme;
import br.com.projetofinal.dao.AlarmeDAO;

@RestController
@CrossOrigin("*")
public class AlarmeController {
	
	@Autowired
	private AlarmeDAO dao;
	
	@GetMapping("/alarmes")
	public ResponseEntity<List<Alarme>> getAll() {
		List<Alarme> lista = (List<Alarme>) dao.findAll();
		if (lista.size()==0) {
		}
		return ResponseEntity.ok(lista);		
	}
	
	
}
