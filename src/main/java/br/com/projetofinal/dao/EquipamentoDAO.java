package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;
import br.com.projetofinal.beans.Equipamento;

public interface EquipamentoDAO extends CrudRepository<Equipamento,Integer> {

}
