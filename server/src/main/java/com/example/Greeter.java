package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone el nombre de alguien
   * @return greeting el mensaje a devolver
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
