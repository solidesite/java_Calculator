package main;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Frame frame = new Frame("frame");
		int frameWidth = 500;
		int frameHeigh = 700;
		frame.setSize(frameWidth, frameHeigh);
		frame.setLocation(screen.width / 2 - frameWidth / 2, screen.height / 2 - frameHeigh / 2);
		frame.setResizable(false);
		frame.setLayout(null);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		String input = scan.nextLine();
//		int num1 = Integer.parseInt(input);
//		System.out.println("부호를 입력하세요");
//		String input2 = scan.nextLine();
//
//		System.out.println("숫자를 입력하세요");
//		String input3 = scan.nextLine();
//		int num2 = Integer.parseInt(input3);
//		int result = 0;
//
//		if (input2.equals("+")) {
//			result = num1 + num2;
//		} else if (input2.equals("-")) {
//			result = num1 - num2;
//		} else if (input2.equals("/")) {
//			result = num1 / num2;
//		} else if (input2.equals("*")) {
//			result = num1 * num2;
//		} else {
//			System.out.println("잘못된 계산입니다.");
//		}
//		System.out.println("연산 결과 : " + result);

		ArrayList<String> numArr = new ArrayList<>();

		JLabel numDis = new JLabel("0");
		numDis.setSize(400, 40);
		numDis.setLocation(50, 100);
		numDis.setOpaque(true);
		frame.add(numDis);

		JButton num1Btn = new JButton("1");
		num1Btn.setLocation(50, 180);
		num1Btn.setSize(70, 70);
		frame.add(num1Btn);

		num1Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String numStr = "";
				numArr.add("1");
				for (int i = 0; i < numArr.size(); i++) {
					numStr += numArr.get(i);
				}
				numDis.setText(numStr);
			}
		});

		JButton num2Btn = new JButton("2");
		num2Btn.setLocation(120, 180);
		num2Btn.setSize(70, 70);
		frame.add(num2Btn);

		num2Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String numStr = "";
				numArr.add("2");
				for (int i = 0; i < numArr.size(); i++) {
					numStr += numArr.get(i);
				}
				numDis.setText(numStr);
			}
		});

		JButton num3Btn = new JButton("3");
		num3Btn.setLocation(190, 180);
		num3Btn.setSize(70, 70);
		frame.add(num3Btn);

		JButton num4Btn = new JButton("4");
		num4Btn.setLocation(50, 250);
		num4Btn.setSize(70, 70);
		frame.add(num4Btn);

		JButton num5Btn = new JButton("5");
		num5Btn.setLocation(120, 250);
		num5Btn.setSize(70, 70);
		frame.add(num5Btn);

		JButton num6Btn = new JButton("6");
		num6Btn.setLocation(190, 250);
		num6Btn.setSize(70, 70);
		frame.add(num6Btn);

		JButton num7Btn = new JButton("7");
		num7Btn.setLocation(50, 320);
		num7Btn.setSize(70, 70);
		frame.add(num7Btn);

		JButton num8Btn = new JButton("8");
		num8Btn.setLocation(120, 320);
		num8Btn.setSize(70, 70);
		frame.add(num8Btn);

		JButton num9Btn = new JButton("9");
		num9Btn.setLocation(190, 320);
		num9Btn.setSize(70, 70);
		frame.add(num9Btn);

		JButton num0Btn = new JButton("0");
		num0Btn.setLocation(50, 390);
		num0Btn.setSize(210, 70);
		frame.add(num0Btn);

		JButton plusBtn = new JButton("+");
		plusBtn.setLocation(270, 180);
		plusBtn.setSize(180, 70);
		frame.add(plusBtn);

		JButton minusBtn = new JButton("-");
		minusBtn.setLocation(270, 250);
		minusBtn.setSize(180, 70);
		frame.add(minusBtn);

		JButton divBtn = new JButton("÷");
		divBtn.setLocation(270, 320);
		divBtn.setSize(180, 70);
		frame.add(divBtn);

		JButton multiBtn = new JButton("x");
		multiBtn.setLocation(270, 390);
		multiBtn.setSize(180, 70);
		frame.add(multiBtn);

		JButton resultBtn = new JButton("=");
		resultBtn.setLocation(190, 470);
		resultBtn.setSize(260, 70);
		frame.add(resultBtn);

		JButton deleteBtn = new JButton("<-");
		deleteBtn.setLocation(190, 540);
		deleteBtn.setSize(260, 70);
		frame.add(deleteBtn);

		JButton clearBtn = new JButton("clear all");
		clearBtn.setLocation(190, 610);
		clearBtn.setSize(260, 70);
		frame.add(clearBtn);

		frame.setVisible(true);

		// 닫기 버튼
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
