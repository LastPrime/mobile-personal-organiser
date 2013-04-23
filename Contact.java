/**
 * @author Kennet Ingram
 */

/**
 * This class is for creating and editing a contact, which is stored in the
 * contact list
 */
public class Contact {

	// Variables
	private String name;
	private String telNum;
	private String mobNum;
	private String address;
	private String email;

	/**
	 * Constructor
	 */
	public Contact() {

	}

	/**
	 * Constructor with parameters - Creates a new contact object with set
	 * parameters
	 */
	public Contact(String name, String telNum, String mobNum, String address,
			String email) {
		this.name = name;
		this.telNum = telNum;
		this.mobNum = mobNum;
		this.address = address;
		this.email = email;
	}

	/**
	 * Returns contact's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns contact's name
	 * 
	 * @param New
	 *            name for contact
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns contact's telephone number
	 */
	public String getTelNum() {
		return telNum;
	}

	/**
	 * Sets contact's telephone number
	 * 
	 * @param New
	 *            name for contact
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**
	 * Returns contact's mobile number
	 */
	public String getMobNum() {
		return mobNum;
	}

	/**
	 * Sets contact's mobile number
	 * 
	 * @param New
	 *            mobile number for contact
	 */
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	/**
	 * Returns contact's address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets contact's address
	 * 
	 * @param New
	 *            address for contact
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns contact's email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets contact's email
	 * 
	 * @param New
	 *            email for contact
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
