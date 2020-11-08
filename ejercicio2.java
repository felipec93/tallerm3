package tallerm3;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |         FECHA: 08-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:  760728          | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");
		
		

		String nom;
		int costo= 0,  ubicacion, tamano;
		
		 System.out.println(" digite su nombre");
			nom = leer.next();
System.out.println(" digite su ubicación señor(a)  "+nom+": \n 1 ==> Norte \n"
		+ " 2 ==> Sur \n 3==> Orientegrande \n 4==> Occidente ");
			ubicacion = leer.nextInt();
			System.out.println(" digite el tamaño señor(a)  "+nom+": \n 1 ==> Pequeño \n"
					+ " 2 ==> Mediano \n 3==> Grande ");
						tamano = leer.nextInt();
					

			switch  (ubicacion) {
				case 1: 
					if ( tamano == 1) {
					costo = 500;
					}
					if ( tamano == 2) {
						costo = 250;
						}
					if ( tamano == 3) {
						costo = 100;
						}
										
					;				
				break;
				
				case 2: 
					if ( tamano == 1) {
					costo = 400;
					}
					if ( tamano == 2) {
						costo = 200;
						}
					if ( tamano == 3) {
						costo = 0;
						}
										
					;				
				break;
				
				case 3: 
					if ( tamano <= 1 && tamano >= 3) {
					costo = 100;
					}
					else
					{
						costo = 0;
					}

										
					;				
				break;
				
				case 4: 
					if ( tamano == 1) {
					costo = 300;
					}
					if ( tamano == 2) {
						costo = 0;
						}
					if ( tamano == 3) {
						costo = 200;
						}
										
					;				
				break;
				
							
				default:
					costo = 0;
					
					System.out.println("El tamaño no existe");
					
					break;
					
					
					
			}
						
			if ( costo == 0) {
				System.out.println(" solicitud mal hecha señor " + nom);
				
			} else
			{
			System.out.println(" costo: $ "+ costo+ " señor " + nom);
			}
		

	}
}
