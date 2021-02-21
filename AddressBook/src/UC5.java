import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UC5
{
	 Scanner sc = new Scanner(System.in);
	static ArrayList<Book> store = new ArrayList<Book>();
	int length = store.size();
	

	 static boolean exit = false;
	private Book b_update;
	private int indexof_store;
	private static Scanner sc2;

	 void add_new()
	 {

		System.out.println("enter the number of person you wnna to add");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
		{
			Book b1 = new Book();
			System.out.println("enter id");
			
			b1.setId(sc.nextInt());
			System.out.println("enter the first_name");
			//String fname=sc.next();
			b1.setFsname(sc.next());
			System.out.println("enter the last name");
			b1.setLname(sc.next());
			System.out.println("enter the city");
			b1.setCity(sc.next());
			System.out.println("enter the state");
			b1.setState(sc.next());
			System.out.println("enter the zip_code");
			b1.setZip_code(sc.next());
			System.out.println("enter the phone_no");
			b1.setPhone_no(sc.next());
			System.out.println("enter the email_id");
			b1.setEmail(sc.next());
			System.out.println("adding the records " + b1.toString());
			store.add(b1);
			
			System.out.println(store.toString());

			
		}
		

	}
		 void update() 
		{
			System.out.println("enter the input");
			String fname_fromuser=sc.next();
			Book b_update=null;
			int indexof_store=-1;
			for(int index=0; index<=store.size();)
			{   
				if(store.get(index).getFsname().equals(fname_fromuser))
				{
				b_update=store.get(index);
			    indexof_store=1;
			    break;
				}
				else
				{
				System.out.println("wrong data input ");	
				break;
				}

			}

			if(indexof_store==-1)
			{
				System.out.println("name in book not found");

			}

			else
			{
				System.out.println("give the contact details u wanna to change");

				System.out.println("1 for changing lname");
				System.out.println("2 for changing city");
				System.out.println("3 for  changing state");
				System.out.println("4 for changing zip code");
				System.out.println("5 for changing number");
				System.out.println("6 for changing email");
				int change=sc.nextInt();
				 switch(change)
				 {
				 case 1 :
					 System.out.println("enter the lname");
					 b_update.setLname(sc.next());
				     break;
				 case 2:
					 System.out.println("enter the city");
					 b_update.setCity(sc.next());
					 break;

				 case 3:
					 System.out.println("enter changing state");
					 b_update.setState(sc.next());
					 break;

				 case 4:
					 System.out.println("enter zip code");
					 b_update.setZip_code(sc.next());
					 break;

				 case 5:
					 System.out.println("enter for changing number");
					 b_update.setPhone_no(sc.next());
					 break;

				 case 6:
					 System.out.println("enter email");
					 b_update.setEmail(sc.next());
					 break;
				 }

			}

		}

		 void delete()

	        {
	        	System.out.println("enter the input");
	    		String fname_fromuser=sc.next();
	    		setB_update(null);
	    		setIndexof_store(-1);
	    		for(int index=0; index<=store.size();index++)
	    		{   
	    			if(store.get(index).getFsname().equals(fname_fromuser))
	    			{
	    			setB_update(store.remove(index));
	    		    setIndexof_store(1);
	    		    break;
	    			}
	            }
	        }

	 static void print()
	 {

		System.out.println(store.toString());

	}

	 static void end()
     {
         	System.out.println("thank you");
			exit=true;
     }

	 void streamCheck()
	  {
		  boolean b1=false;
		  
		  while(!b1) {
		  System.out.println("chose your suvey accordingly");
		  System.out.println("[1]  for checking through city");
		  System.out.println("[2]  for checking through state");
		  System.out.println("[3]  for checking through number");
         System.out.println("[4]  for checking through zipcode");
         System.out.println("[5]  for checking through entity");
         System.out.println("[6]  for exit");
         
		  int choice=sc.nextInt();
		  
		  switch(choice) 
		  {
		  case 1:
			  System.out.println("for checking by city name");
			  String checkout=sc.next();
			  
			List<Book> obj1= store.stream().filter(element -> element.getCity().equals(checkout)).collect(Collectors.toList());
			System.out.println(obj1);
			  break;
			  
		  case 2:
			  System.out.println("for checking by state name");
			  String checkout1=sc.next();			 
			  long count=store.stream().filter(element -> element.getState().equals(checkout1)).count();
			  System.out.println(count);
			  
			   List<Book> obj2= store.stream().filter(element -> element.getCity().
					              equals(checkout1)).collect(Collectors.toList());
			                      System.out.println(obj2);
			                      break;
			  
		  case 3:
			  System.out.println("for checking by phone number");
			  String checkout2=sc.next();
			  
			  long countno=store.stream().filter(element -> element.getPhone_no().equals(checkout2)).count();
			  System.out.println(countno);
			  
			   List<Book> obj3= store.stream().filter(element -> element.getPhone_no().
					             equals(checkout2)).collect(Collectors.toList());
			   					 System.out.println(obj3);
			   					 break;
			   					 
		  case 4:
			  System.out.println("For Checking by zip code");
			  
		      String checkout3=sc.next();
		       long countzip=store.stream().filter(element -> element.getZip_code().equals(checkout3)).count();
		       System.out.println(countzip);
		       List<Book> obj4= store.stream().filter(element -> element.getZip_code().
		    		            equals(checkout3)).collect(Collectors.toList());
		       					System.out.println(obj4);
		       					break;
			  
		  case 5:
			  System.out.println("Done");
				b1=true;  
		 }
	  }
		                                 
  }
	
	 
	 void sorting() 
	 {
	      List<Book> view4= store.stream().sorted(Comparator.comparing(Book :: getFsname)).collect(Collectors.toList());
          
          view4.forEach(System.out::println);
          
		 
	 }
	 
	public static void main(String[] args) 
	{

		while (!exit) 
		{
			sc2 = new Scanner(System.in);
			System.out.println("1.for adding contact");
			System.out.println("2.displaying");
			System.out.println("3.updating the addrss book");
			System.out.println("4.for data removal");
			System.out.println("5.for checking entity");
			System.out.println("6.for shorting the address book according to the name");
			System.out.println("7.For Exit");
			
			System.out.println("choose your option");
			int userin = sc2.nextInt();
			switch (userin) 
			{
			case 1:
				new UC5().add_new();
				break;

			case 2:
				print();
				break;

			case 3:
				new UC5().update();
				break;

			case 4:
				new UC5().delete();
				break;
				
			case 5:
				new UC5().streamCheck();
				break;
			
			case 6: 
				new UC5().sorting();
				break;
				
			case 7:
				end();
				break;
			}

			
		}
	
	}
	public Book getB_update() {
		return b_update;
	}
	public void setB_update(Book b_update) {
		this.b_update = b_update;
	}
	public int getIndexof_store() {
		return indexof_store;
	}
	public void setIndexof_store(int indexof_store) {
		this.indexof_store = indexof_store;
	}

}