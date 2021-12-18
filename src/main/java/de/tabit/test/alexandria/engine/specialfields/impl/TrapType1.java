package de.tabit.test.alexandria.engine.specialfields.impl;

import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;

public class TrapType1 implements ISpecialFields{

	/**
	 * Push back the player to two position
	 */
	@Override
	public void apply(Players player) {
		if(player.joker) {
			player.joker = Boolean.FALSE;
			return;
		}
		player.currentPosition = player.currentPosition -2;
		if(player.currentPosition<0) {
			player.currentPosition = 0;
		}
	}

}
