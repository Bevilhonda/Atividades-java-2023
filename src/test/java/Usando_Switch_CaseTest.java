import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Usando_Switch_CaseTest {

    @Test
    void contar_Zeros_Binario() {
        Usando_Switch_Case caso1 = new Usando_Switch_Case();
        int esperado = 2;
        int resultado = caso1.Contar_Binario_Meu_Codigo(9);
        assertEquals(esperado,resultado);
      



    }
}