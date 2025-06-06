package br.com.cod3r.factory.enums;

public enum IPhoneLevelEnum {
  STANDARD("standard"), HIGH_END("highEnd");

  private String level;

  IPhoneLevelEnum(String level) {
    this.level = level;
  }

  public String getLevel() {
    return level;
  }

  public static IPhoneLevelEnum fromString(String level) {
    for (IPhoneLevelEnum value : IPhoneLevelEnum.values()) {
      if (value.level.equalsIgnoreCase(level)) {
        return value;
      }
    }
    throw new IllegalArgumentException("No constant with text " + level + " found");
  }
}
