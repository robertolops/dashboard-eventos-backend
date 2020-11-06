package br.com.projetofinal.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {
	
	List<Musica> findByLancamento(int lancamento);
	
	List<Musica> findByCadastroBetween(Date inicio, Date fim);
	
	/*@Query(value="SELECT count(id) as total FROM TB_MUSICA WHERE "
			+ " cadastro >= :inicio  AND cadastro <= :fim  AND artista_id= :num", nativeQuery = true)
	long getByTotal(@Param("inicio") Date inicio, @Param("fim") Date fim, @Param("num") int num);
	*/

}
