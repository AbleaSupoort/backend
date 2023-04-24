package com.able.able.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.able.able.model.Tema;

public interface TemaRepository extends JpaRepository <Tema, Long>{
	
	List<Tema> findAllByTituloContainingIgnoreCase(@Param ("titulo") String titulo);

}
