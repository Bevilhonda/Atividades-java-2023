import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Media_Ponderada_AritimeticaTest {

    @Test
    public void Media_Ponderada(){
        Media_Ponderada_Aritimetica teste = new Media_Ponderada_Aritimetica();
        int resultado_esperado = teste.Media_Ponderada(50,60,70,2,3,3,4);
        int resultado_obtido = 61 ;
        assertEquals(resultado_esperado,resultado_obtido);
    }

}