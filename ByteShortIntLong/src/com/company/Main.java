package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue =10000;
	int myMinIntVlue=Integer.MIN_VALUE;
        int myMaxIntVlue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value= "  + myMinIntVlue);

        System.out.println("Integer Maximum Value= "  + myMaxIntVlue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value= "  + myMinByteValue);
        System.out.println("Byte Minimum Value= "  + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value= "  + myMinShortValue);
        System.out.println("Short Minimum Value= "  + myMaxShortValue);

        long myMinlONGValue = Long.MIN_VALUE;
        long myMaxlONGValue = Long.MAX_VALUE;
        System.out.println("lONG Minimum Value= "  + myMinlONGValue);
        System.out.println("lONG Minimum Value= "  + myMaxlONGValue);

         long bigLongValue = 2147483647L;
        System.out.println(bigLongValue);
        short bigShortLiteralValue=32767;

        int mySum = (myMinIntVlue/2);
        byte myNEWbyteValue = (byte)(myMinByteValue/2);
        System.out.println(myNEWbyteValue);
        short myNewShortValue = (short)(myMinShortValue/2);
        System.out.println(myNewShortValue);

    }
}
