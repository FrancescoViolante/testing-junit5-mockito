package com.salvio.entitys;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RiepilogoAnagrafica {

  private Integer idAnagrafica;
  private String nome;
  private String cognome;
  private String codiceFiscale;

}
