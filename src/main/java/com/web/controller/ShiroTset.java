package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.service.shiroService;

@Controller
@RequestMapping("userAuth")
public class ShiroTset {
	
    @Autowired  
    private shiroService ShiroService;

    @RequiresRoles({"admin"}) 
    @RequestMapping("/testShiroAnnocation")  
    private String testShiroAnnocation(){  
    	ShiroService.testMethod();  
        return "redirect:/list.jsp";  
    }  

	
	@RequestMapping("login")
	public String test1(String username , String password){
		 Subject currentUser = SecurityUtils.getSubject();
		 System.out.println("testname:"+username);
		 if (!currentUser.isAuthenticated()) {
	            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
	            token.setRememberMe(true);
	            try {
	                currentUser.login(token);
	            } catch (UnknownAccountException uae) {
	                System.out.println("There is no user with username of " + token.getPrincipal());
	            } catch (IncorrectCredentialsException ice) {
	                System.out.println("Password for account " + token.getPrincipal() + " was incorrect!");
	            } catch (LockedAccountException lae) {
	                System.out.println("The account for username " + token.getPrincipal() + " is locked.  " +
	                        "Please contact your administrator to unlock it.");
	            }
	            catch (AuthenticationException ae) {
	                System.out.println("登录失败！！！"+ae.getMessage());
	            }
	        }
		 else {
			 
		 }
		return "redirect:/list.jsp";
	} 
	
}