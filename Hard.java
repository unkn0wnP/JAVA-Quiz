package java_quiz;

public class Hard {
	int n=20;
	String que[] = new String[n];
	char ans[] = new char[n];
	Hard()
	{
		que[0] = "What is the output of following code?"
			    +"\npublic class TestExam {"
			    +"\npublic static void main(String args[]) {"
			    +"\nbyte i, k;"
			    +"\ni = 10; k=49;"
			   +"\n k = (byte) (i > 0 ? k<<2 :k>>>5) ; // get absolute value of i"
			   +"\n System.out.println(k);"
			  +"\n}"
			+"\n}"
			+ "\nA. -50"
			+ "\nB. -30"

			+ "\nC. -60"

			+ "\nD. -20";
					
			ans[0] = 'C';

			que[1] = "How many instance of abstract class can be created?"
			+ "\nA. multiple"
			+ "\nB. 1"

			+ "\nC. 2"

			+ "\nD. 0";
					
			ans[1] = 'D';

			que[2] = "public class Test implements Runnable \r\n" + 
					"{ \r\n" + 
					"	public void run() \r\n" + 
					"	{ \r\n" + 
					"		System.out.printf(\" Thread's running \"); \r\n" + 
					"	} \r\n" + 
					"\r\n" + 
					"	try\r\n" + 
					"	{ \r\n" + 
					"		public Test() \r\n" + 
					"		{ \r\n" + 
					"			Thread.sleep(5000); \r\n" + 
					"		} \r\n" + 
					"	} \r\n" + 
					"	catch (InterruptedException e) \r\n" + 
					"	{ \r\n" + 
					"		e.printStackTrace(); \r\n" + 
					"	} \r\n" + 
					"	\r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		Test obj = new Test(); \r\n" + 
					"		Thread thread = new Thread(obj); \r\n" + 
					"		thread.start(); \r\n" + 
					"		System.out.printf(\" GFG \"); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					"What will be the output?"
			+ "\nA. GFG Thread’s running"
			+ "\nB. Thread’s running GFG"

			+ "\nC. Runtimer error"

			+ "\nD. Compilation error";
					
			ans[2] = 'D';

			que[3] = " Which of the following is good coding practice to determine oddity?\n"
					+ "(i)public boolen abc(int num)"
			+"\n{"	
			+"\n	return num % 2 == 1;"
			+"\n}"
			+"\n(ii)public boolean xyz(int num)"
			+"\n{"
			+"\n	return (num & 1)!= 0;"
			 +"\n}"
			+ "\nA. i"
			+ "\nB. ii"

			+ "\nC. (i) causes compilation error"

			+ "\nD. (ii) causes compilation error";
					
			ans[3] = 'B';

			que[4] = " Consider the two methods (within the same class)\npublic static int foo(int a, String s)"
			+"\n{"
			+"\ns = “Yellow”;"
			+"\na=a+2;"
			+"\nreturn a;"
			+"\n}"
			+"\npublic static void bar()"
			+"\n{"
			+"\nint a=3;"
			+"\nString s = “Blue”;"
			+"\na = foo(a,s);"
			+"\nSystem.out.println(“a=”+a+” s=”+s);"
			+"\n}"
			+"\npublic static void main(String args[])"
			+"\n{"
			+"\nbar();"
			+"}\nWhat is printed on execution of these methods?"
			+ "\nA. a = 3 s = Blue"
			+ "\nB. a = 5 s = Yellow"

			+ "\nC. a = 5 s = Blue"

			+ "\nD. Error";
					
			ans[4] = 'C';

			que[5] = " What will be the Output of the below code:"
					+ "\npublic class A { \r\n" + 
					"    public static void main(String[] args) \r\n" + 
					"    { \r\n" + 
					"       int $_ = 5; \r\n" + 
					"    } \r\n" + 
					"} "
			+ "\nA. 5"
			+ "\nB. Nothing"

			+ "\nC. Error"

			+ "\nD. Run Infinite";
					
			ans[5] = 'B';

			que[6] = "What will be the Output of the below code:"
					+ "public class A { \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		System.out.println('j' + 'a' + 'v' + 'a'); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. java"
			+ "\nB. 418"

			+ "\nC. 225"

			+ "\nD. Error";
					
			ans[6] = 'B';

			que[7] = " What will be the Output of the below code:"
					+ "\npublic class Demo{ \r\n" + 
					"	public static void main(String[] arr){ \r\n" + 
					"		Integer num1 = 100; \r\n" + 
					"		Integer num2 = 100; \r\n" + 
					"		Integer num3 = 500; \r\n" + 
					"		Integer num4 = 500; \r\n" + 
					"		\r\n" + 
					"		if(num1==num2){ \r\n" + 
					"			System.out.println(\"num1 == num2\"); \r\n" + 
					"		} \r\n" + 
					"		else{ \r\n" + 
					"			System.out.println(\"num1 != num2\"); \r\n" + 
					"		} \r\n" + 
					"		if(num3 == num4){ \r\n" + 
					"			System.out.println(\"num3 == num4\"); \r\n" + 
					"		} \r\n" + 
					"		else{ \r\n" + 
					"			System.out.println(\"num3 != num4\"); \r\n" + 
					"		} \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. num1 == num2\r\n" + 
			"    num3 == num4"
			+ "\nB. num1 == num2\r\n" + 
			"    num3 != num4"
			+ "\nC.  num1 != num2\r\n" + 
			"    num3 == num4"

			+ "\nD. num1 != num2\r\n" + 
			"    num3 != num4";
					
			ans[7] = 'B';

			que[8] = "What will be the Output of the below code:"
					+ "\npublic class Demo{ \r\n" + 
					"	public static void main(String[] arr){ \r\n" + 
					"		\r\n" + 
					"	} \r\n" + 
					"	public static void main(String arr){ \r\n" + 
					"		\r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. Nothing"
			+ "\nB. Finite Random String"

			+ "\nC. Error"

			+ "\nD. Infinite Random String";
					
			ans[8] = 'A';

			que[9] = "What will be the Output of the below code:\n"
					+ "public class A { \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		if (true) \r\n" + 
					"			break; \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. Nothing"
			+ "\nB. Finite Random String"

			+ "\nC. Infinite Random String"

			+ "\nD. Error";
					
			ans[9] = 'D';

			que[10] = "What will be the Output of the below code:\n"
					+ "// filename Main.java \r\n" + 
					"class Main { \r\n" + 
					"	public static void main(String args[]) { \r\n" + 
					"		System.out.println(fun()); \r\n" + 
					"	} \r\n" + 
					"	int fun() { \r\n" + 
					"		return 20; \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. 20"
			+ "\nB. Compiler Error"

			+ "\nC. No output with no error"

			+ "\nD. fun";
					
			ans[10] = 'B';

			que[11] = "What will be the Output of the below code:\n"
					+ "// filename Main.java \r\n" + 
					"class Test { \r\n" + 
					"	protected int x, y; \r\n" + 
					"} \r\n" + 
					"\r\n" + 
					"class Main { \r\n" + 
					"	public static void main(String args[]) { \r\n" + 
					"		Test t = new Test(); \r\n" + 
					"		System.out.println(t.x + \" \" + t.y); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. No output with no error"
			+ "\nB. Complier Error"

			+ "\nC. 0 0"

			+ "\nD. -1 -1";
					
			ans[11] = 'C';

			que[12] = "What will be the Output of the below code:\n"
					+ "class First \r\n" + 
					"{ \r\n" + 
					"	int i = 10; \r\n" + 
					"\r\n" + 
					"	public First(int j) \r\n" + 
					"	{ \r\n" + 
					"		System.out.println(i); \r\n" + 
					"		this.i = j * 10; \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					"\r\n" + 
					"class Second extends First \r\n" + 
					"{ \r\n" + 
					"	public Second(int j) \r\n" + 
					"	{ \r\n" + 
					"		super(j); \r\n" + 
					"		System.out.println(i); \r\n" + 
					"		this.i = j * 20; \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					"\r\n" + 
					"public class MainClass \r\n" + 
					"{ \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		Second n = new Second(20); \r\n" + 
					"		System.out.println(n.i); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. 10\r\n" + 
			"200\r\n" + 
			"400"
			+ "\nB. 10"

			+ "\nC. 10"
			+ "\n   20"

			+ "\nD. Error due to i variable";
					
			ans[12] = 'A';

			que[13] = "What will be the Output of the below code:\n"
					+ "class ThreadEx extends Thread \r\n" + 
					"{ \r\n" + 
					"	public void run() \r\n" + 
					"	{ \r\n" + 
					"		System.out.print(\"Hello...\"); \r\n" + 
					"	} \r\n" + 
					"	public static void main(String args[]) \r\n" + 
					"	{ \r\n" + 
					"		ThreadEx T1 = new ThreadEx(); \r\n" + 
					"		T1.start(); \r\n" + 
					"		T1.stop(); \r\n" + 
					"		T1.start(); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. Error due to void run"
			+ "\nB. Run Time Exception"

			+ "\nC. Hello..."

			+ "\nD. Hello...  And then Error";
					
			ans[13] = 'B';
			
			que[14] = " What will be the Output of the below code:\n"
					+ "public class Test \r\n" + 
					"{ \r\n" + 
					"	public static void main(String[] args) throws InterruptedException \r\n" + 
					"	{ \r\n" + 
					"		String str = new String(\"GeeksForGeeks\"); \r\n" + 
					"			\r\n" + 
					"		// making str eligible for gc \r\n" + 
					"		str = null; \r\n" + 
					"			\r\n" + 
					"		// calling garbage collector \r\n" + 
					"		System.gc(); \r\n" + 
					"			\r\n" + 
					"		// waiting for gc to complete \r\n" + 
					"		Thread.sleep(1000); \r\n" + 
					"	\r\n" + 
					"		System.out.println(\"end of main\"); \r\n" + 
					"	} \r\n" + 
					"\r\n" + 
					"	@Override\r\n" + 
					"	protected void finalize() \r\n" + 
					"	{ \r\n" + 
					"		System.out.println(\"finalize method called\"); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
			+ "\nA. end of main"
			+ "\nB. end of main"
			+ "\n   finalize method called"
			+ "\nC. finalize method called"
			+ "\nD. Error";
							
			ans[14] = 'A';

			que[15] = " What will be the Output of the below code:\n"
					+ "import java.util.*; \r\n" + 
					"\r\n" + 
					"public class priorityQueue \r\n" + 
					"{ \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		PriorityQueue<Integer> queue = \r\n" + 
					"							new PriorityQueue<>(); \r\n" + 
					"		queue.add(11); \r\n" + 
					"		queue.add(10); \r\n" + 
					"		queue.add(22); \r\n" + 
					"		queue.add(5); \r\n" + 
					"		queue.add(12); \r\n" + 
					"		queue.add(2); \r\n" + 
					"\r\n" + 
					"		while (queue.isEmpty() == false) \r\n" + 
					"			System.out.printf(\"%d \", queue.remove()); \r\n" + 
					"\r\n" + 
					"		System.out.println(\"\\n\"); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
					+ "\nA.  11 10 22 5 12 2"
					+ "\nB.  2 12 5 22 10 11"
					+ "\nC. 2 5 10 11 12 22"
					+ "\nD.  22 12 11 10 5 2";
									
					ans[15] = 'C';
					
			que[16] = " What will be the Output of the below code:\n"
					+ "import java.util.*; \r\n" + 
					"\r\n" + 
					"public class Treeset \r\n" + 
					"{ \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		TreeSet<String> treeSet = new TreeSet<>(); \r\n" + 
					"\r\n" + 
					"		treeSet.add(\"Geeks\"); \r\n" + 
					"		treeSet.add(\"for\"); \r\n" + 
					"		treeSet.add(\"Geeks\"); \r\n" + 
					"		treeSet.add(\"GeeksforGeeks\"); \r\n" + 
					"\r\n" + 
					"		for (String temp : treeSet) \r\n" + 
					"			System.out.printf(temp + \" \"); \r\n" + 
					"\r\n" + 
					"		System.out.println(\"\\n\"); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
				+ "\nA. Geeks for Geeks GeeksforGeeks"
				+ "\nB. Geeks for GeeksforGeeks"
				+ "\nC. Geeks GeeksforGeeks for"
				+ "\nD. for GeeksforGeeks Geeks";
											
				ans[16] = 'C';
				
			que[17] = " What will be the Output of the below code:\n"
					+ "import java.util.*; \r\n" + 
					"\r\n" + 
					"public class linkedList \r\n" + 
					"{ \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		List<String> list1 = new LinkedList<>(); \r\n" + 
					"		list1.add(\"Geeks\"); \r\n" + 
					"		list1.add(\"for\"); \r\n" + 
					"		list1.add(\"Geeks\"); \r\n" + 
					"		list1.add(\"GFG\"); \r\n" + 
					"		list1.add(\"GeeksforGeeks\"); \r\n" + 
					"\r\n" + 
					"		List<String> list2 = new LinkedList<>(); \r\n" + 
					"		list2.add(\"Geeks\"); \r\n" + 
					"\r\n" + 
					"		list1.removeAll(list2); \r\n" + 
					"\r\n" + 
					"		for (String temp : list1) \r\n" + 
					"			System.out.printf(temp + \" \"); \r\n" + 
					"\r\n" + 
					"		System.out.println(); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
						+ "\nA. for Geeks GFG GeeksforGeeks"
						+ "\nB. for GeeksforGeeks GFG"
						+ "\nC. for GFG for"
						+ "\nD. for GFG GeeksforGeeks";
										
			ans[17] = 'D';
			
			que[18] = " What will be the Output of the below code:\n"
					+ "import java.util.*; \r\n" + 
					"\r\n" + 
					"public class stack \r\n" + 
					"{ \r\n" + 
					"	public static void main(String[] args) \r\n" + 
					"	{ \r\n" + 
					"		List<String> list = new LinkedList<>(); \r\n" + 
					"		list.add(\"Geeks\"); \r\n" + 
					"		list.add(\"for\"); \r\n" + 
					"		list.add(\"Geeks\"); \r\n" + 
					"		list.add(\"GeeksforGeeks\"); \r\n" + 
					"		Iterator<Integer> iter = list.iterator(); \r\n" + 
					"\r\n" + 
					"		while (iter.hasNext()) \r\n" + 
					"			System.out.printf(iter.next() + \" \"); \r\n" + 
					"\r\n" + 
					"		System.out.println(); \r\n" + 
					"	} \r\n" + 
					"} \r\n" + 
					""
					+ "\nA. Geeks for Geeks GeeksforGeeks"
					+ "\nB. GeeksforGeeks Geeks for Geeks"
					+ "\nC. Runtime Error"
					+ "\nD. Compilation Error";
									
		ans[18] = 'D';

		que[19] = " What will be the Output of the below code:\n"
				+ "class Helper \r\n" + 
				"{ \r\n" + 
				"	private int data; \r\n" + 
				"	private Helper() \r\n" + 
				"	{ \r\n" + 
				"		data = 5; \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				"public class Test \r\n" + 
				"{ \r\n" + 
				"	public static void main(String[] args) \r\n" + 
				"	{ \r\n" + 
				"		Helper help = new Helper(); \r\n" + 
				"		System.out.println(help.data); \r\n" + 
				"	} \r\n" + 
				"} \r\n" + 
				""
				+ "\nA. Compilation error"
				+ "\nB. 5"
				+ "\nC. Runtime error"
				+ "\nD. None of these";
								
		ans[19] = 'A';
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
