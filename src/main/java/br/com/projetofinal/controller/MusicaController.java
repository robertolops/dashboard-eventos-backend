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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.ArtistaDAO;
import br.com.projetofinal.dao.MusicaDAO;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
	
	
	/*@Autowired
	private ArtistaDAO artistadao;

	@GetMapping("/contagem/{i}/{f}")
	public ResponseEntity<List<String>> getContagem(@PathVariable String i , @PathVariable String f) throws Exception {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
		Date inicio = formato.parse(i);
		Date fim = formato.parse(f);
		List<String> resultado = new ArrayList<String>();
		for (Artista a: artistadao.findAll()) {
			long numero = dao.getByTotal(inicio, fim, a.getCodigo());
			resultado.add(a.getNomeArtistico());
			resultado.add(String.valueOf(numero));
		} if (resultado.size()==0) {
			return ResponseEntity.status(404).build();	
		}
		return ResponseEntity.ok(resultado);
	} */
	
			
	@GetMapping("/cadastro/{i}/{f}")
	public ResponseEntity<List<Musica>> getIntervalo(@PathVariable String i , @PathVariable String f) throws Exception{
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
		Date inicio = formato.parse(i);
		Date fim = formato.parse(f);
		List<Musica> lista = (List<Musica>) dao.findByCadastroBetween(inicio , fim);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();	
		}
		return ResponseEntity.ok(lista);
	} 
	
	@GetMapping("/lancamento/{valor}")
	public ResponseEntity<List<Musica>> getLancamento(@PathVariable int valor){
		List<Musica> lista = (List<Musica>) dao.findByLancamento(valor);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();	
		}
		return ResponseEntity.ok(lista);
	}

	@PostMapping("/novamusica")
	public ResponseEntity<Musica> add(@RequestBody Musica objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}

	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getAll() {
		List<Musica> lista = (List<Musica>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();	
		}
		return ResponseEntity.ok(lista);		
	}



}//fecha class
