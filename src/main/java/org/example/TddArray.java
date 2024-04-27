package org.example;

public class TddArray {

    public static int[] impares(int number){

        int[] result = new int[0];
        int[] newArray = new int[0];

        if(number <=0) {
            throw new IllegalArgumentException();
        } else {
            for (int i =1; i<= number; i++){
                if (i%2 !=0){
                    newArray = new int[result.length +1];
                    System.arraycopy(result, 0, newArray, 0, result.length);
                    newArray[result.length] = i;
                    System.out.println(i);
                }
                result = newArray;

            }
        }
        return result;
    }
}
