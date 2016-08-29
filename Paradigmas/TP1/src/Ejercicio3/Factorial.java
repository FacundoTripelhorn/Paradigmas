package Ejercicio3;

/**
 * Created by GastónAlejandro on 29/08/2016.
 */
public class Factorial {
    public int Factorializar(int pNumero)
    {
        int mFactorial=1;
        for (int i=2;i<=pNumero;i++)
        {
            mFactorial=mFactorial*i;
        }
        return mFactorial;
    }

}
