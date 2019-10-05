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
public class Aluno extends Pessoa implements SituacaoAcademica{
    private float nota1, nota2;
    
    public Aluno(int codigo, String nome, float nota1, float nota2){
        super(codigo, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public float getNota1(){
        return nota1;
    }
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    
    public float getNota2(){
        return nota2;
    }
    
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    
    public float calcularMedia(float nota1, float nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        return (nota1+nota2)/2;
        
    }
    public String verificaAprovacao(){
        if (calcularMedia(nota1, nota2) > 7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    
}
