package sec01.exam05;

import java.util.HashSet;
import java.util.Iterator;

class User {
	String ssn; // ¡÷πŒπ¯»£
	String name; // ¿Ã∏ß

	User(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return ssn + ":" + name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(ssn);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		User u = (User) obj;
		if (this.ssn.equals(u.ssn))
			result = true;
		return result;
	}
}

public class HashSetExample2 {
	public static void main(String[] args) {
		User u1 = new User("901011", "º’»ÔπŒ");
		User u2 = new User("901011", "º’»ÔπŒ");

		HashSet<User> users = new HashSet<User>();

		users.add(u1);
		users.add(u2);

		Iterator<User> iter = users.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}
