package tallerm3;

import java.util.Scanner;

public class ejercicio1 {
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
		int carrera, plan = 0, semestre;
		int numero1,comunicacion,administracion;
		
		 System.out.println(" digite el nombre del estudiante");
			nom = leer.next();
System.out.println(" digite la carrera de "+nom+": \n 1 ==> econonia \n"
		+ " 2 ==> administracion \n 3==> ciencias");
			carrera = leer.nextInt();
			System.out.println(" digite semestre cursado");
			semestre = leer.nextInt();
					

			switch  (carrera) {
				case 1: 
					if ( semestre <= 3) {
					plan = 1500;
					}
					if ( semestre >=3 && semestre <= 7) {
						plan = 2220;
						}
					if ( semestre >=8 && semestre <= 10) {
						plan = 2220;
						}					
					;				
				break;
				
				case 2: 
					if ( semestre <= 3) {
					plan = 2000;
					}
					if ( semestre >=3 && semestre <= 7) {
						plan = 4000;
						}
					if ( semestre >=8 && semestre <= 10) {
						plan = 6000;
						}					
					;				
				break;
				
				case 3: 
					if ( semestre <= 3) {
					plan = 1800;
					}
					if ( semestre >=3 && semestre <= 7) {
						plan = 5000;
						}
					if ( semestre >=8 && semestre <= 10) {
						plan = 7000;
						}					
					;				
				break;
				
				
				default:
					plan = 0;
					
					System.out.println("Este plan dde estudio no existe");
					
					break;
					
					
					
			}
						
			
			System.out.println("el valor del plan de "+ nom+ " es de $ "+plan);
			
			
	}
}
