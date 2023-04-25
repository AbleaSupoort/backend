package com.able.able.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.able.able.model.Postagem;

public interface PostagemRepository extends JpaRepository <Postagem, Long> {

	List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
