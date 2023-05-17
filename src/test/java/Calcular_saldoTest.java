import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calcular_saldoTest {
    @Test
    public void Calcular_saldo_porcentagem() {
        Calcular_saldo atual = new Calcular_saldo();
        float resultado = atual.Calcular_Saldo(200);
        float valor_test = 203;
        assertEquals(resultado, valor_test);
    }
}