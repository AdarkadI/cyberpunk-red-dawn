package org.example;
import org.example.style_iron_crome.base.Cyberware;
import org.example.style_iron_crome.base.CyberwareSearch;
import org.example.style_iron_crome.base.CyberwareSearchMap;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        int whatToDo;
        System.out.print("O que você deseja fazer?");
        System.out.print("[1] - Ver Cyberwares");
        System.out.print("[2] - Ver Veículos]");

        Scanner scanner = new Scanner(System.in);
        whatToDo = scanner.nextInt();


        switch (whatToDo){
            case 1:
                CyberwareSearch.SearchCyberarm();
                break;
            case 2:
        }

        scanner.close();
    }

}