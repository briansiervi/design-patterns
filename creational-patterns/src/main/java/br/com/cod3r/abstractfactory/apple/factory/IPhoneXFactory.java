package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneX;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhoneXSMax;
import br.com.cod3r.factory.enums.IPhoneLevelEnum;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if (level.equals(IPhoneLevelEnum.STANDARD.getLevel())) {
			return new IPhoneX(rules);
		} else if (level.equals(IPhoneLevelEnum.HIGH_END.getLevel())) {
			return new IPhoneXSMax(rules);
		} else
			return null;
	}

}
