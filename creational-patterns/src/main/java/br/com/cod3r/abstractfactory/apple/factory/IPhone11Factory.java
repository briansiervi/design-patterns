package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11Pro;
import br.com.cod3r.factory.enums.IPhoneLevelEnum;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if (level.equals(IPhoneLevelEnum.STANDARD.getLevel())) {
			return new IPhone11(rules);
		} else if (level.equals(IPhoneLevelEnum.HIGH_END.getLevel())) {
			return new IPhone11Pro(rules);
		} else
			return null;
	}

}
