
public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println("**********************************************************************");
		System.out.printf("Vamos a sumar a = %d y b = %d\n", a, b);
		System.out.println("El resultado es " + Main.sumaRec(a, b));
		System.out.println("\n\n\n **********************************************************************");
		int aBis = 5;
		int bBis = 2;
		System.out.printf("Vamos a sacar el resto de  a = %d y b = %d\n", aBis, bBis);
		System.out.println("El resultado es " + Main.diviRec(aBis, bBis));
		System.out.println("********************************************************************** \n\n\n ");

		int[] v = { 2, 5, 6, 7 };
		int tVect = v.length - 1;
		System.out.printf("Vamos a sumar el vector v = %s de ultima posicion %d\n",
				"leer arriba que no quiero currarme la impresion", tVect);

		System.out.println("La suma del vector devuelve " + Main.sumaVector(v, tVect));
		System.out.println("**********************************************************************");
		System.out.println("********************************************************************** \n\n\n ");
		System.out.println("Resultado de los No debuggeados suma " + sumaRecNP(80, 7));
		System.out.println("Resultado de los No debuggeados division " + diviRecNP(800, 7));
		int[] v2 = {1,1,1,1,1,1,1,1};
		System.out.println("Resultado de los No debuggeados vector " + sumaVectorNP(v2, 7));



	}

	public static int sumaRec(int a, int b) {

		if (a == 0) {
			System.out.printf("En esta iteraccion estamos con a = %d y b = %d\n", a, b);
			System.out.println("a es 0, entonces a la superior devolvemos " + b);
			return b;
		}
		System.out.printf("Entramos en recursiva donde a valdra %d\n", a - 1);
		int result = sumaRec(a - 1, b);
		System.out.printf("En esta iteraccion estamos con a = %d y b = %d\n", a, b);
		System.out.println("Aqui hacemos " + result + " + 1");
		return result + 1;
	}

	public static int diviRec(int a, int b) {

		if (a - b < 0) {
			System.out.printf("En esta iteraccion estamos con a = %d y b = %d\n", a, b);
			System.out.println("a - b < 0, entonces a la superior devolvemos a = " + a);
			return a;
		}
		System.out.printf("Entramos en recursiva donde a valdra %d\n", a - b);
		int result = diviRec(a - b, b);
		System.out.printf("En esta iteraccion estamos con a = %d y b = %d\n", a, b);
		System.out.println("Aqui devolvemos la llamada recursiva anterior =  " + result +
				" (estamos en a = "+a + " y b= "+b + ")");
		return result;
	}

	public static int sumaVector(int[] vector, int tVector) {
		System.out.printf("En esta iteraccion estamos con un tamaño de vector %d\n", tVector);

		if (tVector == 0) {
			System.out.println("Estamos en la primera posicion y devolvemos " + vector[0]);
			return vector[0];
		}
		System.out.println("Entramos recursivo");
		int r = sumaVector(vector, tVector - 1);
		int v = vector[tVector];
		System.out.println("Sumamos el vector[" + tVector + "] = " + v + " + la llamada recursiva = " + r);

		return r + v;
	}

//Aqui los metodos sin los print que se leen mas claros

	public static int sumaRecNP(int a, int b) {

		if (a == 0) {
			return b;
		}
		return sumaRecNP(a - 1, b) + 1;
	}

	public static int diviRecNP(int a, int b) {

		if (a - b < 0) {
			return a;
		}
		return diviRecNP(a - b, b);
	}

	
	public static int sumaVectorNP(int[] vector, int tVector) {
		if (tVector == 0) {
			return vector[0];
		}
		
		return sumaVectorNP(vector, tVector - 1) + vector[tVector];
	}
}
