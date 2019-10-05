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
public class AlunoApp {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(1, "Artur", 10.0f, 8.0f);
        Aluno aluno2 = new Aluno(2, "Sergio", 7.0f, 3.0f);
        
        System.out.println("O aluno "+ aluno1.getNome()+" foi "+ aluno1.verificaAprovacao());
        System.out.println("O aluno "+ aluno2.getNome()+" foi "+ aluno2.verificaAprovacao());
    }
    
}
