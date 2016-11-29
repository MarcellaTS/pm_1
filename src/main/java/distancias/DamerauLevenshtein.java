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
public class DamerauLevenshtein implements Distancia{
    /*Calcula distância entre palavras pelo algoritmo de Damerau-Levenshtein:
        Essa distância é calculada pelo mínimo de operações para transformar uma palavra na outra.
        As operações consideradas nesse algoritmo são: inserir, deletar, substituir um caracter ou trocar dois carecteres de lugar.*/
    public int DistanciaEntrePalavras(String palavra_um, String palavra_dois){
        char caracter_x;
        char caracter_y;
        int custo;

        int tamanho_palavra_um = palavra_um.length ();
        int tamanho_palavra_dois = palavra_dois.length ();
        
        if (tamanho_palavra_um == 0) {
            return tamanho_palavra_dois;
        }
        if (tamanho_palavra_dois == 0) {
            return tamanho_palavra_um;
        }
        
        int[][] matriz_calcular_distancia = new int[tamanho_palavra_um+1][tamanho_palavra_dois+1];

        for (int x = 0; x <= tamanho_palavra_um; x++) {
            matriz_calcular_distancia[x][0] = x;
        }

        for (int y = 0; y <= tamanho_palavra_dois; y++) {
            matriz_calcular_distancia[0][y] = y;
        }

        for(int x = 1; x <= tamanho_palavra_um; x++) {
            caracter_x = palavra_um.charAt (x - 1);
            for(int y = 1; y <= tamanho_palavra_dois; y++) {
                caracter_y = palavra_dois.charAt (y - 1);

                if(caracter_x == caracter_y){
                    custo = 0;
                }else{
                    custo = 1;
                }
                int deletar = matriz_calcular_distancia[x - 1][y] + 1;
                int inserir = matriz_calcular_distancia[x][y - 1] + 1;
                int substituir = matriz_calcular_distancia[x - 1][y - 1] + custo;
                matriz_calcular_distancia[x][y] = Math.min(deletar, Math.min(inserir, substituir));
                
                //Verifica se a distância mínima ocorre a partir de uma das operações acima ou por transposição
                if(x > 1 && y > 1 && caracter_x == caracter_y-1 && caracter_x-1 == caracter_y){ 
                    matriz_calcular_distancia[x][y] = Math.min(matriz_calcular_distancia[x][y], matriz_calcular_distancia[x - 2][y - 2] + custo);
                }
            }
        }
        return matriz_calcular_distancia[tamanho_palavra_um][tamanho_palavra_dois];
    }
}
