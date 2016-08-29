package Ejercicio2;
import  java.util.Scanner;
/**
 * Created by GastónAlejandro on 29/08/2016.
 */
public class Ejercicio2 {

    public int DigitomasAlto(int pNumero)
    {
        int MasAlto=0;
        int Divisor=10;
        do {
           int Resto= pNumero % Divisor;
            if (Resto>MasAlto)
            {
                MasAlto=Resto;
            }
            pNumero=pNumero/Divisor;

        } while (pNumero!=0 );

        return MasAlto;
    }

             public void Main(String[] ar)
        {
            Scanner DatoIngresado =new Scanner(System.in);
            int ValorIngresado;
            System.out.print("Ingrese un entero: ");
            ValorIngresado=DatoIngresado.nextInt();
            System.out.print(DigitomasAlto(ValorIngresado));

        }

}
