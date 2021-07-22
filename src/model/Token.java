/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KLabs
 */
public class Token {
    private String classe;
    private String lex;
    private int pos;
    private int linha;

    public Token(){
        
    }
    
     public Token(String classe, String lex, int linha){
         this.lex=lex;
         this.classe=classe;
         this.linha=linha;
  
            
    }
    
     public Token(String classe, String lex, int linha,int pos){
         this.lex=lex;
         this.classe=classe;
         this.linha=linha;
         this.pos=pos;
            
    }
     
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLex() {
        return lex;
    }

    public void setLex(String lex) {
        this.lex = lex;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }
    
}
