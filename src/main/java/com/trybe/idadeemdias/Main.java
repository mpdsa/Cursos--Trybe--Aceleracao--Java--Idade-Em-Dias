package com.trybe.idadeemdias;

import java.util.Scanner;

/** Classe Principal. */
public class Main {

  /** Classe Principal. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");
    final String nome = scan.next();
    
    System.out.println("Qual é sua idade em anos, meses e dias?");
    System.lineSeparator();
    System.out.println("anos:");
    final int ano = scan.nextInt();
    
    System.out.println("meses:");
    final int mes = scan.nextInt();
    
    System.out.println("dias:");
    final int dia = scan.nextInt();
    
    scan.close();
    
    Pessoa pessoa = new Pessoa();
    String idade = Integer.toString(pessoa.calcularIdadeEmDias(ano, mes, dia));
    
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder resultado = stringBuilder.append("Olá ")
                                           .append(nome)
                                           .append(", sua idade em dias é ")
                                           .append(idade);
    System.out.print(resultado);
  }
}


