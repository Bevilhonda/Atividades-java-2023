import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Antecessor_SucessorTest {

    @Test
    void calcular() {
        Antecessor_Sucessor atual = new Antecessor_Sucessor();
        int[] esperado = new int[]{19,21};
        int[] resultado = atual.Calcular(20);
        assertArrayEquals(esperado,resultado );
    }
}