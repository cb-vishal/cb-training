import java.io.*;
import java.util.*;

class Emp implements Comparable<Emp> {
        private String name;
	private int salary;
	private int age;
 
	
	public void setName(String name) {
		this.name=name;
	}
        public void setSalary(int salary) {
		this.salary=salary;
	} 
        public void setAge(int age) {
		this.age=age;
	}
	
 
	public String getName() {
		return name;
	}
        public int getSalary() {
		return salary;
	}  
        public int getAge() {
		return age;
	}
 
 
	@Override
	public int compareTo(Emp e) {
 
		if (this.getAge() > e.getAge())
			return 1;
		else if (this.getAge() < e.getAge())
			return -1;
		else
			return 0;
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
                ArrayList<Emp> ar=new ArrayList<Emp>();
		Emp e1 = new Emp();
                e1.setName("vishal");
                e1.setSalary(5000);
                e1.setAge(23);
                ar.add(e1);
                Emp e2 = new Emp();
                e2.setName("raju");
                e2.setSalary(5000);
                e2.setAge(22);
                ar.add(e2);
		
                Collections.sort(ar);
                System.out.println(ar);
               Iterator it=ar.iterator();
               while(it.hasNext())
                {
                   Emp e=(Emp)it.next();
                   System.out.println(e.getName()+"   "+e.getSalary()+"   "+e.getAge());
               }
	}
}
