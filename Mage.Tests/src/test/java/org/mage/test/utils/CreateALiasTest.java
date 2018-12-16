package org.mage.test.utils;

import mage.cards.Card;
import mage.constants.Zone;
import mage.players.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * author: Matheus Lima
 * this class was made to create alias to test in any classe of the project
 */

public class CreateALiasTest {
    private Player player;
    private Zone zone;
    private String cards;


    public CreateALiasTest(Player player, Zone zone, String cards){
        this.player = player;
        this.zone = zone;
        this.cards = cards;
    }

    public static AliasCards generateAlias(Zone zone, String cards){
        UUID uuid = UUID.randomUUID();
        HashMap<String,String> hashMap = new HashMap<>();

        AliasCards aliasCards = new AliasCards();
        uuid = UUID.randomUUID();
        hashMap.put(uuid.toString(),cards);
        aliasCards.setHashAlias(hashMap);
        aliasCards.setZone(zone);

        return aliasCards;
    }
}
