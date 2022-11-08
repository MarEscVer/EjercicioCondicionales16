package unico;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/* Realiza un programa que, dado un día de la semana (de lunes a viernes)
 * y una hora (horas y minutos), calcule cuántos minutos faltan para el
 * fin de semana. Se considerará que el fin de semana comienza el viernes
 * a las 15:00h. Se da por hecho que el usuario introducirá un día y hora
 * correctos, anterior al viernes a las 15:00h
 */
		
		String dia;
		int diaNumerico = 0;
		int horas;
		int minutos;
		int minutosTotales;
		int minutosActuales;		
		
		System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
	    dia = teclado.nextLine();

	    switch(dia) {
	      case "lunes":
	        diaNumerico = 0;
	        break;
	      case "martes":
	        diaNumerico = 1;
	        break;
	      case "miércoles":
	      case "miercoles":
	        diaNumerico = 2;
	        break;
	      case "jueves":
	        diaNumerico = 3;
	        break;
	      case "viernes":
	        diaNumerico = 4;
	        break;
	      default:
	        System.out.println("El día introducido no es correcto.");
	    }
	    
	    System.out.println("A continuación introduzca la hora (hora y minutos): ");
	    
	    System.out.print("Hora (tipo 24 horas): ");
	    horas = Integer.parseInt(teclado.nextLine());
	    
	    System.out.print("Minutos: ");
	    minutos = Integer.parseInt(teclado.nextLine());
	    
	    minutosTotales = (4 * 24 * 60) + (15 * 60);
	    minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
	    
	    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
	  }
	}