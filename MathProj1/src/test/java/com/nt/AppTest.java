package com.nt.;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
  @Test
  public void testAdd() {
    int x = 10;
	int y = 20;
	int expected = 30;
	int actual = new App().add(10,20);
	Assert.assertEquals("Result1", expected,actual);
  }
}
