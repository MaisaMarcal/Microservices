package com.tecdes.floricultura.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tecdes.floricultura.model.Produto;


public interface ProdutoRepository extends  JpaRepository<Produto, Long> {
    
}
