package lesson1;

public class Aplications1 {
	
    byte a = 14;
    byte b = -3;    
    byte c = (byte) (a + b);
    System.out.println("Result.B = " + c);
    
    short min=-3;  
    short max=24;  
    System.out.println("Result.S "+min*max);  
     
    
    int value = 4;
    System.out.println(8/value);
    System.out.println(12/value);
    System.out.println(20/value);
    System.out.println(40/value);
	
    long a1 = 20;
    long b1 = 25;    
    long c1 =  (a1 + b1);
    System.out.println("Result.L = " + c1);
     
    
    float amount = 1.5F;
    float avalue = 2.4F;
    float result = amount - avalue;
    System.out.println(result);

    
    double value1 = 12.23;
    System.out.println(4/value1);
    System.out.println(-6/value1);
    
    char c3, c4, c5;
    c3 = 65;
    c4 = 66;
    c5 = 67;
    System.out.println("The characters are: " + c3 + c4 + c5);
    
    boolean j=true;
    boolean k=false;
    boolean i1= j&k;
    boolean m= !j;
    System.out.println("j=" +j);
    System.out.println("k=" +k);
    System.out.println("i=" +i1);
    System.out.println("m=" +m);
    

    
    int num1 = 7;
	int num2 =-8;

	System.out.println("Max " + Math.max(num1,num2));
	System.out.println("Min " + Math.min(num1,num2));
    
	
	int[] intArray = {207, 314, 8, 34, 45, -278, 150, 193, 7, 313 };

    int maxNum = intArray[0];
    int minNum = intArray[0];

    for (int j1 : intArray) {
        if (j1 > maxNum)
            maxNum = j1;
    }
    for (int j2 : intArray) {
        if (j2 < minNum)
            minNum = j2;
    }

    System.out.println("Max2 = " + maxNum);
    System.out.println("Min2 = " + minNum);
    
    // First commit to github
	
}
}
	
