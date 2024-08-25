package org.example.style_iron_crome.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CyberwareSearch {

    public static void SearchCyberarm (){
        Map<String, Cyberware> cyberarmMap = CyberwareSearchMap.createAllCyberwareMap();

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
        System.out.println("[CATEGORY]: " + cyberware.getCategory());
        System.out.println("[NAME]: " + cyberware.getCyberwareName());
        System.out.println("[INSTALL]: " + cyberware.getCyberwareInstall());
        System.out.println("[FUNDATIONAL?]: " + cyberware.isFundational());
        System.out.println("[SLOTS NUMBER]: " + cyberware.getCyberwareOptionSlots());
        System.out.println("[DESCRIPTION]: " + cyberware.getCyberwareDescription());
        System.out.println("[PRICE]: " + cyberware.getCyberwarePrice());
        System.out.println("[HUMANITY LOST]: " + cyberware.getCyberwareHumanityLost());
    }

    public static List<Cyberware> allCyberwareForApp(){
        Map<String, Cyberware> cyberarmMap = CyberwareSearchMap.createAllCyberwareMap();
        List<Cyberware> results = new ArrayList<>();

        for (Map.Entry<String, Cyberware> entry : cyberarmMap.entrySet()) {
            results.add(entry.getValue());
        }
            return results;
    }

    /***
     * Recupera resultado do mapa de todos os cyberwares que batem com o texto pesquisado no campo pesqusia
     * @param searchText o texto colocado na pesquisa
     * @return uma nova lista de cyberwares mas agora contendo somente os resultados que batem com a pesquisa
     */
    public static List<Cyberware> searchCyberwareForApp(String searchText) {
        Map<String, Cyberware> cyberarmMap = CyberwareSearchMap.createAllCyberwareMap();
        List<Cyberware> results = new ArrayList<>();

        for (Map.Entry<String, Cyberware> entry : cyberarmMap.entrySet()) {
            //IF que separa os resultados que batem com a pesquisa de texto
            if (entry.getKey().toLowerCase().contains(searchText.toLowerCase())) {
                results.add(entry.getValue());
            }
        }

        return results;
    }

}
