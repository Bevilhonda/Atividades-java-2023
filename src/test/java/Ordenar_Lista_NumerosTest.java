import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ordenar_Lista_NumerosTest {
    @Test
    public void Lista_Ordenada() {
        Ordenar_Lista_Numeros teste = new Ordenar_Lista_Numeros();

        int[] lista_atual_10_indice = teste.lista_ordenada(new int[]{2, 5, 6, 4, 3, 1, 10, 7, 8, 9});
        int[] lista_esperada = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= lista_atual_10_indice.length - 1; i++) {
            assertEquals(lista_esperada[i], lista_atual_10_indice[i]);
        }
    }

    @Test
    public void Lista_Com_1_Indice() {
        Ordenar_Lista_Numeros um_indice = new Ordenar_Lista_Numeros();

        int[] lista_atual_1_indice = um_indice.lista_ordenada(new int[]{2});
        int[] lista_esperada = new int[]{2};
        for (int i = 0; i < lista_atual_1_indice.length; i++) {
            assertEquals(lista_esperada[i], lista_atual_1_indice[i]);
        }
    }

    @Test
    public void Lista_Com_25_numeros() {
        Ordenar_Lista_Numeros um_indice = new Ordenar_Lista_Numeros();

        int[] lista_atual_10_indice = um_indice.lista_ordenada(new int[]{2, 5, 6, 4, 3, 1, 10, 7, 8, 9, 11});
        int[] lista_esperada = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        for (int i = 0; i <= lista_atual_10_indice.length - 1; i++) {
            assertEquals(lista_esperada[i], lista_atual_10_indice[i]);
        }
    }

    @Test
    public void Lista_Vazia() {
        Ordenar_Lista_Numeros um_indice = new Ordenar_Lista_Numeros();

        int[] lista_atual_ordenada = um_indice.lista_ordenada(new int[]{});
        int[] lista_vazia = new int[]{};
        for (int i = 0; i <= lista_atual_ordenada.length - 1; i++) {
            assertEquals(lista_vazia[i], lista_atual_ordenada[i]);
        }
    }

    @Test
    public void Comparar_Arrays() {
        Ordenar_Lista_Numeros lista_de_numeros = new Ordenar_Lista_Numeros();
        int[] lista_atual_para_ordenar = lista_de_numeros.lista_ordenada(new int[]{2, 5, 6, 4, 3, 1, 10, 7, 8, 9});
        int[] lista_esperada_ordenada = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(lista_esperada_ordenada, lista_atual_para_ordenar);
    }
}