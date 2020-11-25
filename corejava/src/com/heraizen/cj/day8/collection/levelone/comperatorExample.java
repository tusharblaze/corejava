package com.heraizen.cj.day8.collection.levelone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class employee{
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "]";
	}

	String name;
	long id;
	
	

	public employee(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

public class comperatorExample {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		
		while(arr.size() != 10) {
			arr.add(ThreadLocalRandom.current().nextInt(1,100));
		}

		Collections.sort(arr,(o1,o2)->{ return o1%10 > o2%10 ? 1:-1;} );
		
		employee emp = new employee("Tushar",1001);
		
		String str ="Tushar-1101,rahul-1002,Ritesh-1102,Pawan-1441";
		
		String[] detailArr = str.split(",");
		
		
		
		
		List<employee> empList = new ArrayList<>();
		
		for(String a:detailArr) {
			String[] detail = a.split("-");
			empList.add(new employee(detail[0], Long.parseLong(detail[1])));
		}
		
		empList.forEach(s->{
			System.out.printf("%s\t%d\n",s.name,s.id);
		});
		
        Collections.sort(empList,(emp1,emp2)-> { return emp1.id > emp2.id ?  1:-1;});
        System.out.println();
		empList.forEach(s->{
			System.out.printf("%s\t%d\n",s.name,s.id);
		});
		
		arr.forEach(System.out::println);
	}

}
