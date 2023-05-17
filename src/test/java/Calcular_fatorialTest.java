import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calcular_fatorialTest {

    @Test
    public void Calcula_Fatorial(){
        Calcular_fatorial numero = new Calcular_fatorial();
        int resultado = 720 ;
        int numero_calcular = numero.Calcular_Fatorial(6);
        assertEquals(numero_calcular , resultado);
    }
}