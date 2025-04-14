
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {

    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5.0, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1.0, calc.subtrair(5, 4));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6.0, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(10, 5));
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test
    public void testPotenciar() {
        assertEquals(8.0, calc.potenciar(2, 3));
    }
}
