/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancias;

/**
 *
 * @author marce
 */
public class Levenshtein {
    /*Calcula distância entre palavras pelo algoritmo de Levenshtein:
        Essa distância é calculada pelo mínimo de operações para transformar uma palavra na outra.
        As operações consideradas nesse algoritmo são: inserir, deletar ou substituir um caracter.*/
    public int DistanciaLevenshtein(String palavra_um, String palavra_dois){
        char[] array_palavra_um = palavra_um.toUpperCase().toCharArray();
        char[] array_palavra_dois = palavra_dois.toUpperCase().toCharArray();

        int[][] matriz_calcular_distancia = new int[array_palavra_um.length + 1][array_palavra_dois.length + 1];
        
        int custo = 0;

        for (int x = 0; x < array_palavra_um.length + 1; x++) {
            matriz_calcular_distancia[x][0] = x;
        }
        for (int y = 0; y < array_palavra_dois.length + 1; y++) {
            matriz_calcular_distancia[0][y] = y;
        }

        for (int x = 1; x < array_palavra_um.length + 1; x++) {
            for (int y = 1; y < array_palavra_dois.length + 1; y++) {
                    custo = 1;
                if(array_palavra_um[x - 1] == array_palavra_dois[y - 1]){
                    custo = 0;
                }
                int deletar = matriz_calcular_distancia[x - 1][y] + 1;
                int inserir = matriz_calcular_distancia[x][y - 1] + 1;
                int substituir = matriz_calcular_distancia[x - 1][y - 1] + custo;
                matriz_calcular_distancia[x][y] = Math.min(deletar, Math.min(inserir, substituir));
            }
        }

        int resultado = matriz_calcular_distancia[array_palavra_um.length][array_palavra_dois.length];

        return resultado;
    }    
}
