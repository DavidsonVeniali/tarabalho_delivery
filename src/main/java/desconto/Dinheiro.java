/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desconto;

/**
 *
 * @author Davidson
 */
public class Dinheiro extends Desconto {

    private static Dinheiro instance;

    public Dinheiro() {
        this.setTipo("Dinheiro");
        this.setPercentual(0.30);
    }

    public static Dinheiro getInstance() {
        if (instance == null) {
            instance = new Dinheiro();
        }
        return instance;
    }
}
