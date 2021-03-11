package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Desarrollado por EGR
		try (
		Scanner tecla = new Scanner(System.in)) {
			double a=0; 
			double b=0;
			double r=0;
			String sel=null;
			System.out.println("Seleccione su Operación");
			System.out.println("+: Suma");
			System.out.println("-: Resta");
			System.out.println("*: Multiplicación");
			System.out.println("/: División");
			System.out.println("s: Raíz Cuadrada");
			System.out.println("c: Raíz Cúbica");
			System.out.println("q: Salir");
			
			sel=tecla.next();
			switch(sel) {
			case "+":
				System.out.println("Seleccionó Sumar");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a+b;
				System.out.println(a+"+"+b+"="+r);
				break;
				
			case "-":
				System.out.println("Seleccionó Restar");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a-b;
				System.out.println(a+"-"+b+"="+r);
				break;
				
			case "*":
				System.out.println("Seleccionó Multiplicar");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a*b;
				System.out.println(a+"*"+b+"="+r);
				break;
				
			case "/":
				System.out.println("Seleccionó Dividir");
				System.out.println("Ingrese el primer valor");
				a=tecla.nextInt();
				System.out.println("Ingrese el segundo valor");
				b=tecla.nextInt();
				r=a/b;
				System.out.println(a+"/"+b+"="+r);
				break;
				
			case "s":
				System.out.println("Seleccionó Raíz Cuadrada");
				System.out.println("Ingrese el valor");
				a=tecla.nextInt();
				r=Math.sqrt(a);
				System.out.println("La Raíz de "+a+" es ="+r);
				break;	
				
			case "c":
				System.out.println("Seleccionó Raíz Cúbica");
				System.out.println("Ingrese el valor");
				a=tecla.nextInt();
				r=Math.cbrt(a);
				System.out.println("La Raíz de "+a+" es ="+r);
				break;	
				
			case "q":
				System.out.println("Seleccionó salir del sistema");
				System.out.println("Adiós");
				break;	
				
			default:
				System.out.println("Acción no soportada");
}
		}
		
	}

}
