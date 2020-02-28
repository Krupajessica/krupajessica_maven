package com.epam.assignment;
	import java.util.*;
	public class Sweets{
		String name;
		int weight;
		int cost;
		String colour;
		Sweets(String name,int weight,int cost,String colour){
			this.name=name;
			this.weight=weight;
			this.cost=cost;
			this.colour=colour;
		}
		
	}
	class weight implements Comparator<Sweets>{
	   public  int compare(Sweets a, Sweets b){
        return a.weight  - b.weight;
    }
	}
class  cost  implements Comparator<Sweets>{
    public int compare(Sweets a, Sweets b){
        return a.cost  - b.cost;
    }
}
   
	
