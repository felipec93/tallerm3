package tallerm3;

import java.text.BreakIterator;
import java.util.Scanner;

public class ejemplo {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

        System.out.println(" 88888888888888888888888888888888888888888 ");
System.out.println(" -  ___________________________________  +" );
System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -" );
System.out.println(" - |         FECHA: 08-noviembre-2020    | +" );
System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -" );
System.out.println(" - |              ID:  760728          | +" );
System.out.println(" + |___________________________________| -" );
System.out.println(" 88888888888888888888888888888888888888888" );

        String nom;
        int cate;
        double sueldo; 
        
        System.out.println(" digite el nombre del empleado");
		nom = leer.next();
		System.out.println(" digite la categoria de "+nom+":  ");
		cate = leer.nextInt();
		System.out.println(" digite sueldo ");
		sueldo = leer.nextDouble();
		
		
		switch  (cate ) {
			case 1: 
			     sueldo = (sueldo*2.1 ) ;
			
			break;
			
			case 2: 
			     sueldo = (sueldo*10.2 ); 
			
			break;
			
			case 3:
					sueldo = (sueldo*20.2);
			break;
			
			case 4: 
				sueldo = (sueldo*50.2);
			break;
			
			default:
				sueldo = 0;
				
				System.out.println("la categoria no existe");
				
				break;
				
				
				
		}
		
		System.out.println("valor de sueldo"+sueldo);
		
	}		
}			
		
	


