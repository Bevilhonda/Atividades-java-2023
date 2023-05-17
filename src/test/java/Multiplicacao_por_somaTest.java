import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Multiplicacao_por_somaTest {

    @Test
    public void Multiplicacao_53_10(){
        Multiplicacao_por_soma teste = new Multiplicacao_por_soma();
        int  resultado = 530 ;
        int resultado_esperado = teste.Multiplicacao_por_Soma(53,10);
        assertEquals(resultado_esperado,resultado);
    }

    @Test
    public void Multiplicacao_1_0(){
        Multiplicacao_por_soma teste = new Multiplicacao_por_soma();
        int  resultado = 0 ;
        int resultado_esperado = teste.Multiplicacao_por_Soma(1,0);
        assertEquals(resultado_esperado,resultado);
    }

}