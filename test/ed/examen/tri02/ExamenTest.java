
package ed.examen.tri02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class ExamenTest {

    public ExamenTest() {
    }
    /**
     * Test para comprobar que el tamaño maximo del array es 100
     * @throws Exception excepcion que muestra que no se pueden comprar mas de 100 números
     */
    @Test
    public void testTamañoMaximoArray() throws Exception {
        System.out.println("testTamañoMaximoArray");
        int[] listaEnteros =new int[101];
        int expResult = 0;
        int result = Examen.elMayorDe(listaEnteros);
        assertEquals(expResult, result);
    }
    /**
     * Test para comprobar que no se puede introducir un array vacio
     * @throws Exception excepcion que muestra que no se puede introducir un array vacio
     */
    @Test
    public void testListaVacia() throws Exception {
        System.out.println("testListaVacia");
        int[] listaEnteros =null;
        int expResult = 0;
        int result = Examen.elMayorDe(listaEnteros);
        assertEquals(expResult, result);
    }
    /**
     * Test que compara 3 el mayor de 3 números y muestra el 3º
     * @throws Exception 
     */
    @Test
    public void testTerceraPosicionNumeroMayor() throws Exception {
        System.out.println("testTerceraPosicionNumeroMayor");
        int[] listaEnteros =new int[]{1,2,3};
        int expResult = 3;
        int result = Examen.elMayorDe(listaEnteros);
        assertEquals(expResult, result);
    }
    /**
     * Test que compara 3 el mayor de 3 números y muestra el 1º
     * @throws Exception 
     */
    @Test
    public void testPrimeraPosicionNumeroMayor() throws Exception {
        System.out.println("testPrimeraPosicionNumeroMayor");
        int[] listaEnteros =new int[]{3,2,1};
        int expResult = 3;
        int result = Examen.elMayorDe(listaEnteros);
        assertEquals(expResult, result);
    }
    /**
     * Test que compara 3 el mayor de 3 números y muestra el 2º
     * @throws Exception 
     */
    @Test
    public void testSegundaPosicionNumeroMayor() throws Exception {
        System.out.println("testSegundaPosicionNumeroMayor");
        int[] listaEnteros =new int[]{1,3,2};
        int expResult = 3;
        int result = Examen.elMayorDe(listaEnteros);
        assertEquals(expResult, result);
    }
    
    
}
