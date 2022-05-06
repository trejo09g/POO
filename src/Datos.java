/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Adan Trejo
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informacion info = new Informacion("Adan Trejo","ING.Sistemas","Segundo Semestre");
        // encapsulamiento
        String NumCon = "\n" + info.getNombre()+ "\n" +info.getMateria()+ "\n" +info.getSemestre();
        System.out.println("\n Datos generales alumno(a):" + NumCon);
        System.out.println("Hola");
    }
    // se crean metodos
}
