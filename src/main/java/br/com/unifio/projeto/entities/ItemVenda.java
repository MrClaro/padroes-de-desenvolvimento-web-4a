package br.com.unifio.projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ItemVenda {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer codigo;

  public Double valorParcial;

  public Integer quantidadeParcial;

  @OneToOne
  public Produto produto;

}
