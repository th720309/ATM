package ruangong1;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AddActionListener implements ActionListener {
	  JTextField inputNumber;     
	  JTextField inputName;
	  JPasswordField inputPassword;
	  JFrame win;
	  JCheckBox remember;
	  JButton signIn;                //��¼��ť
	  JButton logIn;                 //ע�ᰴť
	  JButton forgetPassword;       //
	  JButton Score;
	  JLabel title;
	  int m;
	  PreQuery query;                
	  AddActionListener(){
		  query=new PreQuery();
	  }
	  void setBT(JButton ... b){
		  signIn = b[0];
		  logIn = b[1];
		  forgetPassword = b[2];
	  }
	  void setBM(JButton ... s){
		  Score=s[0];
	  }
	  void setJT(JTextField ...  t) {
		     inputNumber = t[0];
		     inputName = t[1];
	  }
	  void setJW(JFrame p){
		  win=p;
	  }
	  void setJL(JLabel ...m){
		  title=m[0];
	  }
	  void setJP(JPasswordField ... s){
		  inputPassword = s[0];
	  }
	  void setJC(JCheckBox m){
		  remember=m;
	  }
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==logIn){
			  JOptionPane.showMessageDialog(null, "���������������п������벦 010-2457899���ܱ����а���"
			  		+ " ,  ллʹ�� ", "��Ϣ��ʾ��", JOptionPane.WARNING_MESSAGE);
		  }
		  if(e.getSource()==signIn){
			  //SignView win1 = new SignView();
         	  //win.dispose();
		       PreparedStatement sql;  
		       String number = inputNumber.getText(); //�õ�ѧ��
		       String name = inputName.getText(); //�õ�����
		       String password = inputPassword.getText(); //�õ�����
		       try { 
		             String SQL=
		            "select *from  information "
		            + "where ID='"+number+"'";
		             query.setDatabaseName("�ͻ���Ϣ��");
		             query.setSQL(SQL);
		             query.startQuery();
		             String ziduan[] =query.getColumnName();
		             String [][]record=query.getRecord();
		             if(password.trim().equals(record[0][2].trim())){
		            		 SignView win1 = new SignView();
			            	 win.dispose();
			            	 //OperatorListener.Duqu();
			            	 //title="Welcome +"+name+"to the English World";
		             }	
		             
		             else {
		            	 JOptionPane.showMessageDialog(null, "��������ȷ������", "�������", JOptionPane.WARNING_MESSAGE);
		             }
		       }    	 
		       
		       catch(Exception exp) { 
		    	   JOptionPane.showMessageDialog(null, "���˺�δ��ע��", "��Ϣ��ʾ��", JOptionPane.WARNING_MESSAGE);
		       }  
		       if(remember.isSelected()){
		    	   OperatorListener.savaFile();
		    	   //OperatorListener.Duqu();
		       }else{
		    	   OperatorListener.savaFile1();
		    	  // OperatorListener.Duqu();
		       }
		     
		  }
	
	  }
	private void dispose() {
		// TODO Auto-generated method stub
		
	}
	private void setVisable(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
