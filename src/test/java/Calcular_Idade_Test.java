import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calcular_Idade_Test {
    @Test
    public void Calcula_dias_ida(){
        Calcular_Idade atual = new Calcular_Idade();
        int valor_esperado = atual.Calcular_Idade(41,6,30);
        int valor_obtido = 15175;
        assertEquals(valor_esperado,valor_obtido);
    }

}