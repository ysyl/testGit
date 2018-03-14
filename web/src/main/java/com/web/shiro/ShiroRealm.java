package com.web.shiro;
  
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;  
import org.apache.shiro.authc.AuthenticationInfo;  
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.util.ByteSource;

import com.web.entity.testUser;

public class ShiroRealm extends AuthenticatingRealm{

	private static Map<String,testUser> userMap = new HashMap<String,testUser>();  
		    static{  
		    	 //使用Map模拟数据库获取User表信息   
		        userMap.put("jack", new testUser("jack","43e66616f8730a08e4bf1663301327b1",false));  
		        userMap.put("tom", new testUser("tom","3abee8ced79e15b9b7ddd43b95f02f95",false));  
		        userMap.put("jean", new testUser("jean","1a287acb0d87baded1e79f4b4c0d4f3e",true)); 
 
		    } 

	@Override
	 protected AuthenticationInfo doGetAuthenticationInfo(  
			 	        AuthenticationToken token) throws AuthenticationException {
 
						//1.把AuthenticationToken转换为UsernamePasswordToken  	
			 	        UsernamePasswordToken userToken = (UsernamePasswordToken) token;  
			 	          
			 	        // //2.从UsernamePasswordToken中获取username 
			 	        String username = userToken.getUsername();  
			 	          
			 	        //3.调用数据库的方法，从数据库中查询Username对应的用户记录  
			 	        System.out.println("从数据看中获取UserName为"+username+"所对应的信息。");  
			 	        //Map模拟数据库取数据  
			 	        testUser u = userMap.get(username);  
			 	          
			 	        //4..若用户不行存在，可以抛出UnknownAccountException  
			 	        if(u==null){  
			 	        	throw new UnknownAccountException("用户不存在");  
			 	        }  
			 	          
			 	        //5.若用户被锁定，可以抛出LockedAccountException 
			 	        if(u.isLocked()){  
			 	        	 throw new LockedAccountException("用户被锁定");  
			 	        }  
			 	          
			 	     //6.根据用户的情况，来构建AuthenticationInfo对象,通常使用的实现类为SimpleAuthenticationInfo  
			 	       	   //以下信息是从数据库中获取的  
			 	       	   //1)principal：认证的实体信息，可以是username，也可以是数据库表对应的用户的实体对象  

			 	        Object principal = u.getUsername();  
			 	        //2)credentials：密码   
			 	        Object credentials = u.getPassword();  
			 	        //3)realmName：当前realm对象的name，调用父类的getName()方法即
			 	        String realmName = getName();  
			 	       // SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal,credentials,realmName);  
			 	       ByteSource credentialsSalt = ByteSource.Util.bytes(principal);//使用账号作为盐值   
			 	       SimpleAuthenticationInfo info = null; //new SimpleAuthenticationInfo(principal,credentials,realmName);  
			 	       info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
			 	        return info;  

		 }
} 