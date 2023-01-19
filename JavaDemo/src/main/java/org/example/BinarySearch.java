package org.example;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(final String[] args) {

        // 2 6 9 45 74 86 97 110
        List<Integer> places = Arrays.asList(2,6,9,45,74,86,97,110, 245);

        System.out.println(findValue(places,110));

    }

    public static Integer findValue(final List<Integer> lista, final Integer valor){

        Integer meio;
        Integer inicio = 0;
        Integer fim = lista.size()-1;

        while(true){

            meio = (fim + inicio) / 2;

            if(lista.get(meio) == valor){
                //index
                return meio;
            }

            if(lista.get(meio)> valor){
                fim = meio-1;
            }
            else{
                inicio = meio + 1;
            }
        }
    }
}
