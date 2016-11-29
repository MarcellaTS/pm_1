/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import distancias.No;
import java.util.ArrayList;
import distancias.IDistanceCalculator;



/**
 *
 * @author marce
 */
public class BurkhardKellerTree {
    private No raiz;
    private int distancia = -1;
    private IDistanceCalculator resultado;

    //Construtor
    public BurkhardKellerTree(){
        
    }
    
    //Construtor
    public BurkhardKellerTree(No raiz, int distancia, IDistanceCalculator resultado) {
        this.raiz = raiz;
        this.distancia = distancia;
        this.resultado = resultado;
    }
    
    //Get raiz da bktree
    public No getRaiz() {
        return raiz;
    }

    //Set raiz da bktree
    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    //Get distância
    public int getDistancia() {
        return distancia;
    }

    //Set distância
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    //Get resultado do método utilizado
    public IDistanceCalculator getResultado() {
        return resultado;
    }
    
    //Substitui o resultado da distância, segundo o método utilizado
    public BurkhardKellerTree(IDistanceCalculator resultado){
	this.resultado = resultado;
    }

    //Pede a distância entre duas palavras
    public int GerarDistancia(String palavra_um, String palavra_dois){
	return resultado.DistanciaEntrePalavras(palavra_um, palavra_dois);
    }
    
    //Faz a busca pedida - há que passar a palavra a ser comparada ao dicionário, a distância refrência e a qtd de palavras de retorno
    public void search(String palavra_referencia, int distancia_referencia, int qtd_ref) {
        palavra_referencia = palavra_referencia.toUpperCase();
        BurkhardKellerTreeSearchResult.Busca(this, raiz, palavra_referencia, distancia_referencia); 
        for(int contador = 0; contador < qtd_ref; contador++){
            System.out.print(raiz.getFilhos().get(contador));
        }
    }
    
    //Adiciona uma nova palavra a bktree
    public void AdicionarPalavra(String palavra){
        palavra = palavra.toLowerCase();
        
        if (raiz == null){
            raiz = new No(palavra);
            return;
        }
        
        No no_atual = new No();
        no_atual = raiz;
        distancia = GerarDistancia(no_atual.palavra, palavra);
        
        while (no_atual.ContainsPonto(distancia)){
            if (distancia == 0){
                return;
            }
            no_atual = no_atual.get(distancia);
            distancia = GerarDistancia(no_atual.palavra, palavra);
        }
            no_atual.AdicionarFilho(distancia,palavra);
    }
}
