package com.mkt.mytest.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


/*@Component
public class RestAuthenticationSuccessHandler 
extends SimpleUrlAuthenticationSuccessHandler {
 
   
   
    @Autowired
    UserService userService;
 

@Override
 public void onAuthenticationSuccess(HttpServletRequest request, 
  HttpServletResponse response, Authentication authentication)
 throws ServletException, IOException {
  UserDto user = userService.findByLogin(authentication.getName());
  SecurityUtils.sendResponse(response, HttpServletResponse.SC_OK, user);
 }
}*/
