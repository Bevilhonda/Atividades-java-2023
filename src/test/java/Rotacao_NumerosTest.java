import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rotacao_NumerosTest {
    @Test
    void  Rotacao_Array(){
        Rotacao_Numeros rotacao = new Rotacao_Numeros();
        int[] esperado = { 5,6,1,2,3,4};
        int[] atual = rotacao.Rotacao(new int[]{1, 2, 3, 4, 5, 6},2);
        assertArrayEquals(esperado,atual);
    }
}