
import java.util.*;
import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EmpAddMain {

public static void main(String [] args) throws Exception{

	
	EmpAddBean [] empAddr = new EmpAddBean[100];
 int i=0;
 String line = null;
BufferedReader reader = new BufferedReader(new FileReader("EmpAddress.csv"));
PrintWriter out = new PrintWriter(new FileWriter("MyEmployees.txt", true));

StringBuilder sb = new StringBuilder();
while ((line=reader.readLine())!=null ){
		StringTokenizer st= new StringTokenizer(line,",");
			while(st.hasMoreTokens()){
				String firstName = st.nextToken();
				String lastName = st.nextToken();
				String userName = st.nextToken();
				String title = st.nextToken();
				String emailAddress = st.nextToken();
				String houseNumber = st.nextToken();
				String street = st.nextToken();
				String city = st.nextToken();
				String state = st.nextToken();
				String country = st.nextToken();
				EmpAddBean e= new EmpAddBean();
				e.setFirstName(firstName);
				e.setLastName(lastName);
				e.setUserName(userName);
				e.setTitle(title);
				e.setEmailAddress(emailAddress);
				e.setHouseNumber(houseNumber);
				e.setStreet(street);
				e.setCity(city);
				e.setState(state);
				e.setCountry(country);
				empAddr[i++] = e;
				System.out.println(e.toString());
				sb.append(e.toString()+"\n");
			}
			out.println(sb.toString());
			out.flush();
			out.close();
			
			
			

	}

}

}