/**
 * 
 */
package hello.controller;

import hello.bo.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author vachaspati.vempati
 *
 */
@RestController
public class StudentController {

	
	public StudentController() {
		// TODO Auto-generated constructor stub
		
	}

	@RequestMapping("/whatsInAName")
	public String doSomethingHere(@RequestParam(name="name",required=true) String stuName,
			@RequestParam(name="age",defaultValue="23") Integer stuAge,
			@RequestParam(name="gender",defaultValue="M") Character gender){
	
		ObjectMapper mapper = new ObjectMapper();
		
		
		try {
			return mapper.writeValueAsString(new Student(stuName,stuAge,gender,null));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
