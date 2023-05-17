import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calcula_salarioTest {

    @Test
    public void Calcular_Salario(){
        Calcula_salario test = new Calcula_salario();
        float teste = 1;
        float resultado = test.Calcula_Salario(1320,1320);
        assertEquals(resultado,teste);

    }

}