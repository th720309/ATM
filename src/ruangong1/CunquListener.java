package ruangong1;

import java.awt.event.*;

import ruangong1.AddActionListener;
import ruangong1.RegisterWin;

import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class CunquListener implements ActionListener {
	   JTextField inputMoney;     //����ѧ��
	   JButton signIn; 
	   JFrame win;
	   PreQuery query;      
	   int m;
		  CunquListener(){
			  query=new PreQuery();
		  }
	public void setTB2(JButton ...s){
		signIn=s[0];
	}
	public void setW(JFrame ...p){
		win=p[0];
	}
	public void setTJ(JTextField ...t){
		inputMoney=t[0];
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==signIn){
				
			         Connection con;
			         ResultSet rs;
		             PreparedStatement sql;   
		             try { 
		            	 if (inputMoney.getText().equals("")) {    // �ı����ٴλ�ý���   
		            		 inputMoney.requestFocusInWindow();     
		            		 JOptionPane.showMessageDialog(null, "������Ԥ����");
		            	 }
		            	 else{
		            	 String money = inputMoney.getText(); //�õ�Ԥ����
		            	 String uri="jdbc:derby:�ͻ���Ϣ��;create=true"; 
		                 con=DriverManager.getConnection(uri);
		                 String SQL=
		     		            "select *from  information "
		     		            + "where ID='"+RegisterWin.inputNumber.getText()+"'";
		     		             query.setDatabaseName("�ͻ���Ϣ��");
		     		             query.setSQL(SQL);
		     		             query.startQuery();
		     		             String ziduan[] =query.getColumnName();
		     		             String [][]record=query.getRecord();
		     		             double remain = Double.parseDouble(record[0][3]);
		     		             double cunmoney = Double.parseDouble(money);
		     		             remain = remain + cunmoney;
		                   String SQL2=
		        "update information set ID=? ,name=?,password=?,money=? where ID ='"+RegisterWin.inputNumber.getText()+"'";
		                   query.setSQL(SQL2);
		                   sql=con.prepareStatement(SQL2);		                				       
		                   sql.setString(1,query.record[0][0]);
		                   sql.setString(2,query.record[0][1]);
		                   sql.setString(3,query.record[0][2]);
		                   sql.setDouble(4,remain);		                 		                   
		                   m=sql.executeUpdate();
		                   con.close();
		            	 }
		             }
		             catch(SQLException e1) { 
		               JOptionPane.showMessageDialog
		               (null,""+e1,"���ʧ��", JOptionPane.WARNING_MESSAGE);
		             }   
		             if(m!=0){
		             	 ProgressBar win1 = new ProgressBar();
		            	 //JOptionPane.showMessageDialog
		                 //(null,"���ɹ�","���ɹ�", JOptionPane.WARNING_MESSAGE);
		             	//win.dispose();
		               }    	         	        
		       
		    //   catch(Exception exp) { 
		    	//   JOptionPane.showMessageDialog(null, "���˺�δ��ע��", "��Ϣ��ʾ��", JOptionPane.WARNING_MESSAGE);
		       //}  
		}
	}
}
