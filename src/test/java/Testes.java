
import builder.CestaBasicaBuilder;
import builder.Diretor;
import org.junit.jupiter.api.Test;
import state.Pedido;
import static org.junit.jupiter.api.Assertions.assertEquals;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Davidson
 */
public class Testes {

    @Test
    public void testeCesta() {
        CestaBasicaBuilder builder = new CestaBasicaBuilder();
        Diretor diretor = new Diretor(builder);
        Pedido pedido = new Pedido(1);

        diretor.maker();

        pedido.setItens(builder.getItens());

        assertEquals(pedido.getItens().get(0).getProduto().getNome(), "1 KG de Carne Bovina");

    }

    @Test
    public void testeCestaPremiun() {
        CestaBasicaBuilder builder = new CestaBasicaBuilder();
        Diretor diretor = new Diretor(builder);
        Pedido pedido = new Pedido(1);

        diretor.maker();

        pedido.setItens(builder.getItens());

        assertEquals(pedido.getItens().get(0).getProduto().getNome(), "1 KG de Carne Bovina");

    }

    @Test
    public void testeCestaTop() {
        CestaBasicaBuilder builder = new CestaBasicaBuilder();
        Diretor diretor = new Diretor(builder);
        Pedido pedido = new Pedido(1);

        diretor.maker();

        pedido.setItens(builder.getItens());

        assertEquals(pedido.getItens().get(0).getProduto().getNome(), "1 KG de Carne Bovina");

    }

}
