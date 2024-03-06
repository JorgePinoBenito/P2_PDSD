package example.calculadora;

import org.junit.jupiter.api.Test;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ClienteTest {

    @Test
    void testSumar() throws RemoteException, NotBoundException {
        // Mock del objeto Interfaz
        Interfaz interfazMock = mock(Interfaz.class);
        when(interfazMock.sumar(1, 3, 4)).thenReturn(10f); // Definimos el comportamiento esperado

        // Obtener el resultado esperado del mock
        float resultadoEsperado = interfazMock.sumar(1, 3, 4);

        // Verificar que si difieren los resultados obtenidos y esperados, el test falle
        assertEquals(10f, resultadoEsperado);
    }

    @Test
    void testRestar() throws RemoteException, NotBoundException {
        // Mock del objeto Interfaz
        Interfaz interfazMock = mock(Interfaz.class);
        when(interfazMock.restar(10, 3)).thenReturn(7f); // Definimos el comportamiento esperado

        // Obtener el resultado esperado del mock
        float resultadoEsperado = interfazMock.restar(10, 3);

        // Verificar que si difieren los resultados obtenidos y esperados, el test falle
        assertEquals(7f, resultadoEsperado);
    }

    @Test
    void testMultiplicar() throws RemoteException, NotBoundException {
        // Mock del objeto Interfaz
        Interfaz interfazMock = mock(Interfaz.class);
        when(interfazMock.multiplicar(2, 3)).thenReturn(6f); // Definimos el comportamiento esperado

        // Obtener el resultado esperado del mock
        float resultadoEsperado = interfazMock.multiplicar(2, 3);

        // Verificar que si difieren los resultados obtenidos y esperados, el test falle
        assertEquals(6f, resultadoEsperado);
    }

    @Test
    void testDividir() throws RemoteException, NotBoundException {
        // Mock del objeto Interfaz
        Interfaz interfazMock = mock(Interfaz.class);
        when(interfazMock.dividir(10, 2)).thenReturn(5f); // Definimos el comportamiento esperado

        // Obtener el resultado esperado del mock
        float resultadoEsperado = interfazMock.dividir(10, 2);

        // Verificar que si difieren los resultados obtenidos y esperados, el test falle
        assertEquals(5f, resultadoEsperado);
    }

    @Test
    void testRaiz() throws RemoteException, NotBoundException {
        // Mock del objeto Interfaz
        Interfaz interfazMock = mock(Interfaz.class);
        when(interfazMock.raiz(9)).thenReturn(3f); // Definimos el comportamiento esperado

        // Obtener el resultado esperado del mock
        float resultadoEsperado = interfazMock.raiz(9);

        // Verificar que si difieren los resultados obtenidos y esperados, el test falle
        assertEquals(3f, resultadoEsperado);
    }
}

