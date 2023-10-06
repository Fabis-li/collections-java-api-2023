package list.OperacoesBasica.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ascendente = new ArrayList<>(this.numeros);
        if(!numeros.isEmpty()){
            Collections.sort(ascendente);
            return ascendente;
        } else {
            throw new RuntimeException("A lista eestá vazia!");
        }

    }

    public List<Integer> ordenarDescente(){
        List<Integer> ascendente = new ArrayList<>(this.numeros);
        if(!numeros.isEmpty()){
            ascendente.sort(Collections.reverseOrder());
            return ascendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //adicionar a lista
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println("Numeros adicionados");
        ordenacaoNumeros.exibirNumeros();

        //númmeros do menor para o maior
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        //números do maior para o menor
        System.out.println(ordenacaoNumeros.ordenarDescente());
    }

}
