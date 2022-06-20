/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imposto;

/**
 *
 * @author Davidson
 */
public class Imposto2 extends Imposto{

    private static Imposto2 instance;

    public Imposto2() {
        this.setNome("Imposto 2 aplicado");
        this.setPercentual(0.08);
    }

    public static Imposto2 getInstance() {
        if (instance == null) {
            instance = new Imposto2();
        }
        return instance;
    }
}