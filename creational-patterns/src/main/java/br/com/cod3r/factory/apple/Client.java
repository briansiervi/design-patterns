package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.enums.IPhoneLevelEnum;

public class Client {
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone(IPhoneLevelEnum.STANDARD.getLevel());
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 Pro");
		IPhone iphone2 = gen11Factory.orderIPhone(IPhoneLevelEnum.HIGH_END.getLevel());
		System.out.println(iphone2);
	}
}
