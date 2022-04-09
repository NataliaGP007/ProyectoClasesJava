package Proyecto;

//Clase abstracta
public abstract class ClaseAbstracta {

    //Metodos static
    public static int calcularEdad(int anioActual, int mesActual, int diaActual, int anioNacimiento, int mesNacimiento, int diaNacimiento){
        //Este metodo calculará la edad del usuario en horas.
        int edad = anioActual - anioNacimiento;
        if ((mesActual < mesNacimiento) || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad = edad - 1;
        }
        return edad * 8760;
    }

    public static String identificarSignoZodiacal(int mesNacimiento, int diaNacimiento){
        //Este metodo identificará el signo zodiacal del usuario.
        String signoZodiacal = " ";
        if ((mesNacimiento == 12 && diaNacimiento >= 22) || (mesNacimiento == 1 && diaNacimiento <= 20)){
            signoZodiacal = "Capricornio";}
        if ((mesNacimiento == 1 && diaNacimiento >= 22) || (mesNacimiento == 2 && diaNacimiento <= 19)){
            signoZodiacal = "Acuario";}
        if ((mesNacimiento == 2 && diaNacimiento >= 20) || (mesNacimiento == 3 && diaNacimiento <= 20)){
            signoZodiacal = "Piscis";}
        if ((mesNacimiento == 3 && diaNacimiento >= 21) || (mesNacimiento == 4 && diaNacimiento <= 20)){
            signoZodiacal = "Aries";}
        if ((mesNacimiento == 4 && diaNacimiento >= 21) || (mesNacimiento == 5 && diaNacimiento <= 20)){
            signoZodiacal = "Tauro";}
        if ((mesNacimiento == 5 && diaNacimiento >= 21) || (mesNacimiento == 6 && diaNacimiento <= 21)){
            signoZodiacal = "Géminis";}
        if ((mesNacimiento == 6 && diaNacimiento >= 22) || (mesNacimiento == 7 && diaNacimiento <= 22)){
            signoZodiacal = "Cáncer";}
        if ((mesNacimiento == 7 && diaNacimiento >= 23) || (mesNacimiento == 8 && diaNacimiento <= 23)){
            signoZodiacal = "Leo";}
        if ((mesNacimiento == 8 && diaNacimiento >= 24) || (mesNacimiento == 9 && diaNacimiento <= 22)){
            signoZodiacal = "Virgo";}
        if ((mesNacimiento == 9 && diaNacimiento >= 23) || (mesNacimiento == 10 && diaNacimiento <= 22)){
            signoZodiacal = "Libra";}
        if ((mesNacimiento == 10 && diaNacimiento >= 23) || (mesNacimiento == 11 && diaNacimiento <= 22)){
            signoZodiacal = "Escorpio";}
        if ((mesNacimiento == 11 && diaNacimiento >= 23) || (mesNacimiento == 12 && diaNacimiento <= 21)){
            signoZodiacal = "Sagitario";}

        return signoZodiacal;
    }

    public static int calcularNumeroSuerte (int anioNacimiento){
        //Este metodo calculará el numero de la suerte del usuario.
        int numeroSuerte = 0;
        while (anioNacimiento > 0){
            numeroSuerte = numeroSuerte + anioNacimiento % 10;
            anioNacimiento = anioNacimiento / 10;}

        while (numeroSuerte > 9){
            numeroSuerte = numeroSuerte - 9;}

        return numeroSuerte;
    }
}