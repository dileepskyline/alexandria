package de.tabit.test.alexandria.engine.specialfields.impl;

import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;

public class BonusType3 implements ISpecialFields{

	/**
	 * Give Jocker to player
	 */
	@Override
	public void apply(Players player) {
		player.joker = Boolean.TRUE;
	}

}
