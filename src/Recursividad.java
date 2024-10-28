public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculado el factorial de: "+n);
        // Caso base: n sea 0! y 1! son iguales a 1
        if (n==0 || n==1) {
            System.out.println("Caso base alcanzado, el factorial de "+n+" es 1");
            return 1;
        }

        int resultado = n * factorial(n-1);
        System.out.println("Resultadp parcial para "+n+" * factorial("+(n-1)+") = "+resultado);
        return resultado;
        //return n * factorial(n-1);
    }

    //Calcular la suma de los numeros consecutivos
    //n = 5 resultado = 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n){
        if (n==1) {
            return 1;
        }
        return n + sumaConsecutivos(n-1);
    }

    //Calcula la potencia de numero 

    public int potencia(int base, int exponente){
        if (exponente==0) {
            return 1;
        }
        return base * potencia(base, exponente-1);
    } 

    // Crear un metodo que sume los digitos de un numero
    // Si mando 456 = 15
    // 4+5+6 = 15
    // Pista, se una %MOD

    public int sumaDigitos(int numero){
        if (numero<10) {
            return numero;
        }
        int num = numero%10 + sumaDigitos(numero/10);
        return num;  
    }
}
