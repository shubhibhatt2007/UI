package Front.UI;



//import java.awt.event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



//import com.config.TestProperties;
 
public class Form extends JFrame implements ActionListener{
 JLabel l1, l2, l3,l4,l5,l6,l7,l8,lr1,lr2,lr3,lr4,lrFile5,lrF,lrf1,lrf2,lrf3,lrf4;
 JTextField tf1,tf2,tf3,tf4,tf5;
 JComboBox cb1;
 JButton btn1,btn2;
 JPasswordField p1;
 JFrame frame;
 String[] locale= {"French","German"};
 String k1,k2,k3,k4, fileNameLoc,languageLocale;
 ArrayList<String> keyListToSend;
 

 Form() {
	  
  frame= new JFrame("Shortcut Validator");
  // uncomment for locale label 
  //l6 = new JLabel("Select Locale");
  l1 = new JLabel("Enter Key/Keys");
 // l1.setForeground(Color.blue);
  //l1.setFont(new Font("Serif", Font.BOLD, 20));
 
  l2 = new JLabel("Key1");
  l3 = new JLabel("Key2");
  l4 = new JLabel("Key3");
  l5 = new JLabel("Key4");
  l7 = new JLabel("File Name/Path");
  l8 = new JLabel("Results German");
  //lrF = new JLabel("Results French");
  lr1 = new JLabel("");
  lr2 = new JLabel("");
  lr3 = new JLabel("");
  lr4 = new JLabel("");
  lrFile5 = new JLabel("");
  lrf1 = new JLabel("");
  lrf2= new JLabel("");
  lrf3= new JLabel("");
  lrf4= new JLabel("");
  tf1 = new JTextField();
  tf2 = new JTextField();
  tf3 = new JTextField();
  tf4 = new JTextField();
  tf5 = new JTextField();
  p1 = new JPasswordField();
 //uncomment for locale combobox
  //cb1= new JComboBox(locale);
  btn1 = new JButton("Validate");
  btn2 = new JButton("Reset");
//uncomment for locale label
 // l6.setBounds(10, 30, 400, 30);
 //uncomment for combobox
  //cb1.setBounds(10, 70, 200, 30);
  l1.setBounds(150, 110, 200, 30);
  l8.setBounds(750, 110, 200, 30);
 // lrF.setBounds(750, 110, 200, 30);
  l2.setBounds(150, 150, 200, 30);
  l3.setBounds(150, 190, 200, 30);
  l4.setBounds(150, 230, 200, 30);
  l5.setBounds(150, 270, 200, 30);
  l7.setBounds(150, 310, 200, 30);
  lr1.setBounds(750, 150, 200, 30);
  lr2.setBounds(750, 190, 200, 30);
  lr3.setBounds(750, 230, 200, 30);
  lr4.setBounds(750, 270, 200, 30);
  lrFile5.setBounds(750, 310, 200, 30);
  tf1.setBounds(300, 150, 200, 30);
  tf2.setBounds(300, 190, 200, 30);
  tf3.setBounds(300, 230, 200, 30);
  tf4.setBounds(300, 270, 200, 30);
  tf5.setBounds(300, 310, 460, 30);
  btn1.setBounds(120, 370, 100, 30);
  btn2.setBounds(300, 370, 100, 30);
  btn1.addActionListener(this);
  btn2.addActionListener(this);
	  
 
  frame.add(l1);
  frame.add(lr1);
  frame.add(lr2);
  frame.add(lr3);
  frame.add(lr4);
  frame.add(l8);
 //	 frame.add(lrF);
 // frame.add(cb1);
  frame.add(l2);
  frame.add(l3);
  frame.add(l4);
  frame.add(l5);
  frame.add(l7);
  frame.add(tf1);
  frame.add(l3);
  frame.add(tf2);
  frame.add(tf3);
  frame.add(tf4);
  frame.add(tf5);
  //frame.add(l6);
  frame.add(btn1);
  frame.add(btn2);

  frame.setSize(900, 600);
  frame.setLayout(null);
  frame.setVisible(true);
 
  
  
 }
 public void actionPerformed(ActionEvent ae)
 {
   

	 if(ae.getSource()==btn1){
	 System.out.println("Inside Page");
	 k1 = tf1.getText();
	 k2 = tf2.getText();
	 k3 = tf3.getText();
	 k4 = tf4.getText();
	 fileNameLoc = tf5.getText();
	 languageLocale = (String) cb1.getSelectedItem();
	 System.out.println("filename=="+fileNameLoc);
	 System.out.println("languageLocale=="+languageLocale);
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 System.out.println(k1);
	 keyListToSend = new ArrayList<String>();
	 keyListToSend.add(k1);
	 keyListToSend.add(k2);
	 keyListToSend.add(k3);
	 keyListToSend.add(k4);
	 
	 lr1.setText(k1);
	 lr2.setText(k2);
	 lr3.setText(k3);
	 lr4.setText(k4);
	 
	
	
	 for(String i : keyListToSend ){
		 System.out.println("i-----"+i);
	 }
	 //call ValidationResult vrReturnedObj = function(keyListToSend);
	 //vrReturnedObj.shortKeysSuggestions
	/* BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("path-to-file"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 JLabel picLabel = new JLabel(new ImageIcon("green-tick.jpg"));
		 
	 ValidationResult vrReturnedObj= new ValidationResult();
	 if (vrReturnedObj.keyAvailablityMap.get(k1).equals(true)){
		
		 add(picLabel);
	 }
	 else if (vrReturnedObj.keyAvailablityMap.get(k1).equals(false)){
		 
	 }
	 vrReturnedObj.keyAvailablityMap.get(k1);
	 vrReturnedObj.keyAvailablityMap.get(k2);
	 vrReturnedObj.keyAvailablityMap.get(k3);
	 vrReturnedObj.keyAvailablityMap.get(k4);*/
	 
	 
	 
	 }
	 
	 else if(ae.getSource()==btn2){
		 tf1.setText("");
		 tf2.setText("");
		 tf3.setText("");
		 tf4.setText("");
		 tf5.setText("");
		 cb1.setSelectedIndex(0); 
		 lr1.setText("");
		 lr2.setText("");
		 lr3.setText("");
		 lr4.setText("");
	 }
	 
//   TestProperties.usernm = tf1.getText();
//   TestProperties.pass = p1.getText();
//   System.out.println(TestProperties.usernm +" "+ TestProperties.pass);
//   frame.dispose();
//   
//  
//   ///after this need to run our testng code 
//   //Create object of TestNG Class
//   TestNG runner=new TestNG();
//
//   //Create a list of String 
//   List<String> suitefiles=new ArrayList<String>();
//
//   //Add xml file which you have to execute
//   suitefiles.add("C:\\Users\\sbhatt14\\eclipse-workspace\\Sel_POC_Lexikon\\testng.xml");
//
//   //now set xml file for execution
//   runner.setTestSuites(suitefiles);
//
//   //finally execute the runner using run method
//   runner.run(); 
  }
 
 public static void main(String[] args) {
  new Form();
  System.out.println("HIIIIII");

 }

 
 
}
