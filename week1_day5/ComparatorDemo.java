import java.io.*;
import java.util.*;

class Employee {
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
 
 
	
}
 

class SalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
	
 
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else if (e1.getSalary() < e2.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}
}

class AgeComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
	
 
		if (e1.getAge() > e2.getAge()) {
			return 1;
		} else if (e1.getAge() < e2.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
                ArrayList<Employee> ar=new ArrayList<Employee>();
                Scanner s=new Scanner(System.in);
		Employee e1 = new Employee();
                e1.setName("vishal");
                e1.setSalary(4000);
                e1.setAge(23);
                ar.add(e1);
                Employee e2 = new Employee();
                e2.setName("raju");
                e2.setSalary(5000);
                e2.setAge(22);
                ar.add(e2);
		
                
               while(true)
                {
                  System.out.println("1.Sort by age::");
                  System.out.println("2.Sort by salary:");
                  System.out.println("3.Details");
                  System.out.println("4.exit");
                  int ch=s.nextInt();
                   switch(ch)
                    {
                     case 1: Collections.sort(ar, new AgeComparator());
                              break;
                     case 2: Collections.sort(ar, new SalaryComparator());
                              break;
                     case 3:
                             Iterator it=ar.iterator();
                             while(it.hasNext())
                              {
                               Employee e=(Employee)it.next();
                              System.out.println(e.getName()+"   "+e.getSalary()+"   "+e.getAge());
                              }
                           break;
                      case 4: System.exit(0);
                     }
                 }
	}
}
