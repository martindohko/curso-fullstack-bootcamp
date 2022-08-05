/*
Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.
*/
/*
Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
 */
public class Entregable {

    public static void main(String[] args) {
        //parte 1
        System.out.println(suma(10, 20, 30));

        //parte 2
        Coche miCoche = new Coche();
        miCoche.incrementa();
        System.out.println(miCoche.puertas);
        miCoche.incrementa();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b+ c;
    }
}    
class Coche{
    public int puertas = 0;

    public void incrementa(){
        puertas++;
    }
}

