package bean.estudante;

import lombok.Data;
import model.Estudante;
import model.enums.Turno;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;


@Named
@Data
// Escopo do Bean -
@RequestScoped
public class EstudanteRegistrarBean implements Serializable {
    //Injeção de dependencia ==  Class obj = new Class();
    @Inject
    private Estudante estudante;
    // Array de String//
    private String[] nomesArray = {"Dev Dojo ", "he", "Bom"};
    // Lista de String//
    //Necessário import import static java.util.Arrays.asList para usar asList;
    private List<String> nomeList = asList("Samuel ", "Naruto", "Scorpion");
    // Set
    private Set<String> nomeSet = new HashSet<String>(asList("Kong Lau ", "Sub Zero", "Scorpion"));
    //Map
    private Map<String, String> nomesMap = new HashMap<>();

    //    Bloco de inicialização
    {
        nomesMap.put("Scorpion", "O mais Rápido");
        nomesMap.put("Reman", "O mais Forte");
        nomesMap.put("Subzero", "O mais Frio");
    }

    @PostConstruct
    public void init() {
//        Imprimindo um SET
        System.out.println("For do SET");
        for (String valor : nomeSet) {

            System.out.println("Valor do Set: " + valor);
        }

        System.out.println("--------------------------------------------");

//        Imprimindo um MAP
        System.out.println("For do MAP");
        for (Map.Entry<String, String> entry : nomesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.getClass());
        }


    }
//    Aula 08

    public void executar() {
        System.out.println("Executou método aula 08 - Fazendo uma busca no database");
        System.out.println("Executou método aula 08 - Processando os dados");
        System.out.println("Executou método aula 08 - Exibindo os dados");
    }

    //    Passando paramentros da view para os métodos

    public void executar(String param) {
        System.out.println("Executou método aula 08 - Fazendo uma busca no database");
        System.out.println("Executou método aula 08 - Processando os dados");
        System.out.println("Executou método aula 08 - Exibindo os dados");
        System.out.println("Parametro  - Exibindo o Parametro:" + param);
    }

}
