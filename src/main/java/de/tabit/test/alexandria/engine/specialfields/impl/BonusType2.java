package de.tabit.test.alexandria.engine.specialfields.impl;

import java.util.List;

import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;

public class BonusType2 implements ISpecialFields{

	/**
	 * Move all other players 2 Step Backwards
	 */
	@Override
	public void apply(Players player) {
		Players tempPlayer = player.previousNode;
		while(tempPlayer!=null) {
			tempPlayer.currentPosition = tempPlayer.currentPosition - 2;
			if(tempPlayer.currentPosition<0) {
				tempPlayer.currentPosition = 0;
			}
			tempPlayer = tempPlayer.previousNode;
		}
		tempPlayer = player.nextNode;
		while(tempPlayer!=null) {
			tempPlayer.currentPosition = tempPlayer.currentPosition - 2;
			if(tempPlayer.currentPosition<0) {
				tempPlayer.currentPosition = 0;
			}
			tempPlayer = tempPlayer.nextNode;
		}
	}

}
