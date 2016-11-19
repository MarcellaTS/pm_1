/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marce
 */
public class ListaDePalavras {
    List <String> lista_palavras = new ArrayList<>();

    public List<String> getLista_palavras() {
        return lista_palavras;
    }

    public void setLista_palavras(List<String> lista_palavras) {
        this.lista_palavras = lista_palavras;
    }

    public ListaDePalavras() {
    }
    
    public void AddPalavra(String palavra){
        lista_palavras.add(palavra);
    }
    
    public void AddListaPalavras(List<String> palavras){
        lista_palavras.addAll(palavras);
    }
}
