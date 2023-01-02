/*
 * Copyright 2018-2023 Henri Tremblay.
 */
package pro.tremblay.alljava.solutions;

import org.junit.Test;

import java.util.function.IntSupplier;

/**
 * - See that it works
 * - Replace with method reference
 * - Show the NullPointerException
 */
public class MethodReferenceTest08 {

  @Test
  public void test() {
    String s = null;
    IntSupplier r = s::length;
  }
}
