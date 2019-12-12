
package boletin11;

public class Boletin11 {

   
    public static void main(String[] args) {
        Clase A =  new Clase ( );
        Clase B =  new Clase (20);
        Clase C =  new Clase ( 20 , 40 );
        System.out.println ( "El objeto _A: _ contiene:"  + A.getPrimari ( )  +  ","  + A.getSecundari ( ) ) ;
        System.out.println ( "El objeto _B: _ contiene:"  + B.getPrimari ( )  +  ","  + B.getSecundari ( ) ) ;
        System.out.println ( "El objeto _C: _ contiene:"  + C.getPrimari ( )  +  ","  + C.getSecundari ( ) ) ;
    }
}
