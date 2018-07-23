package hhspack;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class seletest { 
	private static WebDriver driver;
	String Title=null;
	String URL=null;
	String alertText="";
	int responseCode=0;
	@Before
	public void beforeurl()throws Exception{
		URI uri = new URI(driver.getCurrentUrl());
		URL obj = new URL(driver.getCurrentUrl());
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		con.setRequestMethod("POST");
		responseCode = con.getResponseCode();
		System.out.println("���� �ڵ� "+responseCode);
		String domain =uri.getAuthority()+uri.getPath();
		System.out.println("Before"+domain);
		
	}
	
	@BeforeClass
	public static void setup() throws Exception{
		System.setProperty("webdrivet.chrome.driver", "C:\\chromedriver.exe");//ũ�� ����̹� ���� ��μ���
	 driver =new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); // ����ð� 1�ʼ���
	 driver.get("http://211.42.204.5:8088/WebProject/main/Main.html"); //������ ����Ʈ
	}
	@Test
	public void login_test() throws Exception{
		System.out.println("�α���");
		driver.findElement(By.xpath("/html/body/div[1]/div/a[2]")).click(); //���θ޴� �α��� ��ư
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input")).sendKeys("tes");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td/a[1]")).click(); //�α��������� �α��� ��ư
		Alert alert = driver.switchTo().alert();// �˾�â ó��
		alert.accept();
	}
	/*@Test
	public void write_borard_test() throws Exception{
		System.out.println("�Խ���");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[14]/td/a[3]")).click();//�Խ��� �۾��� ��ư 
	}
	
	@Test
	public void write_board_test() throws Exception{
		driver.findElement(By.name("BOARD_SUBJECT")).sendKeys("�����Ͽ� �׽�Ʈ");
		driver.findElement(By.name("BOARD_CONTENT")).sendKeys("<script>\n");
		driver.findElement(By.name("BOARD_CONTENT")).sendKeys("alert(\"�����Ͽ��׽�Ʈ!\")");
		driver.findElement(By.name("BOARD_CONTENT")).sendKeys("</script>");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[8]/td/a[1]")).click();//�Խ��� ���
	}
	@Test
	public void board_out()throws Exception{
		
	}*/
} 
