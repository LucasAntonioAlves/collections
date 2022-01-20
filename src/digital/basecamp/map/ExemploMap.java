package digital.basecamp.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
    /*
     Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
     modelo = gol - consumo = 14,4km/l
     modelo = uno - consumo = 15,6 km/l
     modelo = mobi - consumo = 16,1 km/l
     modelo = hb20 - consumo = 14,5 km/l
     modelo = kwid - consumo = 15,6 km/l
     */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println(" ===== Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){ // cria uma lista e organiza de forma aleatoria
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());

        System.out.println("\n ===== Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\n ===== Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\n ===== Exiba o consumo do uno: " + carrosPopulares.get("uno")); // get() para pegar o objeto e passar a chave

//        System.out.println("Exiba o terceiro modelo adicionado: "); // não tem metodos que mostra

        System.out.println("\n ===== Exiba os modelos: "); // keyset() retorna um set
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\n ===== Exiba os consumos dos carros: "); // values() retorna collection do tipo double
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\n ===== Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // entryset() retorna cada elemento do tipo set
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("\n ===== Exiba o modelo menos econômico e seu consumo: " ); //entreySet() pode manipular chave de valores separadamente
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator(); // interator() para somar com o proximo
        Double soma = 0d;
        while(iterator.hasNext()){ // interator() para somar com o proximo
            soma += iterator.next();
        }
        System.out.println("\n ===== Exiba a soma dos consumos: " + soma);

        System.out.println("\n ===== Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("\n ===== Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\n ===== Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString()); // linkedHashMap() para inserir na ordem desejada

        System.out.println("\n ===== Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString()); // TreeMap() ordena as chaves

        System.out.println("\n ===== Apague o dicionario de carros: ");
        carrosPopulares.clear(); // clear() para apagar o dicionario de carros

        System.out.println("\n ===== Confira se o dicionário está vazio: " + carrosPopulares.isEmpty()); // isEmpty() verifica se esta vazio
    }
}
