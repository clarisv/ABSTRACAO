
package com.mycompany.questionario;

public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(double notaAV1, double notaAV2){
        super(notaAV1, notaAV2);
    }
     public boolean aprovado(){
        return calcularMedia() >= 7;
    }
}
