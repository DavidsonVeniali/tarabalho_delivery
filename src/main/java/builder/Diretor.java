/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Davidson
 */
public class Diretor {
    
    private Builder builderDiretor;

    public Diretor(Builder builderDiretor) {
        this.builderDiretor = builderDiretor;
    }

    public void setBuilderDiretor(Builder builderDiretor) {
        this.builderDiretor = builderDiretor;
    }
    
    public void maker(){
        builderDiretor.insereItens();
    }
    
}
