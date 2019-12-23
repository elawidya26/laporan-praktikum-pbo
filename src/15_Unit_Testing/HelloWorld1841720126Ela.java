package unittest;

/**
 *
 * @author arie
 */
public class HelloWorld1841720126Ela {
     private String hello; 

  private String world;         

  public HelloWorld1841720126Ela(){  
    hello = "Hello";  
    world = "World"; 
  } 

  public String formMessage(){ 

    String message;  

    message = hello + " " +  world;  

    return message; 

  } 

  public static void main(String[] args) {  

    HelloWorld1841720126Ela helloWorld = new HelloWorld1841720126Ela();  

    System.out.println(helloWorld.formMessage()); 

  } 
}
