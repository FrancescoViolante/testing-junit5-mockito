package com.salvio.persistor;

import org.springframework.jdbc.core.JdbcTemplate;

public class AnagraficaPersistorNew {

  public static void inserisciAnagrafica(JdbcTemplate jdbcTemplate, int id, String nome, String cognome, String codiceFiscale) {
    jdbcTemplate.update(
        "INSERT INTO anagrafica (id, nome,cognome,codiceFiscale) VALUES (?, ?, ?, ?)",
        id,
        nome,
        cognome,
        codiceFiscale);

  }
}