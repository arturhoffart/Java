/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaPratica1;

/**
 *
 * @author Dell
 */
public class Pessoa {
    private int codigo;
    private String nome;
    
    public Pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
