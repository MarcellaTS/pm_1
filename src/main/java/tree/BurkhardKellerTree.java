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

    public BurkhardKellerTree(No raiz, int distancia, IDistanceCalculator resultado) {
        this.raiz = raiz;
        this.distancia = distancia;
        this.resultado = resultado;
    }
    
    public BurkhardKellerTree(){
        
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public IDistanceCalculator getResultado() {
        return resultado;
    }

    public void setResultado(IDistanceCalculator resultado) {
        this.resultado = resultado;
    }
	
    
	//Factory will decide the distance that will be used
	public BurkhardKellerTree(IDistanceCalculator resultado){
		this.resultado = resultado;
		
	}

	//
	public int GerarDistancia(String palavra_um, String palavra_dois){
		return resultado.DistanciaEntrePalavras(palavra_um, palavra_dois);
	}
	
	public void AdicionarPalavra(String palavra){
            palavra = palavra.toLowerCase();
            if (raiz == null){
                raiz = new No(palavra);
                return;
            }
            No no_atual = new No();
            no_atual = raiz;
 
            //Padrão Strategy
            distancia = GerarDistancia(no_atual.palavra, palavra);
            while (no_atual.ContainsPonto(distancia)){
                if (distancia == 0) return;
                no_atual = no_atual.get(distancia);
                distancia = GerarDistancia(no_atual.palavra, palavra);
            }
            no_atual.AdicionarFilho(distancia,palavra);
    }
   
	
	public void search(String palavra_referencia, int distancia_referencia, int qtd_ref) {
		// TODO Auto-generated method stub
            palavra_referencia = palavra_referencia.toLowerCase();
            BurkhardKellerTreeSearchResult.Busca(this, raiz, palavra_referencia, distancia_referencia); 
            for(int contador = 0; contador < qtd_ref; contador++){
                System.out.print(raiz.getFilhos().get(contador));
            }
            
	}
}
