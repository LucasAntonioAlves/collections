package digital.basecamp.list;

    import java.util.*;

    class ExemploList {
        public static void main(String[] args) {
//      Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

            System.out.println("Crie uma lista e adicione as sete notas: ");

            List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
            notas.add(7.0);
            notas.add(8.5);
            notas.add(9.3);
            notas.add(5.0);
            notas.add(7.0);
            notas.add(0.0);
            notas.add(3.6);
            System.out.println(notas.toString()); // toString()

            System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // indexOf()

            System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // add()
            notas.add(4, 8d);
            System.out.println(notas);

            System.out.println("Substitua a nota 5.0 pela nota 6.0: "); // set(), para setar a nota e substituir por outra
            notas.set(notas.indexOf(5d), 6.0);
            System.out.println(notas);

            System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // contains(), saber se tem elemento na lista

            System.out.println("Exiba todas as notas na ordem em que foram informados: ");
            for (Double nota : notas) System.out.println(nota); // o for imprime uma nota embaixo da outra

            System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // get(), passa a posicao e recebe o elemento
            System.out.println(notas.toString());

            System.out.println("Exiba a menor nota: " + Collections.min(notas)); // collections(), min para exibir a menor nota

            System.out.println("Exiba a maior nota: " + Collections.max(notas)); // collections(), max para exibir a maior nota

            Iterator<Double> iterator = notas.iterator(); //
            Double soma = 0d;
            while(iterator.hasNext()){
                Double next = iterator.next();
                soma += next;
            }
            System.out.println("Exiba a soma dos valores: " + soma); // interator(), vai interando com a proximo item caso aja

            System.out.println("Exiba a média das notas: " + (soma/notas.size())); // size() para mostrar o tamanho

            System.out.println("Remova a nota 0: "); // remove(), remove na posição ou na nota desejada
            notas.remove(0d);
            System.out.println(notas);

            System.out.println("Remova a nota da posição 0");// remove(), remove na posição ou na nota desejada
            notas.remove(0);
            System.out.println(notas);

            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
                                // interator() e remove(), verifica se tem proximo e caso aja,as notas menores que 7
            Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()) {
                Double next = iterator1.next();
                if(next < 7) iterator1.remove();
            }
            System.out.println(notas);

            System.out.println("Apague toda a lista"); // clear(), apaga tudo da lista
            notas.clear();
            System.out.println(notas);

            System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
                                // isEmpty(), para verificar se esta vazia, retornando true ou false

        /*
        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        */

        }
    }

