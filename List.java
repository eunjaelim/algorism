package javaalgorithm;
import java.util.ArrayList;
import java.util.*;

public class List {
	public static void main(String[] args) {
	ArrayList<Integer> mylist=new ArrayList<Integer>();
	
	mylist.add(27);
	mylist.add(35);
	mylist.add(11);
	System.out.println(mylist.toString());
    
	mylist.remove(1);
	System.out.println(mylist.toString());
	
	System.out.println(mylist.get(0));
	
	System.out.println(mylist.indexOf(11));
	
	System.out.println(mylist.size());
	
	System.out.println(mylist.contains(11));
	
	ArrayList<String> str_list = new ArrayList<String>();
	str_list.add("A");
	str_list.add("B");
	str_list.add("C");
	System.out.println(str_list.toString());
	
	str_list.remove("B");
	System.out.println(str_list.toString());
	System.out.println(str_list.get(0));
	
	
	}
	
	
}
