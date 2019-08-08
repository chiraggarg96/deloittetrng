package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;

import java.util.List;
import java.util.Map;



public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> a= new ArrayList<Emp>();
		Emp emp1= new Emp(1,"Rohan");
		Emp emp2= new Emp(2,"Sohan");
		Emp emp3= new Emp(3,"Mohan");
		Emp emp4= new Emp(4,"Tohan");
		
		a.add(emp1);
		a.add(emp2);
		a.add(emp3);
		a.add(emp4);
		
		Iterator<Emp> iterator = a.iterator();
		
		while(iterator.hasNext()) {
			Emp emp =iterator.next();
			if(emp.getEmpid()>2)
			{
				System.out.println(emp);
			}
		}
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.sort(a,new empidcomparator());
		System.out.println(a);
		
		Map<Integer,String> data= new Hashtable<Integer,String>();
		
		data.put(1, "rgiu");
		data.put(2, "rgvfiu");
		data.put(3, "rgrgesiu");
		data.put(4, "rgirfdsu");
		
		System.out.println(data.get(4));
		
		for (Map.Entry<Integer,String> entry : data.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 

	}

} 
			