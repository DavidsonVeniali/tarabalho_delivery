/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desconto;

/**
 *
 * @author Davidson
 */
public class Cupom30 extends Desconto {

    private static Cupom30 instance;

    public Cupom30() {
        this.setTipo("Cupom 30%");
        this.setPercentual(0.3);
    }

    public static Cupom30 getInstance() {
        if (instance == null) {
            instance = new Cupom30();
        }
        return instance;
    }
}
