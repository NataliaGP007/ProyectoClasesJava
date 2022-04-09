package Proyecto;

/*
Desarrollar un algoritmo que pida el nombre del usuario, el día, mes y año actual y el día, mes y año de nacimiento
del usuario. En base a esos datos el algoritmo indica el signo zodiacal, la edad en horas y el número de la suerte
del usuario.

Autor: Natalia Gutiérrez Pineda.
 */

//Clase publica
public class Numerologia {
    //Esta clase indica  la edad en horas, el signo sodiacal y numero de la suerte del usuario.

    //Atributos de clase
    private int anioNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;
    private int edad;
    private String signoZodiacal;       //Para el tipo de datos string se pone -String-
    private int numeroSuerte;

    //Metodos de instancia
    public int calcularEdad(int anioActual, int mesActual, int diaActual, int anioNacimiento, int mesNacimiento, int diaNacimiento) {
        //Este metodo calculará la edad del usuario.
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.edad = anioActual - this.anioNacimiento;
        if ((mesActual < this.mesNacimiento) || (mesActual == this.mesNacimiento && diaActual < diaNacimiento)) {
            this.edad = this.edad - 1;
        }
        return edad;
    }

    public int convertirEdadEnHoras() {
        //Este metodo convertirá la edad en años del usuario a horas a partir de la equivalencia de años a horas.
        return this.edad * 8760;
    }

    public String identificarSignoZodiacal() {
        //Este metodo identificará el signo zodiacal del usuario.
        if ((this.mesNacimiento == 12 && this.diaNacimiento >= 22) || (this.mesNacimiento == 1 && this.diaNacimiento <= 20)) {
            this.signoZodiacal = "Capricornio";
        }
        if ((this.mesNacimiento == 1 && this.diaNacimiento >= 22) || (this.mesNacimiento == 2 && this.diaNacimiento <= 19)) {
            this.signoZodiacal = "Acuario";
        }
        if ((this.mesNacimiento == 2 && this.diaNacimiento >= 20) || (this.mesNacimiento == 3 && this.diaNacimiento <= 20)) {
            this.signoZodiacal = "Piscis";
        }
        if ((this.mesNacimiento == 3 && this.diaNacimiento >= 21) || (this.mesNacimiento == 4 && this.diaNacimiento <= 20)) {
            this.signoZodiacal = "Aries";
        }
        if ((this.mesNacimiento == 4 && this.diaNacimiento >= 21) || (this.mesNacimiento == 5 && this.diaNacimiento <= 20)) {
            this.signoZodiacal = "Tauro";
        }
        if ((this.mesNacimiento == 5 && this.diaNacimiento >= 21) || (this.mesNacimiento == 6 && this.diaNacimiento <= 21)) {
            this.signoZodiacal = "Géminis";
        }
        if ((this.mesNacimiento == 6 && this.diaNacimiento >= 22) || (this.mesNacimiento == 7 && this.diaNacimiento <= 22)) {
            this.signoZodiacal = "Cáncer";
        }
        if ((this.mesNacimiento == 7 && this.diaNacimiento >= 23) || (this.mesNacimiento == 8 && this.diaNacimiento <= 23)) {
            this.signoZodiacal = "Leo";
        }
        if ((this.mesNacimiento == 8 && this.diaNacimiento >= 24) || (this.mesNacimiento == 9 && this.diaNacimiento <= 22)) {
            this.signoZodiacal = "Virgo";
        }
        if ((this.mesNacimiento == 9 && this.diaNacimiento >= 23) || (this.mesNacimiento == 10 && this.diaNacimiento <= 22)) {
            this.signoZodiacal = "Libra";
        }
        if ((this.mesNacimiento == 10 && this.diaNacimiento >= 23) || (this.mesNacimiento == 11 && this.diaNacimiento <= 22)) {
            this.signoZodiacal = "Escorpio";
        }
        if ((this.mesNacimiento == 11 && this.diaNacimiento >= 23) || (this.mesNacimiento == 12 && this.diaNacimiento <= 21)) {
            this.signoZodiacal = "Sagitario";
        }

        return signoZodiacal;
    }

    public int calcularNumeroSuerte() {
        //Este metodo calculará el numero de la suerte del usuario.
        while (this.anioNacimiento > 0) {
            this.numeroSuerte = this.numeroSuerte + this.anioNacimiento % 10;
            this.anioNacimiento = this.anioNacimiento / 10;
        }

        while (this.numeroSuerte > 9) {
            this.numeroSuerte = this.numeroSuerte - 9;
        }

        return numeroSuerte;
    }

}
