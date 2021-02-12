import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UC2 {




	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Map<Integer,Book> store=new Hashtable<Integer,Book>();
		Book b11=new Book(1, "anvay", "kadam", "thane", "mh", "400610", "9869122512", "demo@gmail.com");
		System.out.println("enter the details");
		Book b12=new Book(2,sc.next(),sc.next(),sc.next(),sc.next(),"sc.next()",sc.next(),sc.next());
        store.put(1, b11);
        System.out.println("enter the details");

        store.put(2,b12 );
        for(Map.Entry<Integer, Book> e1:store.entrySet())
        {
        	int key=e1.getKey();
        	Book b=e1.getValue();
        	System.out.println(key+ " contact details are:");
        	System.out.println(b.id+ " " +b.fsname+ " " +b.lname+ " " +b.city+ " " +b.state+ " " +b.zip_code+ " " +b.phone_no+ " " +b.email+ " " );
        }


	}

}