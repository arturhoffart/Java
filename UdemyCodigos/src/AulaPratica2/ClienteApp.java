/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaPratica2;

/**
 *
 * @author Dell
 */
public class ClienteApp {
    
    public static void main(String[] args){
        ClientePF pfcli = new ClientePF("Artur", "José Marques", "29626627");
        ClientePJ pjcli = new ClientePJ("José", "Alameda 1", "123456789");
    
        System.out.println("Dados do cliente PF: "+ pfcli.getNome()+ " "+ pfcli.getEndereco()+" "+pfcli.getCpf());
        System.out.println("Dados do cliente PJ: "+ pjcli.getNome()+ " "+ pjcli.getEndereco()+" "+pjcli.getCnpj());
        
        System.out.println(pfcli.toString());
        System.out.println(pjcli.toString());
        
    }
    
    
}
