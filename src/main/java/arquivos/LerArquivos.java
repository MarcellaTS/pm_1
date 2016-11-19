/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Entidades.ListaDePalavras;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marce
 */
public class LerArquivos {
    public void LerTxt(String NomeArquivo){
        System.out.printf("\nConteúdo do arquivo texto:\n");
        ListaDePalavras lista_de_palavras = new ListaDePalavras();
        try {
            FileReader arquivo = new FileReader(NomeArquivo);
            BufferedReader ler_arquivo = new BufferedReader(arquivo);
            String linha = ler_arquivo.readLine();
            while (linha != null) {
                lista_de_palavras.AddPalavra(linha);
                System.out.printf("%s\n", linha);
                linha = ler_arquivo.readLine(); 
            }
            arquivo.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        System.out.println();
    }
    
    public void LerXml(String NomeArquivo) throws FileNotFoundException{
        XMLDecoder d = new XMLDecoder(
                          new BufferedInputStream(
                              new FileInputStream(NomeArquivo)));
        Object result = d.readObject();
        d.close();
    }
}
