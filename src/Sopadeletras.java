import java.util.Scanner;


public class Sopadeletras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================ ☼BIENBENIDOS☼ ================");
		System.out.println("============= A La Sopa de Letras =============");
	
		System.out.print("\n                         		     Puntos [0]♥");
		System.out.print("\n ");
		char sl[][]=new char[10][10];
		Scanner s=new Scanner(System.in);
	
		sl[0][0]='X';
		sl[1][0]='A';
		sl[2][0]='M';
		sl[3][0]='O';
		sl[4][0]='R';
		System.out.print("\n    ["+sl[0][0]+"]  ");
		System.out.print("    ["+sl[1][0]+"]  ");
		System.out.print("    ["+sl[2][0]+"]  ");
		System.out.print("    ["+sl[3][0]+"]  ");
		System.out.print("    ["+sl[4][0]+"]  ");
		sl[0][0]='Q';
		sl[1][1]='R';
		sl[2][2]='P';
		sl[3][3]='H';
		sl[4][4]='S';
		System.out.print("\n    ["+sl[0][0]+"]  ");
		System.out.print("    ["+sl[1][1]+"]  ");
		System.out.print("    ["+sl[2][2]+"]  ");
		System.out.print("    ["+sl[3][3]+"]  ");
		System.out.print("    ["+sl[4][4]+"]  ");
		sl[0][0]='S';
		sl[1][1]='F';
		sl[2][2]='P';
		sl[3][3]='F';
		sl[4][4]='O';
		System.out.print("\n    ["+sl[0][0]+"]  ");
		System.out.print("    ["+sl[1][1]+"]  ");
		System.out.print("    ["+sl[2][2]+"]  ");
		System.out.print("    ["+sl[3][3]+"]  ");
		System.out.print("    ["+sl[4][4]+"]  ");
		sl[0][0]='N';
		sl[1][1]='L';
		sl[2][2]='R';
		sl[3][3]='I';
		sl[4][4]='I';
		System.out.print("\n    ["+sl[0][0]+"]  ");
		System.out.print("    ["+sl[1][1]+"]  ");
		System.out.print("    ["+sl[2][2]+"]  ");
		System.out.print("    ["+sl[3][3]+"]  ");
		System.out.print("    ["+sl[4][4]+"]  ");
		sl[0][0]='J';
		sl[1][1]='O';
		sl[2][2]='Y';
		sl[3][3]='A';
		sl[4][4]='X';
		System.out.print("\n    ["+sl[0][0]+"]  ");
		System.out.print("    ["+sl[1][1]+"]  ");
		System.out.print("    ["+sl[2][2]+"]  ");
		System.out.print("    ["+sl[3][3]+"]  ");
		System.out.print("    ["+sl[4][4]+"]  "); 
		
		System.out.println("\n");
		System.out.println("\n Encuentra las palabras: ");
	
		
		//EN REALIDAD NO SE COMO ME SALIO JAJA AL FINAL PUDE APRENDER ALGO CON EL EQUAL DANDOLE VARIAS POSIVILIDADES A LA RESPUESTA 
		// NO AGREGUE EL FALLASTE 
		Scanner A=new Scanner(System.in);
		String palabra1=A.next();
			if (palabra1.equals("AMOR"))
			{
				Scanner B=new Scanner(System.in);
				String palabra2=A.next();
			if (palabra2.equals("JOYA"))
				{
						System.out.println("		CORRECTO!!");
						System.out.println("FELICIDADES!! Ganaste la primera ronda");
						
						System.out.println("\n!!GANAS 500 ♥ PUNTOS!!");		
				}
			}
			//SEGUNDO NIVEL YA CON 500 PUNTOS 
				System.out.println("=============== SEGUNDO NIVEL ===============");	
				System.out.print("\n                       		     Puntos [500]♥");
				System.out.print("\n ");
				char ls[][]=new char[10][10];
				Scanner a=new Scanner(System.in);
			
				ls[0][0]='X';
				ls[1][0]='A';
				ls[2][0]='M';
				ls[3][0]='O';
				ls[4][0]='R';
				System.out.print("\n    ["+ls[0][0]+"]  ");
				System.out.print("    ["+ls[1][0]+"]  ");
				System.out.print("    ["+ls[2][0]+"]  ");
				System.out.print("    ["+ls[3][0]+"]  ");
				System.out.print("    ["+ls[4][0]+"]  ");
				ls[0][0]='Q';
				ls[1][1]='R';
				ls[2][2]='P';
				ls[3][3]='H';
				ls[4][4]='S';
				System.out.print("\n    ["+sl[0][0]+"]  ");
				System.out.print("    ["+ls[1][1]+"]  ");
				System.out.print("    ["+ls[2][2]+"]  ");
				System.out.print("    ["+ls[3][3]+"]  ");
				System.out.print("    ["+ls[4][4]+"]  ");
				sl[0][0]='R';
				sl[1][1]='F';
				sl[2][2]='P';
				sl[3][3]='F';
				sl[4][4]='O';
				System.out.print("\n    ["+ls[0][0]+"]  ");
				System.out.print("    ["+ls[1][1]+"]  ");
				System.out.print("    ["+ls[2][2]+"]  ");
				System.out.print("    ["+ls[3][3]+"]  ");
				System.out.print("    ["+ls[4][4]+"]  ");
				ls[0][0]='R';
				ls[1][1]='A';
				ls[2][2]='M';
				ls[3][3]='O';
				ls[4][4]='I';
				System.out.print("\n    ["+sl[0][0]+"]  ");
				System.out.print("    ["+ls[1][1]+"]  ");
				System.out.print("    ["+ls[2][2]+"]  ");
				System.out.print("    ["+ls[3][3]+"]  ");
				System.out.print("    ["+ls[4][4]+"]  ");
				ls[0][0]='J';
				ls[1][1]='O';
				ls[2][2]='Y';
				ls[3][3]='A';
				ls[4][4]='X';
				System.out.print("\n    ["+ls[0][0]+"]  ");
				System.out.print("    ["+ls[1][1]+"]  ");
				System.out.print("    ["+ls[2][2]+"]  ");
				System.out.print("    ["+ls[3][3]+"]  ");
				System.out.print("    ["+ls[4][4]+"]  "); 
				
				System.out.println("\n");
				System.out.println("\n Encuentra las palabras: ");
				
				Scanner C=new Scanner(System.in);
				String palabra3=C.next();
					if (palabra3.equals("AMOR"))
					{
						Scanner D=new Scanner(System.in);
						String palabra4=D.next();
					if (palabra4.equals("JOYA"))
						{
						Scanner E=new Scanner(System.in);
						String palabra5=E.next();
							if (palabra5.equals("RAMO"))
							
								{
								System.out.println("		CORRECTO!!");
								System.out.println("FELICIDADES!! Ganaste la segunda ronda");
								
								System.out.println("\n!!GANAS 500 ♥ PUNTOS MAS!!");	
								System.out.println("\n Nuevo Record 1000 ♥ Puntos ");	
								System.out.println("AS GANADO EL JUEGO");
								}
			}
					//Y YA GANAS EL JUEGO CON 1000 PUNTOS
	}
	}
}
