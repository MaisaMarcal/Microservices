package com.tecdes.floricultura.service;

import org.springframework.stereotype.Service;

import com.tecdes.floricultura.model.Produto;
import com.tecdes.floricultura.repository.ProdutoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // Busca um produto pelo ID
    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado."));
    }
}