package org.mage.test.utils;

import mage.cards.Card;
import mage.constants.Zone;

/**
 * author: Matheus Lima
 */

import java.util.HashMap;

public class AliasCards {

    private HashMap<String,String> hashAlias;
    private Zone zone;

    public HashMap<String, String> getHashAlias() {
        return hashAlias;
    }

    public void setHashAlias(HashMap<String, String> hashAlias) {
        this.hashAlias = hashAlias;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
