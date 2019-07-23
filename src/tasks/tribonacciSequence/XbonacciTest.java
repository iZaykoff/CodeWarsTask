package tasks.tribonacciSequence;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class XbonacciTest {
  private Xbonacci variabonacci;
  
  @Before
  public void setUp() {
    variabonacci = new Xbonacci();
  }

  @After
  public void tearDown() {
    variabonacci = null;
  }

  @Test
  public void basicTests() {
    double precision = 1e-10;
    assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, Xbonacci.tribonacci(new double []{1,1,1},10), precision);
    assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, Xbonacci.tribonacci(new double []{0,0,1},10), precision);
    assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, Xbonacci.tribonacci(new double []{0,1,1},10), precision);
    assertArrayEquals(new double []{8,12,1,21,34,56}, Xbonacci.tribonacci(new double []{8,12,1},6), precision);
  }
}