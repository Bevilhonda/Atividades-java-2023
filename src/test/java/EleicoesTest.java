import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EleicoesTest {
    @Test
    public void Eleicoes(){
        Eleicoes teste = new Eleicoes();
        float resultado_esperado = 75f;
        float resultado = teste.Percentual_Eleicoes(1000,200,50);
        assertEquals(resultado_esperado,resultado);
    }

}