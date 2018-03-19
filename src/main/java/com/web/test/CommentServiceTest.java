package com.web.test;



import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.entity.Comment;
import com.web.entity.User;
import com.web.service.CommentService;
import com.web.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations="classpath:config/spring/applicationContext.xml")
public class CommentServiceTest extends AbstractTransactionalJUnit4SpringContextTests   {

	@Resource
	private UserService userService;
	
	private static Logger log = Logger.getLogger(CommentServiceTest.class);
	
	@Resource 
	private CommentService commentService;
	
	@Test
	public void testCommentService() {
		Comment comment = new Comment();
		
	}
}
