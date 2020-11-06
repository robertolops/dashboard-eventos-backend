package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Equipamento;
import br.com.projetofinal.dao.EquipamentoDAO;

@RestController
@CrossOrigin("*")
public class EquipamentoController {
	
	@Autowired
	private EquipamentoDAO dao;
	
	@GetMapping("/equipamentos")
	public ResponseEntity<List<Equipamento>> getAll() {
		List<Equipamento> lista = (List<Equipamento>) dao.findAll();
		if (lista.size()==0) {
		}
		return ResponseEntity.ok(lista);		
	}
	

}
