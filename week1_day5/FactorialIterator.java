import java.io.*;
import java.util.*;
class Factorial
  {
   private int lowerLimit;
   private int upperLimit;
   Factorial(int lowerLimit,int upperLimit)
     {
       this.lowerLimit=lowerLimit;
        this.upperLimit=upperLimit;
      }

      
   public String toString()
    {
       String result="";
       int f=1;
       int i=2;
        while(i<=lowerLimit)
         {
           f=f*i;
            i++;
          }
          result=result+f;
         while(i<=upperLimit)
          {
           f=f*i;
           result=result+" "+f;
           i++;
          }
     return result;
      }
}

 class FactorialIterator<Fatorial> implements Iterator<Object> {

	private ArrayList<Factorial>  fact;
	private int position;

	public FactorialIterator(Factorial fact) {
		this.fact = fact.getFactorial();
	}

	@Override
	public boolean hasNext() {
		if (position < fact.size())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		Object factObj = fact.get(position);
		position++;
		return factObj;
	}

	//@Override
	/*public void remove() {
		animal.remove(position);

       }*/
}


 class Fact implements Iterable<Factorial> {

	private ArrayList<Factorial> fact = new ArrayList<Factorial>();

	public Fact(ArrayList<Factorial> fact){
		this.fact = fact;
	}

	public ArrayList getFactorial() {
		return fact;
	}

	@Override
	public Iterator<Factorial> iterator() {
		return new FactorialIterator(this);
	}

}





public class FactorialIterator {

	public static void main(String args[]) {
		ArrayList<Factorial> factList = new ArrayList<Factorial>();
		Factorial f1=new Factorial(2,4);
                factList.add(f1);
                Factorial f2=new Factorial(3,4);
                factList.add(f2);
		

		for (Factorial factObj : factList) {
			System.out.println(factObj.toString());
		}
	}
}
