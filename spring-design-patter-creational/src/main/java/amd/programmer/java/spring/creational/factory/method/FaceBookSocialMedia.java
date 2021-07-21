package amd.programmer.java.spring.creational.factory.method;

import lombok.Getter;

public class FaceBookSocialMedia implements SosialMedia{

  @Getter
  private final String nama = "FACEBOOK";

  @Getter
  private final String link ="https://facebook.com";

  @Getter
  private final SosialMediaType type = SosialMediaType.FACEBOOK;

}
