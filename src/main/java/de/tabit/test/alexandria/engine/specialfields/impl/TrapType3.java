package de.tabit.test.alexandria.engine.specialfields.impl;

import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;

public class TrapType3 implements ISpecialFields{

	/**
	 * Make the player frozen
	 */
	@Override
	public void apply(Players player) {
		if(player.joker) {
			player.joker = Boolean.FALSE;
			return;
		}
		player.frozen  = Boolean.TRUE;
	}

}
