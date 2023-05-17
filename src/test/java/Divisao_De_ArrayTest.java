import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisao_De_ArrayTest {

    @Test
    void diferenca_Menor_Valor() {
        Divisao_De_Array atual = new Divisao_De_Array();
        int resultado_esperado = 2 ;
        int resultado  = atual.Diferenca_Menor_Valor(new int[]{3, 1, 2, 4, 3, 5});
        assertEquals(resultado_esperado,resultado);
    }

    @Test
    void menor_valor() {
        Divisao_De_Array novo = new Divisao_De_Array();
        int resultado_esperado = 2 ;
        int resultado  = novo.Menor_valor(new int[]{3, 1, 2, 4, 3, 5});
        assertEquals(resultado_esperado,resultado);

    }
}