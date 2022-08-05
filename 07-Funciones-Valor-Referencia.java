//Pasaje de parámetros por Valor y por Referencia

//Pasaje de por Valor
//Se crea una copia en memorio de la variable que pasamos por parámetro
//
public class Main{
    public static void main(String[] args) {
        int resultado = 0;
        int parametro1 = 10;
        int parametro2 = 20;

        //se crea una copia de parametro1 y parametro2
        resultado = sumaPorValor(parametro1,parametro2);
        System.out.println(resultado);
        resultado = sumaPorReferencia(parametro1,parametro2,&resultado);
        System.out.println(resultado);
    }

    
    public static int sumaPorValor(int a, int b) {
        //recibe la copia de lo que hay en la dirección de memoria de parametro1 y parametro2
        //y lo guarda en la dirección reservada para el parámetro a y b
        //se duplica la cantidad de memoria usada
        var resultado = a + b;
        return resultado;
    }
    public sumaPorReferencia(int a, int b, *int c) {
        //modifica directamente el contenido en la dirección de memoria
        //de la variable resultado que paso por parámetro a c
        //no se duplica la cantidad de memoria usada
        var c = a + b;
    }
}