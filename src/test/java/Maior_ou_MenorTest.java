import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maior_ou_MenorTest {

    @Test
    public void Numero_Maior_de_3(){
        Maior_ou_Menor teste = new Maior_ou_Menor();
        long resultado_esperado = 300 ;
        long resultado = teste.Numero_Maior_Menor(30,203,300);
        assertEquals(resultado_esperado,resultado);
    }

}