package org.example.style_iron_crome.cyberwares;

import org.example.night_market.base.NightMarketConstants;
import org.example.style_iron_crome.base.Cyberware;
import org.example.style_iron_crome.base.CyberwareConstants;
import org.example.style_iron_crome.base.CyberwareDescriptions;

public class Cyberarm extends Cyberware {

    /**
     * Metodo que criara os objetos dos cyberwares com o oque  chegar nos parametros:
     * @param name nome do cyberware
     * @param install local de instalacao
     * @param isFundational se eh fundamentao ou nao
     * @param optionSlots slots disponiveis ou ocupados (definido pelo isFundational)
     * @param description o que o cyberware faz
     * @param price preco de mercado
     * @param humanityLost perca de humanidade que o cyberware causa
     */
    private static Cyberarm createCyberarm(String name, String install, boolean isFundational, int optionSlots,
                                          String description, Number price, Number humanityLost) {
        Cyberarm cyberarm = new Cyberarm();
        cyberarm.setCyberwareName(name);
        cyberarm.setCyberwareInstall(install);
        cyberarm.setIsFundational(isFundational);
        cyberarm.setCyberwareOptionSlots(optionSlots);
        cyberarm.setCyberwareDescription(description);
        cyberarm.setCyberwarePrice(price);
        cyberarm.setCyberwareHumanityLost(humanityLost);

        return cyberarm;
    }

    public static Cyberarm CyberarmDynalarTechnologies() {
        return createCyberarm("Cyberarm Dynalar Technologies", CyberwareConstants.HOSPITAL.getValueS(),
                true, 2, CyberwareDescriptions.CYBERARM_DYNALAR_TECHNOLOGIES.getValorS(),
                NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
    }

    public static Cyberarm CyberarmIEC() {
        return createCyberarm("Cyberarm IEC", CyberwareConstants.HOSPITAL.getValueS(),
                true, 3, CyberwareDescriptions.CYBERARM_IEC.getValorS(),
                NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
    }

    public static Cyberarm CyberarmMilitech() {
        return createCyberarm("Cyberarm Militech", CyberwareConstants.HOSPITAL.getValueS(),
                true, 3, CyberwareDescriptions.CYBERARM_MILITECH.getValorS(),
                NightMarketConstants.V_EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_HIGH.getValueN());
    }

    public static Cyberarm StandardHand() {
        return createCyberarm("Standard Hand", CyberwareConstants.CLINIC.getValueS(),
                true, 0, CyberwareDescriptions.STANDARD_HAND.getValorS(),
                NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_V_LOW.getValueN());
    }

    /**
     * Mods de cyberarms.
     */
    public static class CyberarmMods extends Cyberware{

        /**
         * CYBERARMS DO TIPO ARMAMENTO.
         */
        public static Cyberarm BigKnucks() {
            return createCyberarm("Big Knucks", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.BIG_KNUCKS.getValorS(),
                    NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
        }
        public static Cyberarm ChainRipp() {
            return createCyberarm("ChainRipp", CyberwareConstants.HOSPITAL.getValueS(),
                    false, 4, CyberwareDescriptions.CHIANRIPP.getValorS(),
                    NightMarketConstants.V_EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_HIGH.getValueN());
        }
        public static Cyberarm GorillaArms() {
            return createCyberarm("Gorilla Arms", CyberwareConstants.CLINIC.getValueS(),
                    false, 4, CyberwareDescriptions.GORILLA_ARMS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupGrenadeLauncher() {
            return createCyberarm("Popup Grenade Launcher", CyberwareConstants.CLINIC.getValueS(),
                    false, 2, CyberwareDescriptions.POPUP_GRENADE_LAUNCHER.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupMeleeWeapon() {
            return createCyberarm("Popup Melee Weapon", CyberwareConstants.CLINIC.getValueS(),
                    false, 2, CyberwareDescriptions.POPUP_MELEE_WEAPON.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupRangedWeapon() {
            return createCyberarm("Popup Ranged Weapon", CyberwareConstants.CLINIC.getValueS(),
                    false, 2, CyberwareDescriptions.POPUP_RANGED_WEAPON.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupShield() {
            return createCyberarm("Popup Shield", CyberwareConstants.CLINIC.getValueS(),
                    false, 3, CyberwareDescriptions.POPUP_SHIELD.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm Rippers() {
            return createCyberarm("Rippers", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.RIPPERS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
        }
        public static Cyberarm Scratchers() {
            return createCyberarm("Scratchers", CyberwareConstants.MALL.getValueS(),
                    false, 1, CyberwareDescriptions.SCRATCHERS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_V_LOW.getValueN());
        }
        public static Cyberarm SliceNDice() {
            return createCyberarm("Slice ‘N Dice ", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.SLICE_N_DICE.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
        }

        public static Cyberarm Wolvers() {
            return createCyberarm("Wolvers ", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.WOLVERS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }

    }

}
