package Utils;

import com.github.javafaker.Faker;
import com.github.javafaker.*;

import java.util.Locale;

import org.apache.commons.lang3.*;

public class UserInfo {
	
	Faker faker = new Faker();
	
	public String getUserFullName() {
		String name = faker.name().fullName();
		return name;
	}
	
	public String getUserFirstName() {
		String name = faker.name().firstName();
		return name;
	}
	
	public String getUserLastName() {
		String name = faker.name().lastName();
		return name;
	}
	
	public String getUserAddress() {
		String name = faker.address().streetAddress();
		return name;
	}
	
	
	public String getUserEmail() {
		String name = faker.internet().emailAddress();
		return name;
	}
	
	public String getUserPassword() {
		String name = faker.internet().password();
		return name;
	}
	
}
