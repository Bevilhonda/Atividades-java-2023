import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Calcula_Media_AritimeticaTest {

    @Test
    public void Teste_Calcula_Media_Aritimetica(){
        Calcula_Media_Aritimetica atual = new Calcula_Media_Aritimetica();
        int valor_teste = 31;
        int media = atual.Calcula_Media_Aritimetica(45,50);
        assertEquals(media ,valor_teste);
    }
}