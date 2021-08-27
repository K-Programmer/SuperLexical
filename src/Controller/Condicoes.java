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

    static String numeros = "1234567890";

    static List<String> reservada = Arrays.asList("div", "or", "and", "not", "if", "then", "else",
            "of", "while", "do", "begin", "end", "read", "write", "var", "array", "function",
            "procedure", "program", "true", "false", "char", "integer", "boolean",
            "+", "­", "*", "=", "<", ">", "<=", ">=", "(", ")", "[", "]", ":", ".", "..", ",", ";", ":", ":=", "<>");

    static String letras = "abcdefghijklmno\n"
            + "pqrstuvwxyzABC\n"
            + "DEFGHIJKLMNOP\n"
            + "QRSTWVWXYZ";

    
  
    //Metodo que verifica se e'  digito
    public static boolean numero(String str) {

        boolean result = true;

        for (int i = 0; i < str.length(); i++) {
            if (!(numeros.contains(str.valueOf(str.charAt(i))))) {
                result = false;
                break;
            }
        }

        return result;
    }
    //Metodo que verifica se e' simbolo

    private static boolean simbolo(String str) {
        boolean result = false;
        for (int i = 0; i < reservada.size() - 1; i++) {
            if (reservada.get(i).equalsIgnoreCase(str)) {
                result = true;
                break;
            }
        }
        return result;
    }

//Metodo que verifica se e' identificador
    public static boolean identificador(String identificador) {
        boolean result = true;
        if ((letras.contains(identificador.substring(0, 1)))) {// verifica se o primeiro caracter e' uma letra
            for (int i = 1; i <= identificador.length() - 1; i++) {
                if ((letras.contains(String.valueOf(identificador.charAt(i))))) {
                    result = true;

                }
            }
        } else {
            result = false;
        }
        return result;
    }

    //Metodo que verifica retorna a classe  do lexema
    public static String validar(String str) {
        String classe = "Indefinido";
        if (str.isEmpty()) {

            return "";
        }

        if (simbolo(str)) {
            classe = "Simbolo especial";
            return classe;
        }

        if (numero(str)) {
            classe = "Numero";
            return classe;

        }

        if (identificador(str)) {
            classe = "Identificador";
            return classe;
        }

        return classe;
    }

}
