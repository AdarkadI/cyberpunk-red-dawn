package org.example.style_iron_crome.base;

import lombok.Getter;

@Getter
public enum CyberwareIllustrationPath {

    CYBEARM_DYNALAR_TECHNOLOGIES ("imagem-cyberware/CyberarmDynalarTechnologies.jpg"),
    CYBEARM_IEC ("imagem-cyberware/CyberarmIEC.jpg"),
    CYBEARM_MILITECH ("imagem-cyberware/CyberarmMilitech.jpg"),
    STANDARD_HAND ("imagem-cyberware/StandardHand.jpg");

    private String valueS =null;

    CyberwareIllustrationPath(String valueS) {
        this.valueS = valueS;
    }
}
