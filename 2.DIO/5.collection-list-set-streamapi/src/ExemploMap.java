import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione modelos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.4);
            put("mobi", 1.4);
            put("hb20", 10.4);
            put("kwid", 13.4);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substituir o consul de gol por 15,2 km ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";
        for ( Map.Entry<String, Double> entry : entries ) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("O modelo mais eficiente: " + modeloMaisEficiente + " E o seu consumo é: " + consumoMaisEficiente);
            }
        }
        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry :carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("O modelo menos eficiente: " + modeloMenosEficiente + " E o seu consumo é: " + consumoMenosEficiente);
            }
        }
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator1.hasNext()) {
            soma += iterator1.next();
        }
        System.out.println("Exiba a soma do consumo: " + soma);
        System.out.println("Exiba a a media do consumo: " + (soma/carrosPopulares.size()));

        // Remover o consumo 15.4
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(15.4)) iterator2.remove();
        }
        System.out.println(carrosPopulares);

        // Ordem que foi informado
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.4);
            put("mobi", 1.4);
            put("hb20", 10.4);
            put("kwid", 13.4);
        }};
        System.out.println(carrosPopulares2);
        // Ordem natural
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        //
        carrosPopulares3.clear();
        System.out.println("Há algo: " + carrosPopulares3.isEmpty());
    }
}
