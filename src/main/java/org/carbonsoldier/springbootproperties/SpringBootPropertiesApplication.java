package org.carbonsoldier.springbootproperties;

import lombok.extern.slf4j.Slf4j;
import org.carbonsoldier.springbootproperties.config.ApplicationProperties;
import org.carbonsoldier.springbootproperties.config.MemberProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@Slf4j
@EnableConfigurationProperties(MemberProperties.class)
public class SpringBootPropertiesApplication implements CommandLineRunner {
  private final ApplicationProperties applicationProperties;
  private final MemberProperties memberProperties;

  public SpringBootPropertiesApplication(ApplicationProperties applicationProperties, MemberProperties memberProperties) {
    this.applicationProperties = applicationProperties;
    this.memberProperties = memberProperties;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootPropertiesApplication.class, args);
  }

  @Override
  public void run(String... args) {
    log.info("=================== Starting Midgar report ==================");
    log.info("Reporting terrorist organization: " + applicationProperties.getOrganization());
    log.info("Number of members in the organization: " + memberProperties.getMembers().size());
    log.info("The most dangerous member is: " + memberProperties.getMemberDetails().values().stream().findFirst().orElseThrow().toSummaryString());
    log.info("=================== Ending Midgar report ==================");
  }
}
