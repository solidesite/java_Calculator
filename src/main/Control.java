package main;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Control {
	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	Frame frame = new Frame("frame");
	ArrayList<String> numArr = new ArrayList<>();
	ArrayList<String> numArr2 = new ArrayList<>();

	String totalNum = "";
	String totalNum2 = "";
	String markStr = "";

	public void numDisplay(String num) {
		if (markStr == "") {
			String numStr = "";
			numArr.add(num);
			for (int i = 0; i < numArr.size(); i++) {
				numStr += numArr.get(i);
			}
			totalNum = numStr;
		} else {
			String numStr = "";
			numArr2.add(num);
			for (int i = 0; i < numArr2.size(); i++) {
				numStr += numArr2.get(i);
			}
			totalNum2 = numStr;
		}
	}

	public void clear() {
		numArr.clear();
		numArr2.clear();
		markStr = "";
		totalNum = "";
		totalNum2 = "";
	}

	public void init() {

		int frameWidth = 500;
		int frameHeigh = 700;
		frame.setSize(frameWidth, frameHeigh);
		frame.setLocation(screen.width / 2 - frameWidth / 2, screen.height / 2 - frameHeigh / 2);
		frame.setResizable(false);
		frame.setLayout(null);

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
				numDisplay("1");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num2Btn = new JButton("2");
		num2Btn.setLocation(120, 180);
		num2Btn.setSize(70, 70);
		frame.add(num2Btn);

		num2Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("2");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num3Btn = new JButton("3");
		num3Btn.setLocation(190, 180);
		num3Btn.setSize(70, 70);
		frame.add(num3Btn);

		num3Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("3");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num4Btn = new JButton("4");
		num4Btn.setLocation(50, 250);
		num4Btn.setSize(70, 70);
		frame.add(num4Btn);

		num4Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("4");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num5Btn = new JButton("5");
		num5Btn.setLocation(120, 250);
		num5Btn.setSize(70, 70);
		frame.add(num5Btn);

		num5Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("5");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num6Btn = new JButton("6");
		num6Btn.setLocation(190, 250);
		num6Btn.setSize(70, 70);
		frame.add(num6Btn);

		num6Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("6");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num7Btn = new JButton("7");
		num7Btn.setLocation(50, 320);
		num7Btn.setSize(70, 70);
		frame.add(num7Btn);

		num7Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("7");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num8Btn = new JButton("8");
		num8Btn.setLocation(120, 320);
		num8Btn.setSize(70, 70);
		frame.add(num8Btn);

		num8Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("8");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num9Btn = new JButton("9");
		num9Btn.setLocation(190, 320);
		num9Btn.setSize(70, 70);
		frame.add(num9Btn);

		num9Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numDisplay("9");
				numDis.setText(totalNum + markStr + totalNum2);
			}
		});

		JButton num0Btn = new JButton("0");
		num0Btn.setLocation(50, 390);
		num0Btn.setSize(210, 70);
		frame.add(num0Btn);

		num0Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numArr.size() == 0) {
				} else {
					numDisplay("0");
					numDis.setText(totalNum + markStr + totalNum2);
				}
			}
		});

		JButton plusBtn = new JButton("+");
		plusBtn.setLocation(270, 180);
		plusBtn.setSize(180, 70);
		frame.add(plusBtn);

		plusBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				markStr = "+";
				numDis.setText(totalNum + markStr);
			}
		});

		JButton minusBtn = new JButton("-");
		minusBtn.setLocation(270, 250);
		minusBtn.setSize(180, 70);
		frame.add(minusBtn);

		minusBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				markStr = "-";
				numDis.setText(totalNum + markStr);
			}
		});

		JButton divBtn = new JButton("¡À");
		divBtn.setLocation(270, 320);
		divBtn.setSize(180, 70);
		frame.add(divBtn);

		divBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				markStr = "¡À";
				numDis.setText(totalNum + markStr);
			}
		});

		JButton multiBtn = new JButton("x");
		multiBtn.setLocation(270, 390);
		multiBtn.setSize(180, 70);
		frame.add(multiBtn);

		multiBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				markStr = "x";
				numDis.setText(totalNum + markStr);
			}
		});

		JButton resultBtn = new JButton("=");
		resultBtn.setLocation(190, 470);
		resultBtn.setSize(260, 70);
		frame.add(resultBtn);

		resultBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int calc;
				int result1 = Integer.parseInt(totalNum);
				int result2 = Integer.parseInt(totalNum2);
				if (markStr.equals("+")) {
					calc = result1 + result2;
					String calcStr = Integer.toString(calc);
					numDis.setText(calcStr);
				} else if (markStr.equals("-")) {
					calc = result1 - result2;
					String calcStr = Integer.toString(calc);
					numDis.setText(calcStr);
				} else if (markStr.equals("¡À")) {
					calc = result1 / result2;
					String calcStr = Integer.toString(calc);
					numDis.setText(calcStr);
				} else if (markStr.equals("x")) {
					calc = result1 * result2;
					String calcStr = Integer.toString(calc);
					numDis.setText(calcStr);
				}
				clear();
			}
		});

		JButton deleteBtn = new JButton("<-");
		deleteBtn.setLocation(190, 540);
		deleteBtn.setSize(260, 70);
		frame.add(deleteBtn);

		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numArr.remove(numArr.size() - 1);
				if (markStr == "") {
					String numStr = "";
					for (int i = 0; i < numArr.size(); i++) {
						numStr += numArr.get(i);
					}
					totalNum = numStr;
				} else if (markStr == "+" || markStr == "-" || markStr == "x" || markStr == "¡À") {
					markStr = "";
				} else {
					String numStr = "";
					for (int i = 0; i < numArr2.size(); i++) {
						numStr += numArr2.get(i);
					}
					totalNum2 = numStr;
				}
				if (numArr.size() == 0) {
					numDis.setText("0");
				} else {
					numDis.setText(totalNum + markStr + totalNum2);
				}
			}
		});

		JButton clearBtn = new JButton("clear all");
		clearBtn.setLocation(190, 610);
		clearBtn.setSize(260, 70);
		frame.add(clearBtn);

		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
				numDis.setText("0");
			}
		});

		frame.setVisible(true);

		// ´Ý±â ¹öÆ°
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
