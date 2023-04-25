package com.able.able.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.able.able.model.Postagem;

public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}
