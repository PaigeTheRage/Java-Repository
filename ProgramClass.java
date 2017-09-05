import java.awt.List;
import java.awt.print.Book;
import java.util.ArrayList;

public class ProgramClass{
	
	public static ArrayList<BookClass> books = new ArrayList<>();
	// public List<Book> books = new List<Book>();
	
	public static void Main(String[] args){
		  loadData();
		  
		  BookClass b1 = new BookClass("Aldous Huxley", 123, "Brave New World", 300, 01, 0, 50);
          BookClass b2 = new BookClass("Gary Paulsen", 234, "Hatchet", 250, 04, 0004, 50);
          BookClass b3 = new BookClass("William Faulkner", 345, "The Sound and the Fury", 350, 03, 0, 51);
          BookClass b4 = new BookClass("F. Scott Fitzgerald", 456, "The Great Gatsby", 425, 05, 0, 51);
          BookClass b5 = new BookClass("Niccolo Machiavelli", 567, "The Prince", 400, 01, 0006, 52);
          BookClass b6 = new BookClass("Kurt Vonnegut", 678, "Slaughterhouse Five", 300, 02, 0004, 52);
          BookClass b7 = new BookClass("George Orwell", 789, "1984", 315, 02, 0007, 53);
          BookClass b8 = new BookClass("Plato", 890, "The Republic", 550, 01, 0005, 53);
          BookClass b9 = new BookClass("Fyodor Dostoevsky", 135, "Brothers Karamazov", 600, 04, 0007, 54);
          BookClass b10 = new BookClass("J.D. Salinger", 246, "The Catcher in the Rye", 765, 02, 0, 54);
      	         

                        books.add(b1);
                        books.add(b2);
                        books.add(b3);
                        books.add(b4);
                        books.add(b5);
                        books.add(b6);
                        books.add(b7);
                        books.add(b8);
                        books.add(b9);
                        books.add(b10);
                       			
                        //Branches
            			
              ArrayList<BranchClass> branches = new ArrayList<BranchClass>();
            			
            			BranchClass r1 = new BranchClass (51, "North Branch");
                        BranchClass r2 = new BranchClass (52, "East Branch");
                        BranchClass r3 = new BranchClass(53, "West Branch");
            			BranchClass r4 = new BranchClass(54, "South Branch");
         
                        branches.add(r1);
                        branches.add(r2);
                        branches.add(r3);
            			branches.add(r4);
            			
                        //Customers

                        ArrayList<CustomerClass> customers = new ArrayList<CustomerClass>();
  
                        CustomerClass  c1 = new CustomerClass(0000, "Stackhouse", "Sookie", "sookie@gmail.com", "01-01-1990", "123 Capital Street", "Springfield", "IL", 60000, "01/01/2020", "01/01/2016", 50);
                        CustomerClass  c2 = new CustomerClass(0001, "Stackhouse", "Jason", "stack@gmail.com", "01-01-1990", "135 Capital Street", "Springfield", "IL", 60000, "04/01/2020", "01-01-1990", 51);
                        CustomerClass  c3 = new CustomerClass(0002, "Compton", "Bill", "compton@gmail.com", "01-01-1990", "400 North State Drive", "Springfield", "IL", 60000, "03/01/2019", "01-01-1990", 52);
                        CustomerClass  c4 = new CustomerClass(0003, "Northman", "Eric", "erc@gmail.com", "01-01-1990", "50 Main Street", "Capital City", "IL", 62000, "01/01/2020", "01-01-1990", 53);
                        CustomerClass  c5 = new CustomerClass(0004, "Bellfleur", "Arlene", "arlene@gmail.com", "01-01-1990", "250 Cross Town Lane", "Washington", "IL", 63500, "09/01/2020", "01-01-1990", 54);
                        CustomerClass  c6 = new CustomerClass(0005, "Hamby", "Jessica", "hamby@gmail.com", "01-01-1990", "50 Main Street", "Capital City", "IL", 62000, "10/01/2019", "01-01-1990", 55);
                        CustomerClass  c7 = new CustomerClass(0006, "Bellfleur", "Andy", "bell@gmail.com", "01-01-1990", "250 Cross Town Lane", "Washington", "IL", 63500, "04/01/2019", "01-01-1990", 56);
                        CustomerClass  c8 = new CustomerClass (0007, "Thornton", "Tara", "tara@gmail.com", "01-01-1990", "30 Miserable Drive", "Capital City", "IL", 62000, "08/01/2019", "01-01-1990", 57);
                    	
                        customers.add(c1);
                        customers.add(c2);
                        customers.add(c3);
                        customers.add(c4);
                        customers.add(c5);
                        customers.add(c6);
                        customers.add(c7);
                        customers.add(c8);
            			
            			//LIBRARIES
            			
            			ArrayList<LibraryClass> libraries = new ArrayList<LibraryClass>();
            			{

            			
            			LibraryClass L1 = new LibraryClass(50, "Midtown", "10 Main Street", "Chicago", "IL", 60000, 700);
                        LibraryClass L2 = new LibraryClass(51, "Uptown", "100 State Street", "Chicago", "IL", 61000, 701);
                        LibraryClass L3 = new LibraryClass(52, "Downtown", "1 Cross Street", "Chicago", "IL", 92000, 702);
            			LibraryClass L4 = new LibraryClass(53, "Southtown", "53 Shack Street", "Chicago", "IL", 53538, 703);
            			}

                    }

        			private static void loadData() {
		// TODO Auto-generated method stub
		
	}

					public static int countBook;{
            			
            			int countB = books.size();

            			for (int i = 0; i < books.size(); i++){
   
            			return countB;
            			
            		
            			
            
            			
            		