package de.tabit.test.alexandria.engine.specialfields;

import de.tabit.test.alexandria.engine.specialfields.impl.TrapType1;
import de.tabit.test.alexandria.engine.specialfields.impl.TrapType2;
import de.tabit.test.alexandria.engine.specialfields.impl.TrapType3;

public class TrapFactory {

	public ISpecialFields getTrapType(int type) {
		if(type==1) {
			return new TrapType1();
		}else if(type==2) {
			return new TrapType2();
		}else if(type==3) {
			return new TrapType3();
		}else {
			return null;
		}
	}
}
