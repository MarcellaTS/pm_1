/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import distancias.No;
import tree.BurkhardKellerTree;
import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class BurkhardKellerTreeSearchResult {
    public Object GetPalavra(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	public int GetDistancia(int posicao) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void Busca(BurkhardKellerTree bkTree, No no, String palavra, int distancia_referencia)
	{
		int distancia_entre_palavras_atual = bkTree.GerarDistancia(no.palavra, palavra);
		int distancia_minima = distancia_entre_palavras_atual - distancia_referencia;
		int distancia_maxima = distancia_entre_palavras_atual + distancia_referencia;

		if (distancia_entre_palavras_atual <= distancia_referencia)
			bkTree.AdicionarPalavra(palavra);

		for(int ponto : no.PontosNoIntervalo(distancia_minima, distancia_maxima))
		{
			Busca(bkTree, no.get(ponto), palavra, distancia_referencia);
		}
                
	}
}
