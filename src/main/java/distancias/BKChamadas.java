/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancias;

import tree.BurkhardKellerTree;
import java.util.HashMap;

/**
 *
 * @author marce
 */
public class BKChamadas {
    private HashMap<String, IDistanceCalculator> mapeamento = new HashMap<String, IDistanceCalculator>();
	
	private static BKChamadas instancia = null;
	
	private BKChamadas(){
		
	}
	
	//defines which kind of calculations will be used
	//creates the tree based on the calculator type - the tree is the same for both
	public static BKChamadas GetInstancia(){
		if(instancia == null)
			return new BKChamadas();
		return instancia;
	}
	
	public IDistanceCalculator GetMetodo(String MetodoDistancia){
		if(!mapeamento.containsKey(MetodoDistancia)){
			if(MetodoDistancia.equals("Levenshtein"))
				mapeamento.put(MetodoDistancia, new LevenshteinCalculator());
			else if(MetodoDistancia.equals("Demerau"))
				mapeamento.put(MetodoDistancia, new DemerauLevenshteinCalculator());
		}
		return mapeamento.get(MetodoDistancia);
	}
	
	public BurkhardKellerTree ArvoreBK(String MetodoDistancia){
		return new BurkhardKellerTree(GetMetodo(MetodoDistancia));
	}
}
