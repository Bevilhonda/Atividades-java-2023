import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Negativo_ou_PositivoTest {
    @Test
    public void Negativo_ou_Positivo(){
        Negativo_ou_Positivo atual = new Negativo_ou_Positivo();

        String resposta_esperada = atual.Negativo_Positivo(1);
        String resposta = "Positivo";
        assertEquals(resposta_esperada,resposta);
    }
}