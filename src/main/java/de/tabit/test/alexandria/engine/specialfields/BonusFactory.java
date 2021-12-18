package de.tabit.test.alexandria.engine.specialfields;

import de.tabit.test.alexandria.engine.specialfields.impl.BonusType1;
import de.tabit.test.alexandria.engine.specialfields.impl.BonusType2;
import de.tabit.test.alexandria.engine.specialfields.impl.BonusType3;

public class BonusFactory {

	public ISpecialFields getBonusType(int type) {
		if(type==1) {
			return new BonusType1();
		}else if(type==2) {
			return new BonusType2();
		}else if(type==3) {
			return new BonusType3();
		}else {
			return null;
		}
	}
}
