/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/HelloWorldService") 
@ApplicationPath("rest")
public class HelloService extends Application {

   @GET 
   @Path("/hello") 
   @Produces(MediaType.TEXT_PLAIN) 
   public String getHelloWorld(){ 
      return "Hello World, brought to you by HelloWorldService"; 
   } 

    
}
