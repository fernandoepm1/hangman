/*
      @author fernandoepm1
*/

package components;

import java.util.ArrayList;

public class Word {
      private ArrayList<String> categories = {
            "Partes do corpo",
            "Frutas",
            "Animais",
            "Objetos"
      };
      
      private String[][] storage = {
            { "Cabelo" }, { "Ombro" }, { "Joelho" }, { "Pé" },
            { "Manga" }, { "Caju" }, { "Cajá" }, { "Abacaxi" }, { "Jabuticaba" } 
      };
      
      public void mostrar() {
            System.out.println(storage[0][1]);
      }
}
