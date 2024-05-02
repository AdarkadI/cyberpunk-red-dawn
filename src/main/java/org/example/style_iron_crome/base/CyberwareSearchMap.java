package org.example.style_iron_crome.base;

import org.example.style_iron_crome.cyberwares.Cyberarm;
import org.example.style_iron_crome.cyberwares.Cyberleg;

import java.util.HashMap;
import java.util.Map;

public class CyberwareSearchMap {
    public static Map<String, Cyberware> createCyberarmMap(){
        Map<String,Cyberware> cyberarmMap = new HashMap<>();
        //CYBERARMS
        cyberarmMap.put("Cyberarm Dynalar Technologies", Cyberarm.CyberarmDynalarTechnologies());
        cyberarmMap.put("Cyberarm IEC", Cyberarm.CyberarmIEC());
        cyberarmMap.put("Cyberarm Militech", Cyberarm.CyberarmMilitech());
        cyberarmMap.put("Standard Hand", Cyberarm.StandardHand());

        cyberarmMap.put ("Big Knucks", Cyberarm.CyberarmMods.BigKnucks());
        cyberarmMap.put ("Chainripp", Cyberarm.CyberarmMods.ChainRipp());
        cyberarmMap.put ("Gorilla Arms", Cyberarm.CyberarmMods.GorillaArms());
        cyberarmMap.put ("Popup Grenade Launcher", Cyberarm.CyberarmMods.PopupGrenadeLauncher());
        cyberarmMap.put ("Popup Melee Weapon", Cyberarm.CyberarmMods.PopupMeleeWeapon());
        cyberarmMap.put ("Popup Ranged Weapon", Cyberarm.CyberarmMods.PopupRangedWeapon());
        cyberarmMap.put ("Popup Shield", Cyberarm.CyberarmMods.PopupShield());
        cyberarmMap.put ("Rippers", Cyberarm.CyberarmMods.Rippers());
        cyberarmMap.put ("Scratchers ", Cyberarm.CyberarmMods.Scratchers());
        cyberarmMap.put ("Slice ‘N Dice", Cyberarm.CyberarmMods.SliceNDice());
        cyberarmMap.put ("Wolvers ", Cyberarm.CyberarmMods.Wolvers());

        //CYBERLEGS
        cyberarmMap.put("Cyberleg Dynalar Technologies", Cyberleg.CyberlegDynalarTechnologies());
        cyberarmMap.put("Cyberleg IEC", Cyberleg.CyberlegIEC());
        cyberarmMap.put("Cyberleg Militech", Cyberleg.CyberlegMilitech());
        cyberarmMap.put("Standard Foot", Cyberleg.StandardFoot());

        return cyberarmMap;
    }

}
