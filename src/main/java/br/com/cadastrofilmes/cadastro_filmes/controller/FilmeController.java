package br.com.cadastrofilmes.cadastro_filmes.controller;

import br.com.cadastrofilmes.cadastro_filmes.model.Filme;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final List<Filme> filmes = new ArrayList<>();
    private Long proximoId = 1L;

    @GetMapping
    public List<Filme> listarFilmes() {
        return filmes;
    }

    @PostMapping
    public Filme cadastrarFilme(@RequestBody Filme filme) {
        filme.setId(proximoId++);
        filmes.add(filme);

        return filme;
    }
}