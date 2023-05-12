package midsem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class AA {
	int reg;
	String name;
	int noOfClass;
	static int totalClasses = 100;

	AA(int reg,String name,int noOfClass) {
		this.reg=reg;
		this.name=name;
		this.noOfClass=noOfClass;
		}
	double per() {
		double per=(noOfClass*100)/100;
		System.out.println("Reg "+reg+", "+per+"%");
		return per;
	}
}
public class Q2 {

	public static void main(String[] args) {
		AA a1 = new AA(1,"A",70);
		AA a2 = new AA(2,"B",80);
		AA a3 = new AA(3,"C",90);
		AA a4 = new AA(4,"D",60);
		HashMap<Integer,Double> hmap= new HashMap<>();
		hmap.put(a1.reg, a1.per());
		hmap.put(a2.reg, a2.per());
		hmap.put(a3.reg, a3.per());
		hmap.put(a4.reg, a4.per());
		int c=0;
		for(Map.Entry<Integer, Double> e : hmap.entrySet()) {
			if(e.getValue()<75) {
				hmap.remove(e.getKey(),e.getValue());
			}
			else {
				System.out.println("Regd No: "+e.getKey()+" Precentage: "+e.getValue()+"%");
				c++;
			}
		}
		System.out.println("Number of student scored more than 75% are "+c);
	}
}