/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversa;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Conversa{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        PessoaA p1 = new PessoaA();
        Pessoa p2 = new Pessoa();
                
        p1.nome = "Pedro";
        p1.idade = 23;
        p1.nomedaMae = "Maria Teresa";
        
        p2.nome = "Julia";
        p2.idade = 17;
        p2.nomedaMae = "Cleusa Soares";
        
        p1.saudacao(p1.nome);
        p2.saudacao(p2.nome);
        
        p1.perguntaIdade(p1.nome);
        p2.respondeIdade(p2.idade);
        
        p1.perguntaIdade(p1.nome);
        p2.respondeIdade(p2.idade);
        
        p1.perguntaNomeMae(p1.nome);
        p2.respondeNomeMae(p2.nomedaMae);
        
        p1.perguntaNomeMae(p1.nome);
        p2.respondeNomeMae(p2.nomedaMae);
        
        
        String resp = "";
        
        do {
            System.out.println("Deseja cortejar?(S/N)");
            resp = scan.nextLine();
            
            if(resp.equals("S"))
            {
                p1.cantada(j.nome);
                p2.sentimento = "Tristeza";
            }
            else if(resp.equals("N"))
            {
                p2.sentimento = "Feliz";
            }
            else 
            {
                System.out.println("Caracter inválido!");
            }
            
        }while(resp == "S" || resp == "N");
        
        p2.sentimentoMetodo(p2.sentimento);
        
    }
    
}
