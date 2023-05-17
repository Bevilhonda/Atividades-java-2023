import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Soma_ConsecutivaTest {
    @Test
    public void Teste_Soma_Consecutiva() {
        Soma_Consecutiva teste = new Soma_Consecutiva();
        int valor_esperado = 27;
        int resultado = teste.Soma(3, 9);
        assertEquals(valor_esperado, resultado);
    }

    @Test
    public void Multiplicacao_0_0() {
        Soma_Consecutiva atual = new Soma_Consecutiva();
        int valor_esperado = 0;
        int resultado = atual.Soma(0, 0);
        assertEquals(valor_esperado, resultado);
    }

    @Test
    public void Multiplicacao_0_1() {
        Soma_Consecutiva atual = new Soma_Consecutiva();
        int valor_esperado = 0;
        int resultado = atual.Soma(0, 1);
        assertEquals(valor_esperado, resultado);
    }

    @Test
    public void Multiplicacao_53_10() {
        Soma_Consecutiva atual = new Soma_Consecutiva();
        int valor_esperado = 530;
        int resultado = atual.Soma(53, 10);
        assertEquals(valor_esperado, resultado);
    }


}