package hhspack;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selll {
	private static WebDriver driver;
	private static String URL = "http://www.douzone.com/";
	private static String Title = null;
	
	
	//�ʱ� ���� 
	public static void setup() throws Exception {
		String driverpath="src/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);// ũ�� ����̹� ��μ���
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");//ũ��â ���μ������·� ����
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // ������â �ִ�ȭ
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); // ����ð� 1�ʼ���
		driver.get(URL); // ������ ����Ʈ
		Title = driver.getTitle();
//		http://211.42.204.62:8088/WebProject/main/Main.html
	}
	//XPATH �ּ� ����
	private String generateXPATH(WebElement childElement, String current) {
		String childTag = childElement.getTagName();
		if (childTag.equals("html")) {
			return "/html[1]" + current;
		}	
		WebElement parentElement = childElement.findElement(By.xpath(".."));
		List<WebElement> childrenElements = parentElement.findElements(By.xpath("*"));
		int count = 0;
		for (int i = 0; i < childrenElements.size(); i++) {
			WebElement childrenElement = childrenElements.get(i);
			String childrenElementTag = childrenElement.getTagName();
			if (childTag.equals(childrenElementTag)) {
				count++;
			}
			if (childElement.equals(childrenElement)) {
				return generateXPATH(parentElement, "/" + childTag + "[" + count + "]" + current);
			}
		}
		return null;
	}
	
	
	//��� A�±� �������� 
	public String[] getATage() throws Exception{
		setup();
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;
		for (WebElement e : linkElements) { //linkElements ��  a�±� ���� WebElemnet e�� ���� �ȴ�.
			if(!e.getText().trim().equals("")&e.getText()!=null){
				linkTexts[i] = e.getText(); // linkElements a�±� ���� Text ���� linkTexts�� �ִ´�.
				System.out.println(linkTexts[i].toString());
				i++;
			}
		}
		return linkTexts;
	}
	//input="Text" ���԰���
	public void inputText() throws Exception{
		WebElement inputText =driver.findElement(By.xpath("//input[@type='text']"));
			inputText.sendKeys("�׽�Ʈ");
	}
	//A�±� SCAN
	public void AtagScan(String[] linkTexts) throws Exception{
		ArrayList<List<WebElement>> linkList = new ArrayList<List<WebElement>>();
		for (String t : linkTexts) { 
				try{
					driver.findElement(By.linkText(t)).click();
					linkList.add(driver.findElements(By.tagName("a")));
				}catch(org.openqa.selenium.UnhandledAlertException|
						org.openqa.selenium.NoSuchElementException |org.openqa.selenium.NoAlertPresentException e){
					driver.switchTo().alert().accept();
					System.out.println("�˸�â Ȯ�οϷ�");
				}catch(org.openqa.selenium.ElementNotVisibleException e){
					driver.navigate().refresh();
				}catch(IllegalArgumentException	 e){
					HashSet<List<WebElement>> hs = new HashSet<List<WebElement>>(linkList);
					linkList =new ArrayList<List<WebElement>>(hs);
					System.out.println("������"+linkList.size());
				}
		}
	}
	public static void main(String[] args) throws Exception {
		selll start = new selll();
		String[] linkTexts=start.getATage();
		start.AtagScan(linkTexts);
	}
}
