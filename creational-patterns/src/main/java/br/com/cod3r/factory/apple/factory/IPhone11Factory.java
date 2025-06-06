package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.enums.IPhoneLevelEnum;

public class IPhone11Factory extends IPhoneFactory {
  public IPhone createIPhone(String level) {
    if (level.equalsIgnoreCase(IPhoneLevelEnum.STANDARD.getLevel())) {
      return new IPhone11();
    } else if (level.equalsIgnoreCase(IPhoneLevelEnum.HIGH_END.getLevel())) {
      return new IPhone11Pro();
    } else {
      return null;
    }
  }
}
