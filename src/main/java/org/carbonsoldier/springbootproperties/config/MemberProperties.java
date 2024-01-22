package org.carbonsoldier.springbootproperties.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties("midgar")
public class MemberProperties {
  private List<UserProperties> members;
  private Map<String, UserProperties> memberDetails;
}
