
public class CustomerClass {
	
	public int customerID;
	public String lastName;
	public String firstName;
	public String emailAddress;
	public String birthDate;
    public String address;
    public String city;
    public String state;
    public int zip;
    public String membershipExpDate;
    public String enrollmentDate;
    public int homeLibraryID;
                          
    public CustomerClass(int customerID, String lastName, String firstName, String emailAddress, 
            			String birthDate, String address, String city,
            			String state, int zip, String membershipExpDate, 
            			String enrollmentDate, int homeLibraryID)
    {
		this.customerID = customerID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.birthDate = birthDate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.membershipExpDate = membershipExpDate;
        this.enrollmentDate = enrollmentDate;
        this.homeLibraryID = homeLibraryID;
    }

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getMembershipExpDate() {
		return membershipExpDate;
	}

	public void setMembershipExpDate(String membershipExpDate) {
		this.membershipExpDate = membershipExpDate;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public int getHomeLibraryID() {
		return homeLibraryID;
	}

	public void setHomeLibraryID(int homeLibraryID) {
		this.homeLibraryID = homeLibraryID;
	}
}
