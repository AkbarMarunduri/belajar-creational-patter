package amd.programmer.java.spring.creational.factory.method;

import lombok.Getter;

public class TwiterSocialMedia implements SosialMedia{

  @Getter
  private final String nama = "TWITER";

  @Getter
  private final String link ="https://twiter.com";

  @Getter
  private final SosialMediaType type = SosialMediaType.TWITER;

}
