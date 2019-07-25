import org.testng.annotations.Test;

public class tc2 {
  @Test
  public void f() throws InterruptedException {
	  //System.out.println("tc2");
	  for(int j=6;j<10;j++)
	  {
		  System.out.println("j value is "+" "+j); 
		  Thread.sleep(3000);
	  }
  }
}
