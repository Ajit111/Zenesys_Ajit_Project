package JavaProject.JavaProject;

public class Class_Object {
	  int x = 5;
	  int y = 10;
	  String abc = "Hello";
	  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	  String[] bikes = {"Honda", "Hero", "Tvs"};	  
	  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	  public static void main(String[] args) {
	    Class_Object myObj1 = new Class_Object();
	    Class_Object myObj2 = new Class_Object();
	    Class_Object myObj3 = new Class_Object();
	    Class_Object myObj4 = new Class_Object();
	    Class_Object myObj5 = new Class_Object();
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	    System.out.println(myObj3.y);
	    System.out.println(myObj1.cars[1]);
	    System.out.println(myObj4.bikes[1]);
	    System.out.println(myObj5.myNumbers[1][2]);
	  }
	}
