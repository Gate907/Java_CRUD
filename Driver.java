import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Iterator;

public class Driver {
	static Scanner sc=new Scanner(System.in);
	static List<Student> li=new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch;
		do {
			System.out.println("1. Add Student "+"\n"+
						"2. View Student "+"\n"+"3. Delete Student "+"\n"+"4. update Student "+"\n");
			System.out.println("Enter your Choice :");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
			{
				addRecord();
				break;
			}
			case 2:
			{
				viewRecord();
				break;
			}
			case 3:
			{
				deleteRecord();
				break;
			}
			case 4:
			{
				updateRecord();
				break;
			}
			

			default:
				break;
			}
		}while(ch!=5);
		
	}

	private static void addRecord() {
		// TODO Auto-generated method stub
		Student stud=new Student();
		System.out.println("Enter ID :");
		int sid=sc.nextInt();
		System.out.println("Enter Name :");
		String snm=sc.next();
		System.out.println("Enter Marks :");
		int marks=sc.nextInt();
		stud.setSid(sid);
		stud.setSnm(snm);
		stud.setSmarks(marks);
		
		li.add(stud);
		System.out.println("Student Added Successfully..");
		
		
	}

	private static void viewRecord() {
		// TODO Auto-generated method stub
		if(li.isEmpty()) {
			System.out.println("NO Record Are Found");
		}
		
		else {
			for(Student s:li) {
				System.out.print(s+" ");
				System.out.println();


			}
		}
	}

	private static void deleteRecord() {
		// TODO Auto-generated method stub
		 Student stud=new Student();
			System.out.println("Enter ID which want Delete:");
			boolean isId=false;
			int sid=sc.nextInt();
			Iterator<Student> lt=li.iterator();
			while (lt.hasNext()) {
				Student s=lt.next();
				if(s.getSid()==sid) {
					lt.remove();
					isId=true;
					System.out.println("Student are Deleted...");
				}
			}
			if(!isId) {
				System.out.println("Student ID Are not Found..");
			}
			
	}

private static void updateRecord() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter ID which want Update:");
		boolean isId=false;
		int sid=sc.nextInt();
		
		for(Student s:li) {
			if(s.getSid()==sid) {
				System.out.println("Enter Name :");
				String snm=sc.next();
				System.out.println("Enter Marks :");
				int marks=sc.nextInt();
				s.setSnm(snm);
				s.setSmarks(marks);
				
		
				System.out.println("Student Updated Successfully..");
				break;
			}
			
		}
	}
    }
