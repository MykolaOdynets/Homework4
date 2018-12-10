package Lits.HomeworkJSON;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.*;




public class App 
{
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create(); 
    public static void main( String[] args )
    {
    	//переведення в J-SON формат
    	Person person = new Person("Vasya", 30, Arrays.asList("Kiiv","Lviv","Stryj")); // створення екземпляру класу
    	String json =  GSON.toJson(person);
        System.out.println( json );
        System.out.println();
        
        //переведення з J-SON формату
        
        Person person1 = GSON.fromJson(json, Person.class);
        System.out.println( person1.name );
        System.out.println( person1.age);
        System.out.println( person1.geolocatory);
        
        
        
        
    }
}
class Person{  //створення класу Person
	String name;
	Integer age;
	List<String> geolocatory = new ArrayList<String>();
	
	public Person (String name, Integer age, List<String> geolocatory) 	{ //створення конструктора Person
		this.name = name;
		this.age = age;
		this.geolocatory = geolocatory;
	}
	
	
}