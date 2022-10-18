package com.example.ecommerceMVC.service;

import com.example.ecommerceMVC.dao.IDao;
import com.example.ecommerceMVC.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    IDao<Produto> produtoDaoH2;

    public Produto salvar(Produto produto) throws SQLException{
        return produtoDaoH2.salvar(produto);
    }

    public List<Produto> buscarTodos() throws SQLException{
        return produtoDaoH2.buscarTodos();
    }

    public void alterar(Produto produto) throws SQLException{
        produtoDaoH2.alterar(produto);
    }

    public void excluir(int id) throws SQLException{
        produtoDaoH2.excluir(id);
    }

    public Optional<Produto> buscarPorId(int id) throws SQLException{
        return produtoDaoH2.buscarPorId(id);
    }
}
