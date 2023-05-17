import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculo_IPITest {

    @Test
    public void Calcula_IPI(){
        Calculo_IPI teste = new Calculo_IPI();
        float resultado_esperado = 1734.0f;
        float resultado = teste.Calculo_Ipi(200,300,4,3,2);
        assertEquals(resultado_esperado , resultado);
    }

}