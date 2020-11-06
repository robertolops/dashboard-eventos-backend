package br.com.projetofinal.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Alarme;
import br.com.projetofinal.beans.Evento;
import br.com.projetofinal.dao.AlarmeDAO;
import br.com.projetofinal.dao.EventoDAO;

@RestController
@CrossOrigin("*")
public class EventoController {

	@Autowired
	private EventoDAO dao;	
	
	@Autowired
	private AlarmeDAO alarmedao;

	@GetMapping("/contador/{i}/{f}")
	public ResponseEntity<List<String>> getContagem(@PathVariable String i , @PathVariable String f) throws Exception {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
		Date inicio = formato.parse(i);
		Date fim = formato.parse(f);
		List<String> resultado = new ArrayList<String>();
		for (Alarme a: alarmedao.findAll()) {
			long numero = dao.getByTotal(inicio, fim, a.getId());
			resultado.add(a.getDescricao());
			resultado.add(String.valueOf(numero));
		} if (resultado.size()==0) {
			return ResponseEntity.status(404).build();	
		}
		return ResponseEntity.ok(resultado);
	} 
		
	@GetMapping("/data/{i}/{f}")
	public ResponseEntity<List<Evento>> getIntervalo(@PathVariable String i , @PathVariable String f) throws Exception{
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
		Date inicio = formato.parse(i);
		Date fim = formato.parse(f);
		List<Evento> lista = (List<Evento>) dao.findByDataBetween(inicio, fim);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();	
		}
		return ResponseEntity.ok(lista);
	} 
	
	@GetMapping("/eventos")
	public ResponseEntity<List<Evento>> getAll() {
		List<Evento> lista = (List<Evento>) dao.findAll();
		if (lista.size()==0) {
		}
		return ResponseEntity.ok(lista);		
	}

	
}//fecha class


