package com.trybe.idadeemdias;

/**
 * Classe Pessoa.
 */
public class Pessoa {

  /**
   * retorna idade em dias ex: 1231312.
   */
  public int calcularIdadeEmDias(int ano, int mes, int dia) {
    int idadeAno = ano * 365;
    int idadeMes = mes * 30;
    int idadeDia = dia;
    int resultado = idadeAno + idadeMes + idadeDia;

    return resultado;
  }

}
