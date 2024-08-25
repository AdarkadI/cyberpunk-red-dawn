package org.example.style_iron_crome.cyberwares;

import org.example.night_market.base.NightMarketConstants;
import org.example.style_iron_crome.base.Cyberware;
import org.example.style_iron_crome.base.CyberwareConstants;
import org.example.style_iron_crome.base.CyberwareDescriptions;
import org.example.style_iron_crome.base.CyberwareIllustrationPath;

public class Cyberarm extends Cyberware {

    /**
     * Metodo que criara os objetos dos cyberwares com o oque  chegar nos parametros:
     * @param name nome do cyberware
     * @param install local de instalacao
     * @param fundational se eh fundamentao ou nao
     * @param optionSlots slots disponiveis ou ocupados (definido pelo fundational)
     * @param description o que o cyberware faz
     * @param price preco de mercado
     * @param humanityLost perca de humanidade que o cyberware causa
     * @param illustration caminho da imagem do cyberware
     */
    private static Cyberarm createCyberarm(String category, String name, String install, boolean fundational, int optionSlots,
                                          String description, Number price, Number humanityLost, String illustration) {
        Cyberarm cyberarm = new Cyberarm();
        cyberarm.setCategory(category);
        cyberarm.setCyberwareName(name);
        cyberarm.setCyberwareInstall(install);
        cyberarm.setFundational(fundational);
        cyberarm.setCyberwareOptionSlots(optionSlots);
        cyberarm.setCyberwareDescription(description);
        cyberarm.setCyberwarePrice(price);
        cyberarm.setCyberwareHumanityLost(humanityLost);
        cyberarm.setIllustration(illustration);

        return cyberarm;
    }

    public static Cyberarm CyberarmDynalarTechnologies() {
        return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Cyberarm Dynalar Technologies", CyberwareConstants.HOSPITAL.getValueS(),
                true, 2, CyberwareDescriptions.CYBERARM_DYNALAR_TECHNOLOGIES.getValorS(),
                NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN(), CyberwareIllustrationPath.CYBEARM_DYNALAR_TECHNOLOGIES.getValueS());
    }

    public static Cyberarm CyberarmIEC() {
        return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Cyberarm IEC", CyberwareConstants.HOSPITAL.getValueS(),
                true, 3, CyberwareDescriptions.CYBERARM_IEC.getValorS(),
                NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN(), CyberwareIllustrationPath.CYBEARM_IEC.getValueS());
    }

    public static Cyberarm CyberarmMilitech() {
        return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Cyberarm Militech", CyberwareConstants.HOSPITAL.getValueS(),
                true, 3, CyberwareDescriptions.CYBERARM_MILITECH.getValorS(),
                NightMarketConstants.V_EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_HIGH.getValueN(), CyberwareIllustrationPath.CYBEARM_MILITECH.getValueS());
    }

    public static Cyberarm StandardHand() {
        return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Standard Hand", CyberwareConstants.CLINIC.getValueS(),
                true, 0, CyberwareDescriptions.STANDARD_HAND.getValorS(),
                NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_V_LOW.getValueN(), CyberwareIllustrationPath.STANDARD_HAND.getValueS());
    }

    /**
     * Mods de cyberarms.
     */
    public static class CyberarmMods extends Cyberware{

        /**
         * CYBERARMS DO TIPO ARMAMENTO.
         */
       /* public static Cyberarm BigKnucks() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Big Knucks", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.BIG_KNUCKS.getValorS(),
                    NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
        }
        public static Cyberarm ChainRipp() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"ChainRipp", CyberwareConstants.HOSPITAL.getValueS(),
                    false, 4, CyberwareDescriptions.CHIANRIPP.getValorS(),
                    NightMarketConstants.V_EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_HIGH.getValueN());
        }
        public static Cyberarm GorillaArms() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Gorilla Arms", CyberwareConstants.CLINIC.getValueS(),
                    false, 4, CyberwareDescriptions.GORILLA_ARMS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupGrenadeLauncher() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Popup Grenade Launcher", CyberwareConstants.CLINIC.getValueS(),
                    false, 2, CyberwareDescriptions.POPUP_GRENADE_LAUNCHER.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupMeleeWeapon() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Popup Melee Weapon", CyberwareConstants.CLINIC.getValueS(),
                    false, 2, CyberwareDescriptions.POPUP_MELEE_WEAPON.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupRangedWeapon() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Popup Ranged Weapon", CyberwareConstants.CLINIC.getValueS(),
                    false, 2, CyberwareDescriptions.POPUP_RANGED_WEAPON.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm PopupShield() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Popup Shield", CyberwareConstants.CLINIC.getValueS(),
                    false, 3, CyberwareDescriptions.POPUP_SHIELD.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        }
        public static Cyberarm Rippers() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Rippers", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.RIPPERS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
        }
        public static Cyberarm Scratchers() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Scratchers", CyberwareConstants.MALL.getValueS(),
                    false, 1, CyberwareDescriptions.SCRATCHERS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_V_LOW.getValueN());
        }
        public static Cyberarm SliceNDice() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Slice ‘N Dice ", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.SLICE_N_DICE.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN());
        }

        public static Cyberarm Wolvers() {
            return createCyberarm(CyberwareConstants.CYBERARM.getValueS(),"Wolvers ", CyberwareConstants.CLINIC.getValueS(),
                    false, 1, CyberwareDescriptions.WOLVERS.getValorS(),
                    NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN());
        } */

    }

}
