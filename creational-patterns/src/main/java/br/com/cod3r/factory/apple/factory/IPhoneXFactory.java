package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;
import br.com.cod3r.factory.enums.IPhoneLevelEnum;

public class IPhoneXFactory extends IPhoneFactory {
  public IPhone createIPhone(String level) {
    if (level.equalsIgnoreCase(IPhoneLevelEnum.STANDARD.getLevel())) {
      return new IPhoneX();
    } else if (level.equalsIgnoreCase(IPhoneLevelEnum.HIGH_END.getLevel())) {
      return new IPhoneXSMax();
    } else {
      return null;
    }
  }
}
