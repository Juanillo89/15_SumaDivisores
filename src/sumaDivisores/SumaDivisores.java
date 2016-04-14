package sumaDivisores;

import java.util.Scanner;

public class SumaDivisores 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		sc.close();
		int div = 1;
		int suma = 0;
		while(div <= numero / 2)
		{
			if(numero % div == 0)
			{
				suma = suma + div;
			}
			div++;
		}
		System.out.println("La suma de todos los divisores de " + numero +
		", sin incluir el " + numero + ", es " + suma + "." );
	}
}

