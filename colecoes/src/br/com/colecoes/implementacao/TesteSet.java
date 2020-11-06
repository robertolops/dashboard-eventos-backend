package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("INFRA");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("SUPORTE");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		
		//Set não existe indice
		//System.out.println(lista.get(1));
		
		//a ordenação que prevalece
		//Collections.sort(lista);
		

	}//fecha main

}//fecha class
