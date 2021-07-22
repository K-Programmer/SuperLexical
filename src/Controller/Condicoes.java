/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Arrays;
import java.util.List;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author KLabs
 */
public class Condicoes {
    
    static String numeros ="1234567890";
    

   static List<String>reservada =Arrays.asList("div","or", "and", "not","if", "then", "else",
          "of","while","do"," begin", "end", "read", "write", "var", "array", "function",
          "procedure", "program", "true", "false", "char", "integer", "boolean",
          "+","­","*","=","<",">","<=",">=","(",")","[","]",":",".","..",",",";",":",":=","<>");
    
   static String letras="a b c d e f g h i j k l m n o \n" +
                        "p q r s t u v w x y z A B C \n" +
                        "D E F G H I J K L M N O P \n" +
                        "Q R S T W V W X Y Z ";
   
      public static boolean numero(String str){
      
          boolean result=true;
    
      for(int i=0;i<str.length();i++){
          if(!(numeros.contains(str.valueOf(str.charAt(i))))){
              result=false;
              break;
          }
      }
           
      return result;
  }
       private  static boolean simbolo(String str) {
      boolean result=false;
      for(int i=0;i<reservada.size()-1;i++){
          if(reservada.get(i).equalsIgnoreCase(str)){
           result=true;
          break;
          }
      }
     return result;
    }

  
 
//Metodo que verifica se e' identificador
 public static boolean identificador(String identificador){
     boolean result=true;
     if((letras.contains(identificador.substring(0, 1)))){// so entra no ciclo se o primeiro caracter for uma letra
         for(int i=1;i<=identificador.length()-1;i++){
            if( (letras.contains(identificador.charAt(i)+""))){
                result=true;
            
         }
     }
     }else
         result=false;
     return result;
 }
 
 //Metodo que verifica retorna
 
      public static String validar(String str){
  String classe="Indefinido";
          if(str.isEmpty()){
              
              
             return "";
          }
        
          
    if(simbolo(str)){
      classe= "Simbolo especial";  
      return classe;
    }
        
    
       if(numero(str)){
        classe= "Digito";
        return classe;
        
       }
      
        if(identificador(str)){
          classe="Identificador";
          return classe;
        }
        
           return classe;
 }
      

    
    
}
