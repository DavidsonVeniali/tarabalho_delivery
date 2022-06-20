/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imposto;

/**
 *
 * @author Davidson
 */
public class Imposto3 extends Imposto{
    private static Imposto3 instance;

    public Imposto3() {
        this.setNome("Imposto 3 aplicado");
        this.setPercentual(0.06);
    }

    public static Imposto3 getInstance() {
        if (instance == null) {
            instance = new Imposto3();
        }
        return instance;
    }
}

