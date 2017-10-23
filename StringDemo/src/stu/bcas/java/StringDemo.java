package stu.bcas.java;
public class StringDemo {
	public static void main(String[] args) {
	
		String str =      "BCAS";
		String str2 =     "BCAS CAMPUS JAFFNA";
		String str3 =      "CAMPUS";
		
		
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println("String length : " + str.length());
		System.out.println("String length : " + str2.length());
		
		System.out.println(str.substring(2));
		System.out.println(str2.substring(5));
		
		System.out.println(str.trim());
		System.out.println(str2.trim());
		
		System.out.println(str2.substring(5, 11));
		
		
		System.out.println(str.charAt(3));
		System.out.println(str2.compareTo(str));
		System.out.println(str2.compareToIgnoreCase(str));
		System.out.println(str2.concat(str));			
		System.out.println(str3.contentEquals(str2));
		
		char charArray [] = {'a','e','i','o','u',};
		
		System.out.println(str.copyValueOf(charArray));	
		System.out.println(str.copyValueOf(charArray,3,2));
		
		System.out.println(str.endsWith("S"));
		System.out.println(str2.equals(str3));		
		System.out.println(str.getBytes());
		System.out.println(str.equalsIgnoreCase(str2));
	    System.out.println(str.hashCode());
	    System.out.println(str2.indexOf(2,3));
	    System.out.println(str2.indexOf(4));
	    System.out.println(str2.intern());
	    System.out.println(str2.lastIndexOf("A"));
	    System.out.println(str3.length()); 	    	    
	    System.out.println(str.matches(str));
	    System.out.println(str2.split(str2));
	    System.out.println(str.startsWith("B"));
	    System.out.println(str.toString());
	    System.out.println(str2.subSequence(5, 9));
	    System.out.println(str2.toLowerCase());
	    System.out.println(str2.toLowerCase());
	    System.out.println(str2.toUpperCase());
	    System.out.println(str.toCharArray());
	    System.out.println(str.substring(1));
	    System.out.println(str.substring(2,4));
	    System.out.println(str.trim());
	    System.out.println(str2.indexOf("A"));
	    
	    
	    
	    
		
	}

}
