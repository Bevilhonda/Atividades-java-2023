import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class comparaArrays {

    @Test
    public void Resultado(){
       Antecessor_Sucessor nova = new Antecessor_Sucessor();
       int[] teste = new int[]{11, 13};
       int[] lista = nova.Calcular(12);
       assertArrayEquals(lista,teste);
    }

}