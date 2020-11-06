package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.projetofinal.beans.Alarme;

public interface AlarmeDAO extends CrudRepository<Alarme,Integer> { 

}
