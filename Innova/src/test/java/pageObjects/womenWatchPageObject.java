package pageObjects;


import org.openqa.selenium.By;

public class womenWatchPageObject {

  public static By guess = By.xpath("//li[@title = 'Guess']");
  public static By secondPage = By.xpath("//*[@id=\"pagination\"]/ul/li[2]/a");
  public static By productName = By.xpath("//p[@class = 'hb-pl-cn']");
  public static By productBox = By.className("carousel-lazy-item");

}


