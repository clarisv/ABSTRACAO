
package com.mycompany.questionario;

public class Questionario {
    public static void main(String[] args) {
     ProvaUCB provaUCB = new ProvaUCB(8.5, 7.0);
     
     ProvaFafifo provaFafifo = new ProvaFafifo(4.5, 6.5);
     
        System.out.println("Aluno UCB aprovado? " + provaUCB.aprovado());
        System.out.println("Aluno Fafifo aprovado? " + provaFafifo.aprovado());
        
     
    }
}
