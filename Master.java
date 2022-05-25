package java_quiz;

public class Master {
	int n=5;
	String que[] = new String[n];
	char ans[] = new char[n];
	Master()
	{
		que[0] = "What will be the output of the following?\n"
				+ "class Test \r\n" + 
				"{ \r\n" + 
				"	int a = 1; \r\n" + 
				"	int b = 2; \r\n" + 
				"\r\n" + 
				"	Test func(Test obj) \r\n" + 
				"	{ \r\n" + 
				"		Test obj3 = new Test(); \r\n" + 
				"		obj3 = obj; \r\n" + 
				"		obj3.a = obj.a++ + ++obj.b; \r\n" + 
				"		obj.b = obj.b; \r\n" + 
				"		return obj3; \r\n" + 
				"	} \r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) \r\n" + 
				"	{ \r\n" + 
				"		Test obj1 = new Test(); \r\n" + 
				"		Test obj2 = obj1.func(obj1); \r\n" + 
				"\r\n" + 
				"		System.out.println(\"obj1.a = \" + obj1.a + \" obj1.b = \" + obj1.b); \r\n" + 
				"		System.out.println(\"obj2.a = \" + obj2.a + \" obj1.b = \" + obj2.b); \r\n" + 
				"\r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"" + 
				"A.	obj1.a = 1  obj1.b = 2\r\n" + 
				"obj2.a = 4  obj2.b = 3\n" + 
				"B.	obj1.a = 4  obj1.b = 3\r\n" + 
				"obj2.a = 4  obj2.b = 3\n" + 
				"C.	obj1.a = 1  obj1.b = 2\r\n" + 
				"obj2.a = 1  obj2.b = 2\n" + 
				"D.	Compiler error";
		ans[0] = 'B';
		
		que[1] = "What will be the output of the following?\n"
				+ "class Test \r\n" + 
				"{ \r\n" + 
				"	boolean[] array = new boolean[3]; \r\n" + 
				"	int count = 0; \r\n" + 
				"\r\n" + 
				"	void set(boolean[] arr, int x) \r\n" + 
				"	{ \r\n" + 
				"		arr[x] = true; \r\n" + 
				"		count++; \r\n" + 
				"	} \r\n" + 
				"\r\n" + 
				"	void func() \r\n" + 
				"	{ \r\n" + 
				"		if(array[0] && array[++count - 2] | array [count - 1]) \r\n" + 
				"			count++; \r\n" + 
				"\r\n" + 
				"		System.out.println(\"count = \" + count); \r\n" + 
				"	} \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) \r\n" + 
				"	{ \r\n" + 
				"		Test object = new Test(); \r\n" + 
				"		object.set(object.array, 0); \r\n" + 
				"		object.set(object.array, 1); \r\n" + 
				"		object.func(); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"\r\n" + 
				"" + 
				"A.	1\n" + 
				"B.	2\n" + 
				"C.	3\n" + 
				"D.	4";
		ans[1] = 'D';
		
		que[2] = "What will be the output of the following?\n"
				+ "// filename Main.java \r\n" + 
				"class Grandparent { \r\n" + 
				"	public void Print() { \r\n" + 
				"		System.out.println(\"Grandparent's Print()\"); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"\r\n" + 
				"class Parent extends Grandparent { \r\n" + 
				"	public void Print() { \r\n" + 
				"		System.out.println(\"Parent's Print()\"); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"\r\n" + 
				"class Child extends Parent { \r\n" + 
				"	public void Print() { \r\n" + 
				"		super.super.Print(); \r\n" + 
				"		System.out.println(\"Child's Print()\"); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"\r\n" + 
				"public class Main { \r\n" + 
				"	public static void main(String[] args) { \r\n" + 
				"		Child c = new Child(); \r\n" + 
				"		c.Print(); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"" + 
				"A.	Compiler Error in super.super.Print()\n" + 
				"B.	Grandparent's Print()\r\n" + 
				"Parent's Print()\r\n" + 
				"Child's Print()\n" + 
				"C.	Runtime Error\n" + 
				"D.	None";
		ans[2] = 'A';
		
		que[3] = "What will be the output of the following?\n"
				+ "class Base { \r\n" + 
				"	public static void show() { \r\n" + 
				"	System.out.println(\"Base::show() called\"); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"\r\n" + 
				"class Derived extends Base { \r\n" + 
				"	public static void show() { \r\n" + 
				"	System.out.println(\"Derived::show() called\"); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"\r\n" + 
				"class Main { \r\n" + 
				"	public static void main(String[] args) { \r\n" + 
				"		Base b = new Derived();; \r\n" + 
				"		b.show(); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"" + 
				"A.	 Base::show() called\n" + 
				"B.	 Derived::show() called\n" + 
				"C.	 Base::show() called\n"
				+ "   Derived::show() called\n" + 
				"D.	Compiler Error";
		ans[3] = 'A';
		
		que[4] = "Which of the following is true about inheritance in Java.\r\n" + 
				"\r\n" + 
				"1) In Java all classes inherit from the Object class directly or indirectly. The Object class is root of all classes.\r\n" + 
				"\r\n" + 
				"2) Multiple inheritance is not allowed in Java.\r\n" + 
				"\r\n" + 
				"3) Unlike C++, there is nothing like type of inheritance in Java where we can specify whether the inheritance is protected, public or private.\n\n" + 
				"A.	1,2\n" + 
				"B.	2,3\n" + 
				"C.	1,3\n" + 
				"D.	1,2,3";
		ans[4] = 'D';
	}
	public void display(int i)
	{
		System.out.println("\n"+que[i]+"\n");
	}
	public boolean answer(char a,int i)
	{
		if(a==ans[i])
			return true;
		else
			return false;
	}
	public void right(int i)
	{
		System.out.println("Right answer is : "+ans[i]);
	}
}
