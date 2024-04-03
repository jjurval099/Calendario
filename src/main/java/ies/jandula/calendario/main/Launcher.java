package ies.jandula.calendario.main;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Launcher 
{
	public static void main(String[] args) 
	{
		Array[][]diasMes = new Array [7][7];
		int dias;
		String mes = "";
		int aro = 0;
		char diasSemana = 0;
		boolean finish = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un mes");
		
		mes = scanner.nextLine();
		
		System.out.println("Introduce el año");
		aro = scanner.nextInt();
		
		while (finish)
		{
			switch (mes) 
			{
				case "enero":	
					
					dias = 31;
					
					if(diasSemana == 'l')
					{
						
					}
					else if(diasSemana == 'm')
					{
						
					}
					finish = false;
					
				case "febrero":	
					
					if(aro%4==0 && aro%100!=0)
					{
						dias = 29;
					}
					else if(aro%100==0 && aro%400==0)
					{
						dias = 29;
					}
					else
					{
						dias = 28;
					}
					finish = false;
					
				case "marzo":
					
					dias = 31;
					finish = false;
					
				case "abril":
					
					dias = 30;
					finish = false;
					
				case "mayo":
					
					dias = 31;
					finish = false;
					
				case "junio":
					
					dias = 30;
					finish = false;
					
				case "julio":	
					
					dias = 31;
					finish = false;
					
				case "agosto":
					
					dias = 31;
					finish = false;
					
				case "septiembre":
					
					dias = 30;
					finish = false;
					
				case "octubre":	
					
					dias = 31;
					finish = false;
					
				case "noviembre":	
					
					dias = 30;
					finish = false;
					
				case "diciembre":
					
					dias = 31;
					finish = false;
		
				default:
					System.out.println("Mes no introducido correctamente");
					break;
			}
		}
	}

}
