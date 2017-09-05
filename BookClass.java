
public class BookClass {
	//description of the book class, fields, constructors, getters and setters, access point to the book class information
    //used to update values after the object is created
    public String author;
    public int isbn;
    //International Standard Book Number
    public String title;
    public int numberOfPages;
    public int aisleNumber;
    public int checkedStatus;
    public int libraryID;
    //if Checked Out the Customer Id will be displayed
    //if not checked out a 0 will be displayed, 
    //see aisleNum for location

    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getAisleNumber() {
		return aisleNumber;
	}

	public void setAisleNumber(int aisleNumber) {
		this.aisleNumber = aisleNumber;
	}

	public int getCheckedStatus() {
		return checkedStatus;
	}

	public void setCheckedStatus(int checkedStatus) {
		this.checkedStatus = checkedStatus;
	}

	public int getLibraryID() {
		return libraryID;
	}

	public void setLibraryID(int libraryID) {
		this.libraryID = libraryID;
	}

	//Constructors - initialize all the values at the time of creation
    public BookClass(String author, int isbn, String title, int numberOfPages, 
			int aisleNumber, int checkedStatus, int libraryID)
    {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.aisleNumber = aisleNumber;
        this.checkedStatus = checkedStatus;
    }
}

    