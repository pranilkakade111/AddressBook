import java.util.ArrayList;
import java.util.Scanner;

public class UC3
{
	static Scanner sc= new Scanner(System.in);
	  static ArrayList<Book> store = new ArrayList<Book>();
			int length = store.size();
			static boolean exit=false;

	static void add_new() {

		Book b1=new Book();
		System.out.println("enter id");
		b1.setId(sc.nextInt());
		System.out.println("enter the first_name");
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
		System.out.println("adding the records " +b1.toString());
		store.add(b1);


	}

	static void print()
	{
		System.out.println(store.toString());

	}

	static void update() 
	{
		System.out.println();
		String fname_fromuser=sc.next();
		Book b_update=null;
		int indexof_store=-1;
		for(int index=0; index<=store.size();index++)
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
				 System.out.println("enter changing zip code");
				 b_update.setZip_code(sc.next());
				 break;

			 case 4:
				 System.out.println("enter changing number");
				 b_update.setPhone_no(sc.next());
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
               static void end()
               {
            	System.out.println("thank you");
   				exit=true;

               }
	public static void main(String[] args) 
	{
		while(!exit)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("1. for adding contact");
			System.out.println("2.displaying");
			System.out.println("3.updating the addrss book");
			System.out.println("4.For Exit");
			System.out.println("choose your option");
			int userin=sc.nextInt();
			switch(userin) {
			case 1:
				add_new();
				break;

			case 2:
				print();
				break;

			case 3:
				update();
				break;

			case 4:
				end();

			}
		}		
	}

}