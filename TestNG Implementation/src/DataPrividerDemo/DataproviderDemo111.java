package DataPrividerDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo111 {

@Test(dataProvider="getData")
public void DataMatrix(String username, String password, int mobile, String Browser) {
	//System.out.println("username:" + username ,"password:" + password, "mobileno:" + mobile, "Browser:" + Browser );
	}

@DataProvider

public Object[][] getData(){
Object[][] data = new Object[3][4];
	
	data[0][0]="username";
	data[0][1]="password";
	data[0][2]=8668;
	data[0][3]="Chrome";
	
	data[1][0]="username1";
	data[1][1]="password1";
	data[1][2]=86681;
	data[1][3]="Mozilla";
	
	data[2][0]="username2";
	data[2][1]="password2";
	data[2][2]=86682;
	data[2][3]="InternetExploler";
	
	return data;
}
}

