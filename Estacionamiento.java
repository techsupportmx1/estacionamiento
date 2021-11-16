//Escribir programa en java que calcule el precio a pagar en un estacionamiento. 
//El usuario debera elegir entre pago en hora o por dia.
//El pago por dia es de $45 y el pago por hora es de $5 pesos la hora completa.
//Los minutos seran redondeados para formar otra hora siempre y cuando excedan a 31 minutos, es decir, si estuvo 3,23 el usuario
//Debera pagar 3 horas. El programa de debera evaluar que la informacion ingresada sea correcta, es decir, que las horas deberan ser
//de 0 a 15 horas y los minutos de 0 a 59.
//Nota la hora de entrada debera ser recibida en un campo de tipo float, y dicha hora y minutos debera ser recibida en una sola variable.


import java.lang.*;
import java.util.*;

public class Estacionamiento{

	


	public static void main(String[]args){

	int id_usuario=1;
	String opcionP="";

	//Creacion de un objeto Scanner de java.util.Scanner
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Escribe su numero de placa | Tipo coche:");
	
	//Recibe la entrada de datos y la guarda en la variable 'placaTC'
	String placaTC = entrada.nextLine();
	
	System.out.println("Tu nombre de usuario es :" + placaTC);
	
	System.out.println("El id de usuario es: "+id_usuario);

		//Pregunta por el tipo de pago
		System.out.println(" Por dia es = 1, por hora = 2");
		
		//Guardamos en la variable opcionP el tipo de pago
		opcionP = entrada.nextLine();
		
		//Realiza la condicion con if
		if (opcionP=="dia")
		{
		System.out.println("Haz escogido pago por dia");
		System.out.println("Numeros de dias: ");
		int ndias=entrada.nextInt();
		int pagod=ndias*45;
		System.out.println("Su pago por dia es: "+pagod);
		}
		else
		{
		System.out.println("Haz escogido pago por hora");
		System.out.println(" Numeros horas: ");
		float nhoras=entrada.nextFloat();
		float pagoh=nhoras*5;
		System.out.println("Su pago por hora es: "+pagoh);
		}
	}
	//System.exit(0);
}
