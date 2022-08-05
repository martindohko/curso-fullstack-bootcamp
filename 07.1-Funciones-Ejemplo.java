public class Main{
    public static void main(String[] args) {
        caraDePapa miCaraDePapa = new caraDePapa();
        miCaraDePapa.QuitarBrazo();
        miCaraDePapa.QuitarBrazo();
        miCaraDePapa.QuitarBrazo();
        
        System.out.println(miCaraDePapa.brazos);
    }
}
    
class caraDePapa {
    //Propiedades
    public int brazos = 0;

    //Funciones
    public void QuitarBrazo(){
        this.brazos--;
    }
}
