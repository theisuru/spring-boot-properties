package org.carbonsoldier.springbootproperties.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ApplicationProperties {
  @Value("${midgar.organization:Unknown}")
  private String organization;
}
