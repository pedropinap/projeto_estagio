/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

/**
 *
 * @author Pedro Pina
 */
public interface IProdutoFabricado extends IProduto {
  int getNumeroIngredientes();
  IProduto getIngrediente(int numero);
} 
