//Funciones, nos sirve para evitar repetir código
//cada función tiene el prototipo llamado "Firma"

public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        //Función Callback
        var mivariable = sumaRec;
        resultado = mivariable(10,20);
        //**************** */
        resultado = suma(4,2);//llamado a la función suma
        System.out.println(resultado);
    }

    public static int suma(int a, int b) {//función suma
        var resultado = a + b;
        return resultado;//lo uso más adelante en la lógica del programa
    }
    public static void sumaSinRetorno(int a, int b) {//función suma
        var resultado = a + b;
        System.out.println(resultado);
    }

    //Funciones recursivas
    public static int sumaRec(int a, int b) {//función suma
        var resultado = 0;
        if (a != 0) return resultado + suma(a--, b);
        else return resultado;//lo uso más adelante en la lógica del programa
    }

}