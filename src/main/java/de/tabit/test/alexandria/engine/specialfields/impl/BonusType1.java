package de.tabit.test.alexandria.engine.specialfields.impl;

import java.util.List;

import de.tabit.test.alexandria.engine.players.Players;
import de.tabit.test.alexandria.engine.specialfields.ISpecialFields;

public class BonusType1 implements ISpecialFields{

	/**
	 * Move forward additional 2 Places
	 */
	@Override
	public void apply(Players player) {
		player.currentPosition = player.currentPosition + 2;
	}

}
