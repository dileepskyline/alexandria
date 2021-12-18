package de.tabit.test.alexandria.engine.specialfields.impl;

import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;

public class TrapType2 implements ISpecialFields{

	/**
	 * Add two position to all other Players
	 */
	@Override
	public void apply(Players player) {
		if(player.joker) {
			player.joker = Boolean.FALSE;
			return;
		}
		
		Players tempPlayer = player.previousNode;
		while(tempPlayer!=null) {
			tempPlayer.currentPosition = tempPlayer.currentPosition + 2;
			if(tempPlayer.currentPosition<0) {
				tempPlayer.currentPosition = 0;
			}
			tempPlayer = tempPlayer.previousNode;
		}
		
		tempPlayer = player.nextNode;
		while(tempPlayer!=null) {
			tempPlayer.currentPosition = tempPlayer.currentPosition + 2;
			if(tempPlayer.currentPosition<0) {
				tempPlayer.currentPosition = 0;
			}
			tempPlayer = tempPlayer.nextNode;
		}
	}

}
