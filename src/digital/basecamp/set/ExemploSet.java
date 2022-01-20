package digital.basecamp.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString()); // toString()

//        System.out.println("Exiba a posição da nota 5.0: "); // nao tem metodo get no set

//        System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // nao tem como add() no set

//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d)); // contains(), verifica se tem a nota 5 no array

//        System.out.println("Exiba a terceira nota adicionada: "); // nao tem indice para passar a nota no set

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // min(), recebe uma collection

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // max(), recebe uma collection

        Iterator<Double> iterator = notas.iterator(); // iterator(), nao recebe numero repetido mas soma normalmente
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size())); // size(), fazer a quantidade e a média

        System.out.println("Remova a nota 0: "); // remove(), remove a nota indicada
        notas.remove(0d);
        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0"); // nao trabalha com indice

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);// iterator().remove(), usa while para verificar os menores elementos que 7 para remover

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2); // new LinkedHashMap()

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3); // TreeSet(), usa a ordem natural dos elementos (menor para o maior)

        System.out.println("Apague todo o conjunto");
        notas.clear(); // clear()

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty()); // isEmpty() verifica se o conjunto esta vazio
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}