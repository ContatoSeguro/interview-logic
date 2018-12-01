package contatoSeguro;
/**
 *
 * @author Andrei
 */
public class Exercicios {
    public static void main(String[] args) {
        // exercicio 3
        Busca busca = new Busca();
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        System.out.println("Exercicio 3:"); 
        System.out.println("Posição: " + busca.buscaBinaria(20, vetor));
        System.out.println("Posição: " + busca.buscaBinariaRecursiva(vetor, 0, vetor.length - 1, 20) +  "\n");       
    }
}