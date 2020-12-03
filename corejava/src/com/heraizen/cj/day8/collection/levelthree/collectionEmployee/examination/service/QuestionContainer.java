package com.heraizen.cj.day8.collection.levelthree.collectionEmployee.examination.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.heraizen.cj.day8.collection.levelthree.collectionEmployee.examination.questionskel.Questions;
public class QuestionContainer {
	
	List<Questions> list;
	Scanner readVal = new Scanner(System.in);
	int cAns,wAns;
	
	public QuestionContainer() {
		list = new ArrayList<>();
		
		list.add(new Questions("1. Which of the following option leads to the portability and security of Java?", "A.Bytecode is executed by JVM",
								"B.The applet makes the Java code secure and portable", "C.Use of exception handling", "D.Dynamic binding between objects",
								"A"));
		list.add(new Questions("2. Which of the following is not a Java features?", "A.Dynamic","B.Architecture Neutral", "C.Use of pointers", "D.Object-oriented",
				 				"C"));
		list.add(new Questions("3. The \\u0021 article referred to as a :", "A.Unicode escape sequence","B.Octal escape", "C.Hexadecimal", "D.Line feed","A"));
		list.add(new Questions("4. _____ is used to find and fix bugs in the Java programs.", "A.JVM","B.JRE", "C.JDK", "D.JDB","D"));
		list.add(new Questions("5. Which of the following is a valid declaration of a char?", "A.char ch = '\\utea';",
								"B.char ca = 'tea';", "C.char cr = \\u0223;", "D.char cc = '\\itea';","A"));
	}
	
	public void beginTest( ){
		
		System.out.println("\n\t\t\t<+++++++++++++ Start Test ++++++++++++++++>");
		list.forEach(s->{
			System.out.printf("\nQuestion ");
			System.out.printf("%s",s.question);
			System.out.println("\n\n\t\t"+s.option1);
			System.out.println("\n\t\t"+s.option2);
			System.out.println("\n\t\t"+s.option3);
			System.out.println("\n\t\t"+s.option4);
			System.out.printf("\n\n Choose Your Answer(A|B|C|D) : ");
			String answer = readVal.next();
			
			if(s.answer.equals(answer)) {
				cAns++;
			}else {
				wAns++;
			}
			
		});
		
		
	}
	
	public void showResult() {
		
		System.out.println("\n Total Question Value : "+list.size());
		System.out.println("\n Correct : "+cAns);
		System.out.println("\n Wrong : "+wAns);
	    System.out.printf("\n Result : ");
	    if(cAns < 2) {
	    	System.out.printf("FAIL");
	    }else {
	    	System.out.printf("PASS");
	    }
		
	}

}
