package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Hello")
public class HelloService {
	
	
	@GET
	public String getHello() {
		return "Hello";
	}
	
}