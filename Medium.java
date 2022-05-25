package java_quiz;

public class Medium {
	int n=20;
	String que[] = new String[n];
	char ans[] = new char[n];
	Medium()
	{
		que[0] = "Which three are valid declarations of a char?\r\n" +  
				"1. char c1 = 064770;\r\n" + 
				"2. char c2 = 'face';\r\n" + 
				"3. char c3 = 0xbeef;\r\n" + 
				"4. char c4 = \\u0022;\r\n" + 
				"5. char c5 = '\\iface';\r\n" + 
				"6. char c6 = '\\uface';\r\n" + 
				"A. 1, 2, 4\r\n" + 
				"B.	1, 3, 6\r\n" + 
				"C.	3, 5\r\n" + 
				"D.	5 only";
					
			ans[0] = 'B';

			que[1] = "What is the output of this program?\r\n" + 
					"    class leftshift_operator \r\n" + 
					"    {\r\n" + 
					"        public static void main(String args[]) \r\n" + 
					"        {        \r\n" + 
					"             byte x = 64;\r\n" + 
					"             int i;\r\n" + 
					"             byte y; \r\n" + 
					"             i = x << 2;\r\n" + 
					"             y = (byte) (x << 2)\r\n" + 
					"             System.out.print(i + \" \" + y);\r\n" + 
					"        } \r\n" + 
					"    }\r\n" + 
					"A.	0 64\r\n" + 
					"B.	64 0\r\n" + 
					"C.	0 256\r\n" + 
					"D.	256 0";
					
			ans[1] = 'D';

			que[2] = "What will be the output of the program?\r\n" + 
					"\r\n" + 
					"class BitShift \r\n" + 
					"{\r\n" + 
					"    public static void main(String [] args) \r\n" + 
					"    {\r\n" + 
					"        int x = 0x80000000;\r\n" + 
					"        System.out.print(x + \" and  \");\r\n" + 
					"        x = x >>> 31;\r\n" + 
					"        System.out.println(x);\r\n" + 
					"    }\r\n" + 
					"}\r\n" + 
					"A.	-2147483648 and 1\r\n" + 
					"B.	0x80000000 and 0x00000001\r\n" + 
					"C.	-2147483648 and -1\r\n" + 
					"D.	1 and -2147483648";
					
			ans[2] = 'A';

			que[3] = "Which statement, inserted at line 10, creates an instance of Bar?\r\n" + 
					"class Foo \r\n" + 
					"{\r\n" + 
					"    class Bar{ }\r\n" + 
					"}\r\n" + 
					"class Test \r\n" + 
					"{\r\n" + 
					"    public static void main (String [] args) \r\n" + 
					"    {\r\n" + 
					"        Foo f = new Foo();\r\n" + 
					"        /* Line 10: Missing statement ? */\r\n" + 
					"    }\r\n" + 
					"}\r\n" + 
					"A.	Foo.Bar b = new Foo.Bar();\r\n" + 
					"B.	Foo.Bar b = f.new Bar();\r\n" + 
					"C.	Bar b = new f.Bar();\r\n" + 
					"D.	";
					
			ans[3] = 'B';

			que[4] = "Which of these statements is incorrect?\r\n" + 
					"A.	try block need not to be followed by catch block\r\n" + 
					"B.	try block can be followed by finally block instead of catch block\r\n" + 
					"C. try can be followed by both catch and finally block\r\n" + 
					"D.	try need not to be followed by anything";
					
			ans[4] = 'D';

			que[5] = "What is the output of this program?\r\n" + 
					"public class San \r\n" + 
					"{\r\n" + 
					"    public static void main(String args[])\r\n" + 
					"    {\r\n" + 
					"        try \r\n" + 
					"        {\r\n" + 
					"            System.out.print(\"Hello world \");\r\n" + 
					"        }\r\n" + 
					"        finally \r\n" + 
					"        {\r\n" + 
					"            System.out.println(\"Finally executing \");\r\n" + 
					"        }\r\n" + 
					"    }\r\n" + 
					"}\r\n" + 
					"A.	The program will not compile because no exceptions are specified\r\n" + 
					"B.	The program will not compile because no catch clauses are specified\r\n" + 
					"C.	Hello world\r\n" + 
					"D.	Hello world Finally executing";
					
			ans[5] = 'D';

			que[6] = "What will be the output of the following Java code?\r\n" + 
					"\r\n" + 
					"    class A \r\n" + 
					"    {\r\n" + 
					"        final public int calculate(int a, int b) { return 1; } \r\n" + 
					"    } \r\n" + 
					"    class B extends A \r\n" + 
					"    { \r\n" + 
					"        public int calculate(int a, int b) { return 2; } \r\n" + 
					"    } \r\n" + 
					"     public class output \r\n" + 
					"     {\r\n" + 
					"        public static void main(String args[]) \r\n" + 
					"        { \r\n" + 
					"            B object = new B(); \r\n" + 
					"            System.out.print(\"b is \" + b.calculate(0, 1));  \r\n" + 
					"        } \r\n" + 
					"    }\r\n" + 
					"A. b is : 2\r\n" + 
					"B. b is : 1\r\n" + 
					"C. Compilation Error\r\n" + 
					"D. An exception is thrown at runtime";
					
			ans[6] = 'C';

			que[7] = "class multidimention_array \r\n" + 
					"    {\r\n" + 
					"        public static void main(String args[])\r\n" + 
					"        {\r\n" + 
					"            int arr[][] = new int[3][];\r\n" + 
					"            arr[0] = new int[1];\r\n" + 
					"            arr[1] = new int[2];\r\n" + 
					"            arr[2] = new int[3];               \r\n" + 
					"	    int sum = 0;\r\n" + 
					"	    for (int i = 0; i < 3; ++i) \r\n" + 
					"	        for (int j = 0; j < i + 1; ++j)\r\n" + 
					"                    arr[i][j] = j + 1;\r\n" + 
					"	    for (int i = 0; i < 3; ++i) \r\n" + 
					"	        for (int j = 0; j < i + 1; ++j)\r\n" + 
					"                    sum + = arr[i][j];\r\n" + 
					"	    System.out.print(sum); 	\r\n" + 
					"        } \r\n" + 
					"    }\r\n" + 
					"A. 11\r\n" + 
					"B. 10\r\n" + 
					"C. 13\r\n" + 
					"D. 14";
					
			ans[7] = 'B';

			que[8] = "What is the output of following code? \r\n" + 
					"public class TestExam {\r\n" + 
					"    public static void main(String args[]) {\r\n" + 
					"    byte i, k;\r\n" + 
					"    i = 10; k=-3;\r\n" + 
					"    k = (byte) (i < 0 ? k>>10 :k>>>3) ; // get absolute value of i\r\n" + 
					"    System.out.println(k);\r\n" + 
					"  }\r\n" + 
					"}"+ 
					"A. 1\n" + 
					"B. -1\\n" + 
					"C. 2\n" + 
					"D. -2";
					
			ans[8] = 'B';

			que[9] = "class Q33 {\r\n" +
					"	int x, y;\r\n" +  
					"	void inc()\r\n" +
					"	{\r\n" + 
					"		x+=10;\r\n" + 
					"		y+=10;\r\n" + 
					"	}\r\n" + 
					"	void inc(int a)\r\n" + 
					"	{\r\n" + 
					"		x+=a;\r\n" + 
					"		y+=a;\r\n" + 
					"		a+=a;\r\n" + 
					"	}\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		int x=10;\r\n" + 
					"		Q33 ob=new Q33();\r\n" + 
					"		ob.inc();\r\n" + 
					"		System.out.println(ob.x+\" \"+ob.y);\r\n" + 
					"		ob.inc(x);\r\n" + 
					"		System.out.println(ob.x+\" \"+ob.y+\" \"+x);\r\n" + 
					"	}\r\n" + 
					"}\r\n" + 
					"The output of the given program is:\r\n" + 
					"A. 10 10\r\n" + 
					"20 20 20\r\n" + 
					"B. 0 0\r\n" + 
					"20 20 10\r\n" + 
					"C. 0 0\r\n" + 
					"20 20 20\r\n" + 
					"D. 10 10\r\n" + 
					"20 20 10";
					
			ans[9] = 'D';

			que[10] = "What is the output of following code?\r\n" + 
					"public class QuizIV {\r\n" + 
					"    public static void main(String s[]){\r\n" + 
					"        char[] a=new char[4];\r\n" + 
					"        for(int i=1;i<a.length;i++){\r\n" + 
					"            a[i]=(char)((byte)(i+115));            \r\n" + 
					"            System.out.print(a[i]+ \" \");\r\n" + 
					"        }      \r\n" + 
					"    } \r\n" + 
					"}\r\n" +  
					"A. u v w\r\n" + 
					"B. t u v \r\n" + 
					"C. s t u\r\n" + 
					"D. r s t";
					
			ans[10] = 'B';

			que[11] = "final class A \r\n" + 
					"    {\r\n" + 
					"         int i;\r\n" + 
					"    }    \r\n" + 
					"    class B extends A \r\n" + 
					"    {\r\n" + 
					"        int j;\r\n" + 
					"        System.out.println(j + \" \" + i);  \r\n" + 
					"    }    \r\n" + 
					"    class inheritance \r\n" + 
					"    {\r\n" + 
					"        public static void main(String args[])\r\n" + 
					"        {\r\n" + 
					"            B obj = new B();\r\n" + 
					"            obj.display();     \r\n" + 
					"        }\r\n" + 
					"   }\r\n" + 
					"A. a 2 2\r\n" + 
					"B. 3 3\r\n" + 
					"C. Runtime Error\r\n" + 
					"D. Compilation Error";
					
			ans[11] = 'D';

			que[12] = " class A \r\n" + 
					"   {\r\n" + 
					"	int i;\r\n" + 
					"	int j;\r\n" + 
					"        A() \r\n" + 
					"        {\r\n" + 
					"            i = 1;\r\n" + 
					"            j = 2;\r\n" + 
					"        }\r\n" + 
					"   }\r\n" + 
					"   class Output \r\n" + 
					"   {\r\n" + 
					"        public static void main(String args[])\r\n" + 
					"        {\r\n" + 
					"             A obj1 = new A();\r\n" + 
					"             A obj2 = new A();\r\n" + 
					"	     System.out.print(obj1.equals(obj2));\r\n" + 
					"        }\r\n" + 
					"   }\r\n" + 
					"A. false\r\n" + 
					"B. true\r\n" + 
					"C. 1\r\n" + 
					"D. Compilation Error";
					
			ans[12] = 'A';

			que[13] = "class A \r\n" + 
					"    {\r\n" + 
					"        public int i;\r\n" + 
					"        protected int j;\r\n" + 
					"    }    \r\n" + 
					"    class B extends A \r\n" + 
					"    {\r\n" + 
					"        int j;\r\n" + 
					"        void display() \r\n" + 
					"        {\r\n" + 
					"            super.j = 3;\r\n" + 
					"            System.out.println(i + \" \" + j);\r\n" + 
					"        }\r\n" + 
					"    }    \r\n" + 
					"    class Output \r\n" + 
					"    {\r\n" + 
					"        public static void main(String args[])\r\n" + 
					"        {\r\n" + 
					"            B obj = new B();\r\n" + 
					"            obj.i=1;\r\n" + 
					"            obj.j=2;   \r\n" + 
					"            obj.display();     \r\n" + 
					"        }\r\n" + 
					"   }\r\n" + 
					"A. 1 2\r\n" + 
					"B. 2 1\r\n" + 
					"C. 1 3\r\n" + 
					"D. 3 1";
					
			ans[13] = 'A';
			
			que[14] = "In the following Java code, which code fragment should be inserted at line 3 so that the output will be: “123abc 123abc”?\r\n" + 
					"\r\n" + 
					" 1. StringBuilder sb1 = new StringBuilder(\"123\");\r\n" + 
					" 2. String s1 = \"123\";\r\n" + 
					" 3.  // insert code here\r\n" + 
					" 4. System.out.println(sb1 + \" \" + s1);\r\n" + 
					"A. sb1.append(“abc”); s1.append(“abc”);\r\n" + 
					"B. sb1.append(“abc”); s1.concat(“abc”);\r\n" + 
					"C. sb1.concat(“abc”); s1.append(“abc”);\r\n" + 
					"D. sb1.append(“abc”); s1 = s1.concat(“abc”);";
							
			ans[14] = 'D';

			que[15] = "When is the Float object, created in line 3, eligible for garbage collection?\r\n" + 
					"public Object m() \r\n" + 
					"{  \r\n" + 
					"    Object o = new Float(3.14F); \r\n" + 
					"    Object [] oa = new Object[l];\r\n" + 
					"    oa[0] = o; /* Line 5 */\r\n" + 
					"    o = null;  /* Line 6 */\r\n" + 
					"    oa[0] = null; /* Line 7 */\r\n" + 
					"    return o; /* Line 8 */\r\n" + 
					"}\r\n" + 
					"A.	just after line 5\r\n" + 
					"B.	just after line 6\r\n" + 
					"C.	just after line 7\r\n" + 
					"D.	just after line 8";
									
			ans[15] = 'C';
					
			que[16] = "What will be the output of the program?\r\n" + 
					"\r\n" + 
					"public class Delta \r\n" + 
					"{ \r\n" + 
					"    static boolean foo(char c) \r\n" + 
					"    {\r\n" + 
					"        System.out.print(c); \r\n" + 
					"        return true; \r\n" + 
					"    } \r\n" + 
					"    public static void main( String[] argv ) \r\n" + 
					"    {\r\n" + 
					"        int i = 0; \r\n" + 
					"        for (foo('A'); foo('B') && (i < 2); foo('C')) \r\n" + 
					"        {\r\n" + 
					"            i++; \r\n" + 
					"            foo('D'); \r\n" + 
					"        } \r\n" + 
					"    } \r\n" + 
					"}\r\n" + 
					"A.	ABDCBDCB" + 
					"B.	ABCDABCD\r\n" + 
					"C.	Compilation fails.\r\n" + 
					"D.	An exception is thrown at runtime.";
											
			ans[16] = 'A';
				
			que[17] = "What will be the output of the program?\r\n" + 
					"\r\n" + 
					"public class If1 \r\n" + 
					"{\r\n" + 
					"    static boolean b;\r\n" + 
					"    public static void main(String [] args) \r\n" + 
					"    {\r\n" + 
					"        short hand = 42;\r\n" + 
					"        if ( hand < 50 && !b ) /* Line 7 */\r\n" + 
					"            hand++;\r\n" + 
					"        if ( hand > 50 );     /* Line 9 */\r\n" + 
					"        else if ( hand > 40 ) \r\n" + 
					"        {\r\n" + 
					"            hand += 7;\r\n" + 
					"            hand++;    \r\n" + 
					"        }\r\n" + 
					"        else\r\n" + 
					"            --hand;\r\n" + 
					"        System.out.println(hand);\r\n" + 
					"    }\r\n" + 
					"}\r\n" + 
					"A.	41\r\n" + 
					"B.	42\r\n" + 
					"C.	50\r\n" + 
					"D. 51";
										
			ans[17] = 'D';
			
			que[18] = "What will be the output of the program?\r\n" + 
					"\r\n" + 
					"boolean bool = true; \r\n" + 
					"if(bool = false) /* Line 2 */\r\n" + 
					"{\r\n" + 
					"    System.out.println(\"a\"); \r\n" + 
					"} \r\n" + 
					"else if(bool) /* Line 6 */\r\n" + 
					"{\r\n" + 
					"    System.out.println(\"b\"); \r\n" + 
					"} \r\n" + 
					"else if(!bool) /* Line 10 */\r\n" + 
					"{\r\n" + 
					"    System.out.println(\"c\"); /* Line 12 */\r\n" + 
					"} \r\n" + 
					"else \r\n" + 
					"{\r\n" + 
					"    System.out.println(\"d\"); \r\n" + 
					"}\r\n" + 
					"A.	\r\n" + 
					"B.	\r\n" + 
					"C.	\r\n" + 
					"D.	d";
									
		ans[18] = 'C';

		que[19] = "What will be the output of the program?\r\n" + 
				"\r\n" + 
				"int i = 0, j = 5; \r\n" + 
				"tp: for (;;) \r\n" + 
				"    {\r\n" + 
				"        i++;  \r\n" + 
				"        for (;;) \r\n" + 
				"        {\r\n" + 
				"            if(i > --j) \r\n" + 
				"            {\r\n" + 
				"                break tp; \r\n" + 
				"            } \r\n" + 
				"        } \r\n" + 
				"        System.out.println(\"i =\" + i + \", j = \" + j);\r\n" + 
				"A.	i = 1, j = 0\r\n" + 
				"B.	i = 1, j = 4\r\n" + 
				"C.	i = 3, j = 4\r\n" + 
				"D.	Compilation fails.";
								
		ans[19] = 'D';
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
