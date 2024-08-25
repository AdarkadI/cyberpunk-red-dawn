package org.example.style_iron_crome.base;

import lombok.Getter;

@Getter
public enum CyberwareIllustrationPath {

    CYBEARM_DYNALAR_TECHNOLOGIES ("imagem-cyberware/CyberarmDynalarTechnologies.jpg"),
    CYBEARM_IEC ("imagem-cyberware/CyberarmIEC.jpg"),
    CYBEARM_MILITECH ("imagem-cyberware/CyberarmMilitech.jpg"),
    STANDARD_HAND ("imagem-cyberware/StandardHand.jpg"),

    CYBERLEG_DYNALAR_TECHNOLOGIES ("imagem-cyberware/CyberlegDynalarTechnologies.jpg"),
    CYBERLEG_IEC ("imagem-cyberware/CyberlegIEC.jpg"),
    CYBERLEG_MILITECH ("imagem-cyberware/CyberlegMilitech.jpg"),
    STANDARD_FOOT ("imagem-cyberware/StandardFoot.jpg");
    private String valueS =null;

    CyberwareIllustrationPath(String valueS) {
        this.valueS = valueS;
    }
}
