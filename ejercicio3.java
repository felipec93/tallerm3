package tallerm3;

import java.util.Scanner;

public class ejercicio3 {
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
	
	String nom, producto;
	int  codigo;
    double sueldo, valorfact = 0, cantidad, iva, valor; 
    
    System.out.println(" digite el nombre del empleado");
	nom = leer.next();

	System.out.println(" digite codigo "+nom+": \n 1 ==> Producto a \n"
			+ " 2 ==> producto b \n 3==> producto c");
	codigo = leer.nextInt();
	
	System.out.println(" digite la cantidad  "+nom+":  ");
	cantidad = leer.nextInt();
	
	if ( cantidad < 501 && codigo == 1) {
		iva = 0.07;
		valor = (cantidad*500)*iva;
		valorfact = (cantidad*500)+valor;
		
		}
	if ( cantidad < 501 && codigo == 2) {
		iva = 0.08;
		valor = (cantidad*800)*iva;
		valorfact = (cantidad*800)+valor;
		
		}
	if ( cantidad < 501 && codigo == 3) {
		iva = 0.05;
		valor = (cantidad*1000)*iva;
		valorfact = (cantidad*1000)+valor;
		
		}
	if ( cantidad > 500 && codigo == 1) {
		iva = 0.09;
		valor = (cantidad*1000)*iva;
		valorfact = (cantidad*1000)+valor;
		
		}
	if ( cantidad > 500 && codigo == 2) {
		iva = 0.11;
		valor = (cantidad*1400)*iva;
		valorfact = (cantidad*1400)+valor;
		}
	if ( cantidad > 500 && codigo == 3) {
		iva = 0.10;
		valor = (cantidad*1600)*iva;
		valorfact = (cantidad*1600)+valor;
		
		}

	
	System.out.println(" valor factura: $ "+ valorfact + " señor " + nom);
	
	}
	
}
