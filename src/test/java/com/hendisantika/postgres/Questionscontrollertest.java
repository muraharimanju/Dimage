package com.hendisantika.postgres;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.hendisantika.postgres.controller.QuestionController;
import com.hendisantika.postgres.entity.Question;
import com.hendisantika.postgres.repository.QuestionRepository;

@WebMvcTest (value=  QuestionController.class)
public class Questionscontrollertest {

	
	
	@MockBean
	
	private QuestionRepository questionRepository;
	
	@Test
	public void testgetquestion() {
	
		Question question= new Question(131l,"java","it is a programing langaugae");
		when(questionRepository.save(question)).thenReturn(question);
		assertEquals(question,QuestionController.class.getDeclaredFields());
		
		
	}
	
}
