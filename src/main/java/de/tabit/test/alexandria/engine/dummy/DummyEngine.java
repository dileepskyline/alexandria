package de.tabit.test.alexandria.engine.dummy;

import static java.lang.String.format;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import de.tabit.test.alexandria.engine.api.IAlexandriaGameEngine;
import de.tabit.test.alexandria.engine.players.DoublyLinkedList;
import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.BonusFactory;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;
import de.tabit.test.alexandria.engine.specialfields.TrapFactory;

public class DummyEngine implements IAlexandriaGameEngine {

    private final Random random = new Random();
    private static Map<Integer, ISpecialFields> specialFields;
	DoublyLinkedList players;
	Players currentPlayer;

    @Override
    public String startGame(Integer numberOfPlayers) {
    	players = new DoublyLinkedList();
    	for(int i=0; i<numberOfPlayers; i++) {
    		players.add();
    	}
    	BonusFactory bonusFactory = new BonusFactory();
    	
    	specialFields = new HashMap<Integer, ISpecialFields>();
    	while(specialFields.size()<5) {
    		int field = random.nextInt(30)+1;
    		int type = random.nextInt(3)+1;
    		if(specialFields.get(field) ==null) {
    			specialFields.put(field, bonusFactory.getBonusType(type));
    		}
    	}
    	
    	TrapFactory trapFactory = new TrapFactory();
    	while(specialFields.size()<10) {
    		int field = random.nextInt(30)+1;
    		int type = random.nextInt(3)+1;
    		if(specialFields.get(field) ==null) {
    			specialFields.put(field, trapFactory.getTrapType(type));
    		}
    	}
    	
        return "Field x has a trap..." + specialFields.keySet();
    }

    @Override
    public boolean gameIsRunning() {
    	Players currPlayer = players.getHead();
        while(currPlayer.nextNode!=null) {
        	if(currPlayer.currentPosition > 30) {
        		return Boolean.FALSE;
        	}
        	currPlayer =currPlayer.nextNode;
        }
        return Boolean.TRUE;
    }

    @Override
    public String nextPlayer() {
        return format("Player %d", random.nextInt(4) + 1);
    }

    @Override
    public String nextPlayerTurn(Integer input) {
        if(currentPlayer==null) {
        	currentPlayer = players.getHead();
        }
        if(currentPlayer.frozen) {
        	currentPlayer.frozen=Boolean.FALSE;
        }else {
        	currentPlayer.currentPosition+=input;
        	if(specialFields.containsKey(currentPlayer.currentPosition)) {
        		specialFields.get(currentPlayer.currentPosition).apply(currentPlayer);
        	}
        }
        currentPlayer = currentPlayer.nextNode;
        return "Player x is doing something";
    }
}
