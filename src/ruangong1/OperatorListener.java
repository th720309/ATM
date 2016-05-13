package ruangong1;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class OperatorListener implements ItemListener{
	//JComboBox choiceid;
	//InsertHandleData work;
	AddActionListener computer;
	JCheckBox remember;
	static JTextField inputNumber;     
	static JTextField inputName;
	static JPasswordField inputPassword;
	public void setJT(JTextField ... t){
		inputNumber=t[0];
		inputName=t[1];
	}
	public void setJP(JPasswordField ... t){
		inputPassword=t[0];
	}
	//public void setWorkTogether(InsertHandleData handle){
	//	work=handle;
	//}
	public void setJC(JCheckBox s){
		remember=s;
	}
	static public void savaFile(){//选择保存密码
		File f=new File(".\\data\\dk.txt");
		try {
		FileWriter txt=new FileWriter(f);
		txt.write(inputNumber.getText()+"-");
		txt.write(inputName.getText()+"+");
		txt.write(inputPassword.getText()+"*");
		txt.close();
		} catch (IOException e) {
		// TODO 自动生成 catch 块
		e.printStackTrace();
		}
	}
	
	static public void savaFile1(){//未选择保存密码
		File f=new File(".\\data\\dk.txt");
		try {
		FileWriter txt=new FileWriter(f);
		txt.write(inputNumber.getText()+"-");
		txt.write(""+"+");
		txt.write(""+"*");
		txt.close();
		} catch (IOException e) {
		// TODO 自动生成 catch 块
		e.printStackTrace();
		}
	}
	static public void Duqu() {//读取文件中保存的账号和密码
		FileReader fr;
		try {
		fr = new FileReader(".\\data\\dk.txt");	
		BufferedReader br = new BufferedReader(fr); 
		try {
		String line = br.readLine();
		RegisterWin.inputNumber.setText(line.toString().substring(0,line.toString().indexOf('-')));
		RegisterWin.inputName.setText(line.toString().substring(line.toString().indexOf('-')+1,line.toString().indexOf('+')));
		RegisterWin.inputPassword.setText(line.toString().substring(line.toString().indexOf('+')+1,line.toString().indexOf('*')));//System.out.print(line);
		} catch (IOException e) {
		e.printStackTrace();
		}
		} catch (FileNotFoundException e1) {
		e1.printStackTrace();
		} 
	}
	public void itemStateChanged(ItemEvent e){
		if(remember.isSelected()){
			savaFile();
			//remember.setSelected(true);
		}else{
			savaFile1();
			//remember.setSelected(false);
		}
		
	}
}