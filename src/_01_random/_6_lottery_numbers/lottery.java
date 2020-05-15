package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	String ticket= "";
	Random ran= new Random();
	for (int i = 0; i < 6; i++) {
		int num=ran.nextInt(100);
		ticket+=num;
		ticket+=" ";
	}
	JOptionPane.showMessageDialog(null,"Lottery numbers: " +ticket);
	
	
	
	
	
}
}
