package com.nt.App;

 class App {
	 public int add(int x, int y){
		 return x+y;
	 }
  public static void main(String[] args) {
    System.out.println("Hello World!");
	App app = new App();
	int result = app.add(10,20);
	System.out.println("Result"+result);
	System.out.println("End of the App");
  }
}
