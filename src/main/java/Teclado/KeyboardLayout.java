/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import Entidades.Linha;
import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class KeyboardLayout {
    private String model;
    private ArrayList<Linha> lines;
    int width = 0;
    int height = 0;
    char teclasMatrix[][];
    final int ALPHABETSIZE = 26;
    double distanciasMatrix[][];
    
    public KeyboardLayout(){
        lines = new ArrayList<Linha>();
    }
    
    public void getLayoutByName(){
        
    }
    
    public double getNominalDistance(){
        return null;
    }
    
    public void prepareDistances(){
        
    }
}
