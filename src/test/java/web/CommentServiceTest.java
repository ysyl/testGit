package web;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.web.entity.Comment;
import com.web.entity.User;
import com.web.service.CommentService;
import com.web.service.UserService;


import static org.junit.Assert.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration( locations="classpath:config/spring/applicationContext.xml")
@Rollback
@Transactional

@WebAppConfiguration
public class CommentServiceTest extends AbstractTransactionalJUnit4SpringContextTests   {

	@Resource
	private UserService userService;
	
	private static Logger log = Logger.getLogger(CommentServiceTest.class);
	
	@Resource 
	private CommentService commentService;
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	//建立mockMvc，
	@BeforeAll
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	
	
	
	@Test
	public void testCommentService() {
		User zhou = userService.findUserById(1L);
		Comment comment = new Comment();
		comment.setContent("测试内容");
		comment.setCreateTime(new Date());
		comment.setUser(zhou);
		commentService.save(comment);

		Comment comment2 = new Comment();
		comment2.setContent("测试内容2");
		comment2.setCreateTime(new Date());
		comment2.setUser(zhou);
		commentService.save(comment2);
		
		
		List<Comment> comments = commentService.findComments(zhou.getId());
		
		
		Comment comment3 = commentService.findCommentById(1L);
		
	}
	
	@Test
	public void testRestController() throws Exception {
		String content = mockMvc.perform(MockMvcRequestBuilders.get("/web/comment/all"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse().getContentAsString();
		log.debug("返回的json ： " + content);
	}
}
