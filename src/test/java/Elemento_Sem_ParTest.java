import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Elemento_Sem_ParTest {

    @Test
    void elemento_Sozinho() {
        Elemento_Sem_Par primeiro_exemplo = new Elemento_Sem_Par();
        int esperado = 7;
        int atual = primeiro_exemplo.Elemento_Sozinho(new int[]{9, 3, 9, 3, 9, 7, 9});
        assertEquals(esperado,atual);
    }

    @Test
    void elemento_So() {
        Elemento_Sem_Par segundo_exemplo = new Elemento_Sem_Par();
        int esperado = 7;
        int atual = segundo_exemplo.Elemento_So(new int[]{9, 3, 9, 3, 9, 7, 9});
        assertEquals(esperado,atual);

    }

    @Test
    void index_Sem_Par() {
        Elemento_Sem_Par terceiro_exemplo = new Elemento_Sem_Par();
        int esperado = 7;
        int atual = terceiro_exemplo.Index_Sem_Par(new int[]{9, 3, 9, 3, 9, 7, 9});
        assertEquals(esperado,atual);

    }

    @Test
    void ordenar() {
        Elemento_Sem_Par quarto_exemplo = new Elemento_Sem_Par();
        int esperado = 7;
        int atual = quarto_exemplo.Ordenar(new int[]{9, 3, 9, 3, 9, 7, 9});
        assertEquals(esperado,atual);

    }
}