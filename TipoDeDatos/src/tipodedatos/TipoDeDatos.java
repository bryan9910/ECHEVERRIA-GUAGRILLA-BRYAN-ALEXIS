/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

/**
 *
 * @author Usuario
 */
public class TipoDeDatos {

    /**
     * @param args the command line arguments
     */
    //comentario de lines.
/*y las sonrisas son agradables
como el azul del cielo.
*/
//enteros -32768 a 32767
int numeroEntero = 5;
double numeroDouble=3.14;
char letra ='A';
String cadena= "hola como estas ?"; //declarar variables
boolean valorBool =false ;
valorBool =true ;
boolean valorBool1=false;

    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNombre();
        sumar2Numeros(1,2);
        System.out
        .println (sumar2Numeros(1,2));
    }
  public static  void imprimirNombre() {
    System.out.println("Bryan Alexis  \n Echeverria Guagrilla");
    System.out.println("\b borrar iz BRyan \t tabular \f comienzopa");
    String nombre ="Bryan  Echeverria";       //
    System.out.println(nombre.length());       //El numero de letras
    System.out.println(nombre.trim());        //Elimina espacios en blanco de los extremos de la cadena de caracteres
    System.out.println(nombre.toUpperCase());  //Cadena Mayusculas
    System.out.println(nombre.toLowerCase());   //Cadena minisculas
    System.out.println(nombre.replace(nombre,"Mauricio"));  //valor a remmplazar 
    System.out.println(nombre);    //valor original
    System.out.println(nombre.split(" "));  //El valor con el que se divide la palabra
            }         
  public static int sumar2Numeros(int num1, int num2){
  int suma =num1 + num2;
return suma;   
}
  
  
  }


