package Proyecto;

//Importacion de las clases
import Proyecto.Numerologia;
import Proyecto.ClaseAbstracta;

//Clase main
public class ClaseMain {
    public static void main(String[] args){
        //Instancia
        Numerologia numerologia = new Numerologia();
        System.out.println(numerologia.calcularEdad(2022, 4, 1, 2003, 7, 27));
        System.out.println(numerologia.convertirEdadEnHoras());
        System.out.println(numerologia.identificarSignoZodiacal());
        System.out.println(numerologia.calcularNumeroSuerte());
        System.out.println(ClaseAbstracta.calcularEdad(2022, 4, 1, 2003, 7, 27));
        System.out.println(ClaseAbstracta.identificarSignoZodiacal(7, 27));
        System.out.println(ClaseAbstracta.calcularNumeroSuerte(2003));
    }
}