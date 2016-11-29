/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancias;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author marce
 */
public class No {
    public String palavra = null;
	public HashMap<Integer, No> Filhos = new HashMap<Integer, No>();

	public No() { }

	public No(String palavra)
	{
		this.palavra = palavra.toLowerCase();
	}

	public String GetPalavra() {
		return this.palavra;
	}

	public void SetPalavra(String palavra) {
		this.palavra = palavra;
	}

	public HashMap<Integer, No> getFilhos() {
		return Filhos;
	}

	public void setFilhos(HashMap<Integer, No> Filhos) {
		this.Filhos = Filhos;
	}	

	public No get(int dist)
	{
		return this.get(dist);
	}

	//retorna as PontosDeIntervalo do objeto children
	public Set<Integer> PontosDeIntervalo()
	{
		if(Filhos == null)
			return new HashSet<Integer>();
		return Filhos.keySet();

	}
	
	public Set<Integer> PontosNoIntervalo(int minimo, int maximo){
		Set<Integer> PontosDeIntervalo = this.PontosDeIntervalo();
		Set<Integer> Intervalo = new HashSet<Integer>();
		
		for(int ponto : PontosDeIntervalo){
			if((ponto >= minimo) && (ponto <= maximo))
				Intervalo.add(ponto);
		}
		
		return Intervalo;
	}

	public boolean ContainsPonto(int ponto)
	{
		if(Filhos.containsKey(ponto)){
			return true;
		}else{
			return false;
		}
	}

	public void AdicionarFilho(int ponto, String palavra)
	{
		if(this.Filhos == null){
			Filhos = new HashMap<Integer, No>();
		}else{
			if(!this.Filhos.containsKey(ponto)){
				Filhos.put(ponto,new No(palavra));
			}
		}
	}
}
