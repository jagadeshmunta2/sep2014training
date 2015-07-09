public class EmpAddBean
{
	private String firstName = null;
	private String lastName = null;
	private String userName = null;
	private String title = null;
	private String emailAddress = null;
	private String houseNumber = null;
	private String street = null;
	private String city = null;
	private String state = null;
	private String country = null;

	/**
	 *@return the firstName
	 */
	public String getFirstName(){
		return firstName;
	}
	/**
	 *@param firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 *@return the lastName
	 */
	public String getLastName(){
		return lastName;
	}
	/**
	 *@param lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	/**
	 *@return the username
	 */
	public String getUserName(){
		return userName;
	}
	/**
	 *@param userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	/**
	 *@return the title
	 */
	public String getTitle(){
		return title;
	}
	/**
	 *@param title to set
	 */
	public void setTitle(String title)
	{
		this.title=title;
	}
	/**
	 *@return the emailAddress
	 */
	public String getEmailAddress(){
		return emailAddress;
	}
	/**
	 *@param emailAddress to set
	 */
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress=emailAddress;
	}
	/**
	 *@return the houseNumber
	 */
	public String getHouseNumber(){
		return houseNumber;
	}
	/**
	 *@param houseNumbers to set
	 */
	public void setHouseNumber(String houseNumber)
	{
		this.houseNumber=houseNumber;
	}
	/**
	 *@return the street
	 */
	public String getStreet(){
		return street;
	}
	/**
	 *@param street to set
	 */
	public void setStreet(String street)
	{
		this.street=street;
	}
	/**
	 *@return the city
	 */
	public String getCity(){
		return city;
	}
	/**
	 *@param city to set
	 */
	public void setCity(String city)
	{
		this.city=city;
	}
	/**
	 *@return the state
	 */
	public String getState(){
		return state;
	}
	/**
	 *@param state to set
	 */
	public void setState(String state)
	{
		this.state=state;
	}
	/**
	 *@return the country
	 */
	public String getCountry(){
		return country;
	}
	/**
	 *@param country to set
	 */
	public void setCountry(String country)
	{
		this.country=country;
	}

	/*@Override
public String hashCode()
{
return firstName;
}*/


	@Override
	public String toString()
	{
		return new StringBuilder()
		.append("--------------------------------------------\n")
		.append(firstName).append(lastName).append("(").append(userName).append(")\n")
		.append(title).append("\n")
		.append(emailAddress).append("\n")
		.append(houseNumber).append("  ").append(street).append(",").append(city).append(",").append(state).append(",").append(country).append("\n")
		.append("---------------------------------------------\n")
		.toString();

	}
}

