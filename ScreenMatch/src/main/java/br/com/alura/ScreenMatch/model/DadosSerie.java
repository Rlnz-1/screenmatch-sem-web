package br.com.alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Director") String diretor,
                         @JsonProperty("imdbVotes") String votos) {
}
