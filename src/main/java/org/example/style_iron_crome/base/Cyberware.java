package org.example.style_iron_crome.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Cyberware {

    private String category;

    private String cyberwareName;

    private String cyberwareInstall;

    private boolean fundational;

    private int cyberwareOptionSlots;

    private String cyberwareDescription;

    private Number cyberwarePrice;

    private Number cyberwareHumanityLost;

    private String illustration;
}
