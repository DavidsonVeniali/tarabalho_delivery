/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imposto;

/**
 *
 * @author Davidson
 */
public class Imposto1 extends Imposto {

    private static Imposto1 instance;

    public Imposto1() {
        this.setNome("Imposto 1 Aplicado");
        this.setPercentual(0.03);
    }

    public static Imposto1 getInstance() {
        if (instance == null) {
            instance = new Imposto1();
        }
        return instance;
    }
}