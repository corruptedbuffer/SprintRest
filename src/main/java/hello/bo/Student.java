/**
 * 
 */
package hello.bo;

import java.util.List;

/**
 * @author vachaspati.vempati
 *
 */
public class Student extends Person {

	String name;
	Integer age;
	Character gender;
	List<Person> friends;
	String comments;

	public Student() {
	}

	public Student(String name, Integer age, Character gender, String comments) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.comments = comments;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public final Integer getAge() {
		return age;
	}

	/**
	 * @return the gender
	 */
	public final Character getGender() {
		return gender;
	}

	/**
	 * @return the friends
	 */
	public final List<Person> getFriends() {
		return friends;
	}

	/**
	 * @return the comments
	 */
	public final String getComments() {
		return comments;
	}

	

}
