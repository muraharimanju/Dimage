package com.hendisantika.postgres;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.hendisantika.postgres.controller.QuestionController;
import com.hendisantika.postgres.entity.Question;
import com.hendisantika.postgres.repository.QuestionRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@MockBean
	private QuestionRepository questionrepo;

	
	
	@Test
	public void createusertest() {
		
		Question question= new Question(111l, "java", "it is a programing langauge");
		when(questionrepo.save(question)).thenReturn(question);
		assertEquals(question,question);
		
	}
}
