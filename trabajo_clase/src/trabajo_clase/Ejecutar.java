/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_clase;

/**
 *
 * @author DELL
 */
public class Ejecutar {
    public static void main(String[] args) {
        Animal  objetoanimal=new Animal("perro" ,20,50,"blanco", 6 );
        Ave objeto2=new Ave(5, true, "Aguila",2.56,30,"rojo",5);
        Mamifero objeto3= new Mamifero("coki",10.5,30,"cafe",13);
        objetoanimal.alimentarse();
        objeto2.alimentarse();
        objeto3.alimentarse();
        objetoanimal.informacionAnimal();
    }
 
}
