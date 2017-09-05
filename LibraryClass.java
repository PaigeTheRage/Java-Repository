public class LibraryClass {

    public int libraryID;
    public String libraryName;
    public String libraryAddress;
    public String city;
    public String state;
	public int zipCode;
    public int branchID;
 
    public LibraryClass(int libraryID, String libraryName, String libraryAddress, 
			String city, String state, int zipCode, int branchID) {
    
    this.libraryID = libraryID;
    this.libraryName = libraryName;
    this.libraryAddress = libraryAddress;
    this.city = city;
    this.state = state;   
	this.zipCode = zipCode;
    this.branchID = branchID;

	 {
	//libraryID 50-60
	//branchID 700-704
}
}

	public int getLibraryID() {
		return libraryID;
	}

	public void setLibraryID(int libraryID) {
		this.libraryID = libraryID;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}

