package example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class parseadorTest {
    private final parseador parseador = new parseador();
    public void obtenerParte1Unidades() {
        String ecuacion1 = "2x - 1 = 0";
        int resultado = parseador.obtenerParte1(ecuacion1);
        assertEquals(2, resultado);
    }
    @Test
    public void obtenerParte2Suma() {
        String ecuacion1 = "2x + 1 = 0";
        int resultado = parseador.obtenerParte2(ecuacion1);
        assertEquals(1, resultado);
    }
    @Test
    public void obtenerParte3Positivo() {
        String ecuacion1 = "2x + 1 = 3";
        int resultado = parseador.obtenerParte3(ecuacion1);
        assertEquals(3, resultado);
    }
    @Test
    public void obtenerOperadorSuma() {
        String ecuacion2 = "2x + 1 = 0";
        String operador = parseador.obtenerOperador(ecuacion2);
        assertEquals("+", operador);
    }
}