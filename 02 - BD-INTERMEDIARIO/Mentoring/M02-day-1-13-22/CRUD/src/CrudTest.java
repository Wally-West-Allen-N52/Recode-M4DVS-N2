import java.sql.Date;


import ca.com.crud.dao.ContactDao;
import ca.com.crud.model.Contact;

public class CrudTest {

	public static void main(String[] args) {
		// Instantiate the "ContactDao Class"
		ContactDao contactDao = new ContactDao();
		
		// Create a new contact and save it in database
		Contact contact = new Contact();
		contact.setContactName("Renan Tarrini Aljamil"); // First attribute
		contact.setAge(21); // Second attribute
		contact.setRegistrationDate(new Date(0)); // third attribute
		
		contactDao.save(contact); // Use the method "save" to save in the SQL database
	}

}
