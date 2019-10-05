/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaPratica3;

/**
 *
 * @author Dell
 */
public class ContaCorrenteApp {
    
    public static void main(String[] args){
        
        ContaCorrente cc = new ContaCorrente(1,1);
        ContaCorrente ce = new ContaCorrente (2, 1, 10000.0f);
        
        System.out.println("Conta comum numero: "+cc.getNumero()+" | Agencia: "+ cc.getAgencia());
        System.out.println("Conta especial numero: "+ce.getNumero()+" | Agencia: "+ ce.getAgencia()+" | Limite: R$"+ce.getLimite());
        
    }
    
}
