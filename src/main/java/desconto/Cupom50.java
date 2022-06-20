/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desconto;

/**
 *
 * @author Davidson
 */
public class Cupom50 extends Desconto{
    private static Cupom50 instance;

    public Cupom50() {
        this.setTipo("Cupom 50%");
        this.setPercentual(0.5);
    }

    public static Cupom50 getInstance() {
        if (instance == null) {
            instance = new Cupom50();
        }
        return instance;
    }
}