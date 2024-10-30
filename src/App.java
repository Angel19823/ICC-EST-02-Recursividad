public class App {
    public static void main(String[] args) throws Exception {
        // Recursividad recur = new Recursividad();

        // int resultado =  recur.factorial(5);
        // System.out.println(resultado);

        // System.out.println(recur.sumaConsecutivos(15));


        // int resultadosuma = recur.sumaDigitos(456);
        // System.out.println(resultadosuma);


        //Directorios
        RenombrarDirectorios renom = new RenombrarDirectorios();
        renom.renombrarDirectorios("src/directorios");
    }
}
