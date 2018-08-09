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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptseleniumTest3 {
	private static WebDriver driver;
	private static String URL = "http://14.36.28.181/kitri/main/main.web";
	private static String Title = null;

	// �ʱ� ����
	public static void setup() throws Exception {
		String driverpath = "src/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);// ũ�� ����̹�
																	// ��μ���
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");// ũ��â ���μ������·� ����
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); // ����ð�
																		// 1�ʼ���
		driver.get(URL); // ������ ����Ʈ
		Title = driver.getTitle();
		// http://211.42.204.62:8088/WebProject/main/Main.html
	}

	// ��� A�±� ��������
	public void getAllAtag() throws Exception {
		ArrayList<String> AtagList= new ArrayList<String>();
		List<WebElement> e =driver.findElements(By.tagName("a"));
		int i=0;
		for(WebElement Atag :e){
			AtagList.add(Atag.getAttribute("href"));
		}
		for(String d:AtagList){
			//A�±��� href�� # / null �� �����ʹ� ���� 
			try{
			if(!AtagList.get(i).contains("#")|AtagList.get(i)!=null){
				AtagList.remove(i);
			}
			d=AtagList.get(i);
			System.out.println("href�� ���Ե� A�±� ������ : "+d);
			i++;
			}catch(NullPointerException n){
				AtagList.remove(i);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		setup();
		javascriptseleniumTest3 java = new javascriptseleniumTest3();
		java.getAllAtag();
	}
}