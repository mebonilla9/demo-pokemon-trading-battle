package dev.manuel.demopokemontradingbattle;

import org.springframework.boot.SpringApplication;

public class TestDemoPokemonTradingBattleApplication {

  /**
   * Runs the main method of the DemoPokemonTradingBattleApplication class
   * using SpringApplication.from() method.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    SpringApplication
      .from(DemoPokemonTradingBattleApplication::main)
      .with(TestcontainersConfiguration.class)
      .run(args);
  }

}
