package com.nt;

/**
 * SwapDemo
 *
 */
 class Swap
 {
	 int a, b;
	 void accept(int x, int y){
		 a=x;
		 b=y;
	 }
	 void swapValues(){
		 a=a+b;
		 b=a-b;
		 a=a-b;
	 }
	 void disp(){
		 System.out.println("Value of a:"+a);
		 System.out.println("Value of b:"+b);
	 }
 }
 class SwapDemo
 {
	 public static void main(String args[]){

		 if(args.length!=2){
			 System.out.println("Plz enter two values");
		 }
		 else{
			 int x1 = Integer.parseInt(args[0]);
			 int x2 = Integer.parseInt(args[1]);

			 Swap sw = new Swap();
			 sw.accept(x1, x2);
			 System.out.println("Before swapping");
			 System.out.println("===========");
			 sw.disp();
			 sw.swapValues();
			 System.out.println("Afer swapping");
			 System.out.println("============");
			 sw.disp();
		 }
	 }
 }

