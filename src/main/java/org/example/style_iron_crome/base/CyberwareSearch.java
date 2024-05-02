package org.example.style_iron_crome.base;

import java.util.Map;
import java.util.Scanner;

public class CyberwareSearch {

    public static void SearchCyberarm (){
        Map<String, Cyberware> cyberarmMap = CyberwareSearchMap.createCyberarmMap();

        String consultCyberware;
        System.out.print("Digite o nome do Cyberarm (parcial ou completo): ");
        Scanner scanner = new Scanner(System.in);
        consultCyberware = scanner.nextLine();
        scanner.close();


        boolean found = false;
        for (Map.Entry<String, Cyberware> entry : cyberarmMap.entrySet()) {
            if (entry.getKey().toLowerCase().contains(consultCyberware)) {
                Cyberware cyberarmSelected = entry.getValue();
                showCyberwareInfo(cyberarmSelected);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cyberarm não encontrado.");
        }

    }
    public static void showCyberwareInfo(Cyberware cyberware){
        System.out.println("\n");
        System.out.println("[NAME]: " + cyberware.getCyberwareName());
        System.out.println("[INSTALL]: " + cyberware.getCyberwareInstall());
        System.out.println("[FUNDATIONAL?]: " + cyberware.getIsFundational());
        System.out.println("[SLOTS NUMBER]: " + cyberware.getCyberwareOptionSlots());
        System.out.println("[DESCRIPTION]: " + cyberware.getCyberwareDescription());
        System.out.println("[PRICE]: " + cyberware.getCyberwarePrice());
        System.out.println("[HUMANITY LOST]: " + cyberware.getCyberwareHumanityLost());
    }

}
