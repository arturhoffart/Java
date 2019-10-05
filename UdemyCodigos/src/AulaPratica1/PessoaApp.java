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
public class PessoaApp {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(1,"Artur");
        Pessoa pessoa2 = new Pessoa(2, "João");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
    }
    
}
