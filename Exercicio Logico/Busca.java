package contatoSeguro;

/**
 *
 * @author Andrei
 */
public class Busca {
    public int buscaBinaria(int valor, int[] vetor){
        int inicio, meio, fim, contador = 0;
        inicio = 0;
        fim = vetor.length - 1;

        while(inicio <= fim){
            contador++;

            meio = (inicio + fim) / 2;
            if(valor == vetor[meio]){
                return meio;
            }else{
                if(valor > vetor[meio]){
                    inicio = meio + 1;
                }else{
                    fim = meio - 1;
                }
            }
        }
        return -1;
    }

    public int buscaBinariaRecursiva(int[] vetor, int inicio, int fim, int valor) {
        int meio, contador = 0;
        meio = (inicio + fim) / 2;       
        contador++;
        
        if(inicio > fim){
            return -1;  
        } else if (valor == vetor[meio]) {
            return meio;
        } else if (valor < vetor[meio]) {
            return buscaBinariaRecursiva(vetor, inicio, meio - 1, valor);
        } else {
            return buscaBinariaRecursiva(vetor, meio + 1, fim, valor);
        }
    }
}
