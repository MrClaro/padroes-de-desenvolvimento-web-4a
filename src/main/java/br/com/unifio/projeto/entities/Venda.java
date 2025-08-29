package br.com.unifio.projeto.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Venda {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer codigo;

  public LocalDate horario;

  public Double valorTotal;

  public Integer quantidadeTotal;

  @OneToOne
  public Cliente cliente;

  @OneToOne
  public Funcionario funcionario;

}
