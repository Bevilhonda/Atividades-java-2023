import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Merge_Sort_CopiTest {

    @Test
    public void Merge_Sorte_Simples() {
        Merge_Sort_Copi atual = new Merge_Sort_Copi();
        int[] array_atual_ordenados = {2, 4, 6, 8, 12, 13, 15, 18, 19, 22, 23, 25, 29, 34, 35, 39};// array de numeros já ordenados
        int[] array_esperado_ordenado = atual.Start_Merge_Sort(new int[]{6, 12, 13, 19, 25, 34, 8, 2, 15, 22, 29, 35, 18, 4, 23, 39});
        assertArrayEquals(array_atual_ordenados, array_esperado_ordenado);
    }
}