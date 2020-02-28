package com.epam.assignment;
import java.util.*;
public class App {
	public static void main( String[] args )
    {
		ArrayList<Sweets> all=new ArrayList<Sweets>();
		all.add(new Chocolates("dairymilk",12,3,"dark brown"));
		all.add(new Chocolates("milkybar",10,3,"white"));
		all.add(new Chocolates("rocher",17,5,"litebrown"));
		all.add(new Chocolates("munch",10,10,"dark brown"));
		all.add(new Chocolates("perk",10,10,"dark brown"));
		all.add(new candies("mangobites",140,120,"yellow"));
		all.add(new candies("kopiko",30,60,"litebrown"));
		all.add(new candies("oarnge toffies",2,5,"orange"));
		 ArrayList<Sweets> onlychocolates = new ArrayList<Sweets>();
	     for(int i = 0; i < all.size(); i++){
	         if(all.get(i) instanceof Chocolates){
	             onlychocolates.add(all.get(i));
	         }
	     }
	     ArrayList<Sweets> onlycandies = new ArrayList<Sweets>();
	     for(int i = 0; i < all.size(); i++){
	         if(all.get(i) instanceof candies){
	             onlycandies.add(all.get(i));
	         }
	     }
	     int lessthan50 = 0;
	     int lessthan100 = 0;
	     int lessthan150 = 0;
	     for(int i = 0; i < onlycandies.size(); i++) {
	     	if(onlycandies.get(i).cost < 50) {
	     		lessthan50++;
	     	}
	     	else if(onlycandies.get(i).cost < 100) {
	     		lessthan100++;
	     	}
	     	else {
	     		lessthan150++;
	     	}
	     }int jellycount = 0;
	        for(int i = 0; i < all.size(); i++){
	            if(all.get(i) instanceof jelly){
	                jellycount++;
	            }
	        }
	        System.out.println("Jelly Count is: "  + jellycount);
	        Collections.sort(onlychocolates,  new weight());
	        int totalweight = 0;
	        for(int i = 0; i < all.size(); i++){
	            totalweight += all.get(i).weight;
	        }
	        System.out.println("Total Sweets weight is: " + totalweight + "gms");
	        System.out.println("Chocolates weight in sorted order:");
	        for(int i = 0; i < onlychocolates.size(); i++){
	            System.out.println(onlychocolates.get(i).name + "- " +onlychocolates.get(i).weight + "gms");
	        }
	        System.out.println("candies in the predetermined range of 1- 50 Rs/- are: " + lessthan50);
	        System.out.println("candies in the predetermined range of 50- 100 Rs/- are: " + lessthan100);
	        System.out.println("candies in the predetermined range of 100- 150 Rs/- are: " + lessthan150);
	    }
	}
	     
	    