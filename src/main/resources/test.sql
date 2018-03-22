select  	c.id, c.content, c.create_at, c.reply_weibo_id, c.reply_comment_id, 
			u.username as author_username, u.id as author_id
		from comment as c, weibo as w , user as u
		where c.reply_weibo_id = w.id and c.author_id = u.id and w.id = 2;
        
        
        