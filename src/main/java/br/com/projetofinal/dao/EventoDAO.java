package br.com.projetofinal.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Evento;

public interface EventoDAO extends CrudRepository<Evento,Integer>{

	List<Evento> findByDataBetween(Date inicio, Date fim);

	@Query(value="SELECT count(num_seq) as total FROM ITMN_EVENTO WHERE "
			+ " data >= :inicio  AND data <= :fim  AND alarme_id_alarme= :num", nativeQuery = true)
	long getByTotal(@Param("inicio") Date inicio, @Param("fim") Date fim, @Param("num") int num);

	

}