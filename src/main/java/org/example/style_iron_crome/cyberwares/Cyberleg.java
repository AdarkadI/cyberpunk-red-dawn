package org.example.style_iron_crome.cyberwares;

import org.example.night_market.base.NightMarketConstants;
import org.example.style_iron_crome.base.Cyberware;
import org.example.style_iron_crome.base.CyberwareConstants;
import org.example.style_iron_crome.base.CyberwareDescriptions;
import org.example.style_iron_crome.base.CyberwareIllustrationPath;

public class Cyberleg extends Cyberware {

    /**
     * Metodo que criara os objetos dos cyberwares com o oque  chegar nos parametros:
     * @param name nome do cyberware
     * @param install local de instalacao
     * @param fundational se eh fundamentao ou nao
     * @param optionSlots slots disponiveis ou ocupados (definido pelo isFundational)
     * @param description o que o cyberware faz
     * @param price preco de mercado
     * @param humanityLost perca de humanidade que o cyberware causa
     * @param illustration caminho da imagem do cyberware
     */
    private static Cyberware createCyberleg(String category, String name, String install, boolean fundational, int optionSlots,
                                            String description, Number price, Number humanityLost, String illustration){
        Cyberleg cyberleg = new Cyberleg();
        cyberleg.setCategory(category);
        cyberleg.setCyberwareName(name);
        cyberleg.setCyberwareInstall(install);
        cyberleg.setFundational(fundational);
        cyberleg.setCyberwareOptionSlots(optionSlots);
        cyberleg.setCyberwareDescription(description);
        cyberleg.setCyberwarePrice(price);
        cyberleg.setCyberwareHumanityLost(humanityLost);
        cyberleg.setIllustration(illustration);

        return cyberleg;
    }

    public static Cyberware CyberlegDynalarTechnologies(){
        return createCyberleg(CyberwareConstants.CYBERLEG.getValueS(),"Cyberleg Dynalar Technologies", CyberwareConstants.HOSPITAL.getValueS(),
                true, 1, CyberwareDescriptions.CYBERLEG_DYNALAR_TECHNOLOGIES.getValorS(),
                NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_LOW.getValueN(), CyberwareIllustrationPath.CYBERLEG_DYNALAR_TECHNOLOGIES.getValueS());
    }
    public static Cyberware CyberlegIEC(){
        return createCyberleg(CyberwareConstants.CYBERLEG.getValueS(),"Cyberleg IEC", CyberwareConstants.HOSPITAL.getValueS(),
                true, 3, CyberwareDescriptions.CYBERLEG_IEC.getValorS(),
                NightMarketConstants.EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_MID.getValueN(), CyberwareIllustrationPath.CYBERLEG_IEC.getValueS());
    }
    public static Cyberware CyberlegMilitech(){
        return createCyberleg(CyberwareConstants.CYBERLEG.getValueS(),"Cyberleg Militech", CyberwareConstants.HOSPITAL.getValueS(),
                true, 5, CyberwareDescriptions.CYBERLEG_MILITECH.getValorS(),
                NightMarketConstants.V_EXPENSIVE_VALUE.getValueN(), CyberwareConstants.HL_HIGH.getValueN(), CyberwareIllustrationPath.CYBERLEG_MILITECH.getValueS());
    }
    public static Cyberware StandardFoot(){
        return createCyberleg(CyberwareConstants.CYBERLEG.getValueS(),"Standard Foot", CyberwareConstants.CLINIC.getValueS(),
                true, 0, CyberwareDescriptions.STANDARD_FOOT.getValorS(),
                NightMarketConstants.PREMIUM_VALUE.getValueN(), CyberwareConstants.HL_V_LOW.getValueN(), CyberwareIllustrationPath.STANDARD_FOOT.getValueS());
    }



}
