package org.carbonsoldier.springbootproperties.config;

import lombok.Data;

@Data
public class UserProperties {
  private String name;
  private String title;
  private int age;

  public String toSummaryString() {
    return name + ", " + title;
  }
}
