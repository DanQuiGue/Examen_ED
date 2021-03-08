package ed.examen.tri02;

//Repositorio: https://github.com/DanQuiGue/Examen_ED
/**
 * * @author Juan Carlos Granero Maraver <jgramar761@iesportada.org>
 */
public class Examen {

    public static int TAMAÑOMAXIMO = 100;

    public static int elMayorDe(int[] listaEnteros) throws Exception {
        if (listaEnteros == null) {
            throw new Exception("Lista de números vacía, no se puede calcular el máximo");
        }
        if (listaEnteros.length > TAMAÑOMAXIMO) {
            throw new Exception("Lista de números demasido grande, no se puede calcular el máximo");
        }
        int mayor = listaEnteros[0];
        for (int i = 1; i < listaEnteros.length; i++) {
            if (mayor < listaEnteros[i]) {
                mayor = listaEnteros[i];
            }
        }
        return mayor;
    }
}
