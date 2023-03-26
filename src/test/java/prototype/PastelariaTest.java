package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PastelariaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Pastelaria pastelaria = new Pastelaria(124, "Pastelaria Original", new Entrega("Rua C", 41), "Mendes");

        Pastelaria pastelariaClone = pastelaria.clone();
        pastelariaClone.setNumeroPedido(233);
        pastelariaClone.setCliente("Pastelaria Clonado");
        pastelariaClone.getEntrega().setNumero(46);

        assertEquals("Pastelaria{numeroPedido=124, cliente='Pastelaria Original', endereco=Entrega{logradouro='Rua C', numero=41}, localEntrega='Mendes'}", pastelaria.toString());
        assertEquals("Pastelaria{numeroPedido=233, cliente='Pastelaria Clonado', endereco=Entrega{logradouro='Rua C', numero=46}, localEntrega='Mendes'}", pastelariaClone.toString());
    }
}
