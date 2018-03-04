package web;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

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
		
		log.debug(comment3.getUser().getUsername());
	}
}
