import java.util.*;
class ListDriver
{
   public static void main(String[] args)
      {

		DoublyLinked s = new DoublyLinked();
		Scanner scan = new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("\n Doubly Linked List Operations");
			System.out.println("1. Insert at front");
			System.out.println("2. Insert at last ");
			System.out.println("3. Insert after");
			System.out.println("4. Delete at front");
			System.out.println("5. Delete at last");
			System.out.println("6. Delete at");
			System.out.println("7. display");
			System.out.println("8. is empty");
			System.out.println("9. no of nodes");
	
			int choice = scan.nextInt();
			switch(choice)
			 {
				case 1 : System.out.println("\nEnter the element : ");
					 double x = scan.nextDouble();
					 Link l1= new Link(x);
					 s.insertFirst(l1);
					 break;

				case 2 : System.out.println("\nEnter the element : ");
					 double w = scan.nextDouble();
					 Link l2 = new Link(w);
					 s.insertLast(l2);
					 break;

				case 3 : System.out.println("\nEnter the element to insert: ");
					 double y = scan.nextDouble();
					 Link l3= new Link(y);
					 s.insertAfter(l3);
                                       	 break;

				case 4 : Link d1 = s.removeFirst();
		  			 System.out.println(" \n deleted element "+ d1.getData());
                                       	 break;

 				case 5 : Link d2 = s.removeLast();
					 System.out.println(" \n deleted element "+ d2.getData());
					 break;

				case 6:  Link d3 = s.removeAt();
					 System.out.println(" deleted element "+ d3.getData());
					 break;

				case 7:  try {
						s.display();
					 }
					 catch(Exception z) 
						{ System.out.println(z.getMessage()); }
					 
					 break;

				case 8:  System.out.println(s.isEmpty());
					 break;
				
				case 9: System.out.println(s.count());
					 break;
				
				default : System.out.println("\nError choice");
		    }
		System.out.println("\nDo you wish to continue (type y or n) \n");
		ch = scan.next().charAt(0);
	   }while(ch=='Y'||ch=='y');
	


        }      
 }  // end class ListDriver
