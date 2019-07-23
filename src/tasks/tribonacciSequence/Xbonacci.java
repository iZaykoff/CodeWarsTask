package tasks.tribonacciSequence;

import java.util.Arrays;

class Xbonacci {

  static double[] tribonacci(double[] s, int n) {
    if (n==0){
      return null;
    }
    double[] x = Arrays.copyOf(s,n);
    int count = 3;
    for (int i = 0; i < x.length; i++) {

      x[count] = x[i]+x[i+1]+x[i+2];
      count++;
      if (count==x.length){
        break;
      }
    }

      return x;// hackonacci me
  }
}