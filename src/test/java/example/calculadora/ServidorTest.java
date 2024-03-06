package example.calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

public class ServidorTest {
    private Servidor servidor;

    @Before
    public void setUp() throws RemoteException, AlreadyBoundException {
        servidor = new Servidor();
    }

    @After
    public void tearDown() {
        servidor = null;
    }

    @Test
    public void testMain() {
        assertNotNull(servidor);
    }
}




    