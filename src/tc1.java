import org.testng.annotations.Test;

public class tc1 {
  @Test
  public void f() throws InterruptedException {
	  //System.out.println("tc1");
	  for(int i=0;i<6;i++)
	  {
		  System.out.println("i value is "+" "+i);
		  Thread.sleep(3000);
	  }
  }
}
