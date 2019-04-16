package br.com.digitalhouse;

import java.util.*;

public class Aula9_Exercicios2 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(8);
        numeros.add(8);

       /* for (Integer num : numeros) {
            System.out.println(num);
        }*/

        Set<Integer> numeroSet = new HashSet<>();
        numeroSet.add(1);
        numeroSet.add(5);
        numeroSet.add(5);
        numeroSet.add(6);
        numeroSet.add(7);
        numeroSet.add(8);
        numeroSet.add(8);
        numeroSet.add(8);

       /*for (Integer num : numeroSet) {
            System.out.println("Numeros: " + num);
        }*/


        Map<Integer, Integer> numerosMap = new HashMap<>();
        numerosMap.put(0,1);
        numerosMap.put(1,2);
        numerosMap.put(2,3);
        numerosMap.put(3,4);
        numerosMap.put(4,4);

        for (Integer chave : numerosMap.keySet()){
            System.out.println("O valor de numeros é igual:" + numerosMap.get(chave));
        }



    }
}

/*for (Pessoa pessoa : pessoas) {
            System.out.println("As pessoas da minha lista são: \n Nome: " + pessoa.getNome() + "\n Sobrenome: " + pessoa.getSobrenome()+"\n");
        }*/