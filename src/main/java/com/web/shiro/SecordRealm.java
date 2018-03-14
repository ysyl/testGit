package com.web.shiro;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.Iterator;  
import java.util.Map;  
import java.util.Set;  
import org.apache.shiro.authc.AuthenticationException;  
import org.apache.shiro.authc.AuthenticationInfo;  
import org.apache.shiro.authc.AuthenticationToken;  
import org.apache.shiro.authc.LockedAccountException;  
import org.apache.shiro.authc.SimpleAuthenticationInfo;  
import org.apache.shiro.authc.UnknownAccountException;  
import org.apache.shiro.authc.UsernamePasswordToken;  
import org.apache.shiro.crypto.hash.SimpleHash;  
import org.apache.shiro.realm.AuthenticatingRealm;  
import org.apache.shiro.util.ByteSource;

import com.web.entity.testUser;  
  
public class SecordRealm extends AuthenticatingRealm{  
      
    private static Map<String,testUser> userMap = new HashMap<String,testUser>();  
    static{  
        //使用Map模拟数据库获取User表信息  
        userMap.put("jack2", new testUser("jack2","837b21a5a86ed8df842a4c2114a8b9f7d7c6d02d",false));//密码明文：aaa123  
        userMap.put("tom2", new testUser("tom2","ca578a1c0498fb93b7b0f06e30b2eecd155930db",false));//密码明文：bbb321  
        userMap.put("jean2", new testUser("jean2","d523305baa947918891aaa578d7b195d3122d8d0",true));//密码明文：ccc213  
        userMap.put("admin", new testUser("admin","463c6a4b033daaee524da5cb3a5562a5f3feeaa7",false));//密码明文：aabbcc
    }  
  
  
    @Override  
    protected AuthenticationInfo doGetAuthenticationInfo(  
            AuthenticationToken token) throws AuthenticationException {  
    	System.out.println("[SecordRealm]"); 
        //1.把AuthenticationToken转换为UsernamePasswordToken  
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;  
          
        //2.从UsernamePasswordToken中获取username  
        String username = userToken.getUsername();  
          
        //3.调用数据库的方法，从数据库中查询Username对应的用户记录  
        System.out.println("从数据看中获取UserName为"+username+"所对应的信息。");  
        //Map模拟数据库取数据  
        testUser u = userMap.get(username);  
          
        //4.若用户不行存在，可以抛出UnknownAccountException  
        if(u==null){  
            throw new UnknownAccountException("用户不存在");  
        }  
          
        //5.若用户被锁定，可以抛出LockedAccountException  
        if(u.isLocked()){  
            throw new LockedAccountException("用户被锁定");  
        }  
          
        //7.根据用户的情况，来构建AuthenticationInfo对象,通常使用的实现类为SimpleAuthenticationInfo  
        //以下信息是从数据库中获取的  
        //1)principal：认证的实体信息，可以是username，也可以是数据库表对应的用户的实体对象  
        Object principal = u.getUsername();  
        //2)credentials：密码  
        Object credentials = u.getPassword();  
        //3)realmName：当前realm对象的name，调用父类的getName()方法即可  
        String realmName = getName();  
        //4)credentialsSalt盐值  
        ByteSource credentialsSalt = ByteSource.Util.bytes(principal);//使用账号作为盐值  
          
       // SimpleAuthenticationInfo info = null;   
        //info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);  
        SimpleAuthenticationInfo info = null; 
        info = new SimpleAuthenticationInfo("SecondRealmName", credentials, credentialsSalt, realmName);

        return info;  
    }  
}  
