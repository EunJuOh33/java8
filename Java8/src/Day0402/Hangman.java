package Day0402;

import java.util.Scanner;

public class Hangman {
	private String hiddenString;		//������ ���ڿ�(����)
	private StringBuffer outputString;	//�÷��̾��� �Է¿� ���� ����� ������ ���ڿ�
	private StringBuffer inputString;	//�÷��̾ �Է��� ���ڵ��� ����
	private int remainder;		//���� ���ڿ�(�� ������ �����ִ� ������ ��)
	private int failed;			//������ Ƚ��
	private Scanner sc;
	private String inputData;
			
	
	public Hangman() {
		hiddenString = "hello";
		outputString = new StringBuffer();	//���� �ʱ�ȭ
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for(int i=0; i<remainder; i++) {
			outputString.append("_");
		}	
	}	
	
	
	/* �ʱ�ȭ �ڵ� �߰� */
	public Hangman(String solution) {
		outputString = new StringBuffer();	//���� �ʱ�ȭ
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for(int i=0; i<remainder; i++) {
			outputString.append("_");
		}
	}	

	public void playGame() {
		System.out.println("��� ������ �����մϴ�.");
		show();
		do {
			do {
				setInputData();
			} while(checkChar(inputData));
			processGame();
			show();
		} while(failed < 6 && remainder > 0);	//Ʋ�� Ƚ���� 6�� �ǰų� remainder�� 0�� �Ǹ� ���� ����.
		System.out.println("��� ������ �����մϴ�.");
	}
	
	private void show() {
		System.out.println("Ʋ��  Ƚ��: " + failed + "/6");
		System.out.println(outputString);
		System.out.println();
	}
	
	private void setInputData() {
		System.out.print("���ڸ� �Է��� �ּ���.: ");
		this.inputData = sc.next().substring(0, 1);	//���� �� �� ���ڸ� ���� �ȴ�.
	}
	
	private boolean checkChar(String inputData) {	//true, false�� �������� boolean ���
		if(inputString.indexOf(inputData) == -1) {	//���ٴ� ��
			inputString.append(inputData);
			return false;
		}
		System.out.println("�̹� �Է��� �����Դϴ�.");
		return true;
	}
	
	//����
	private void processGame() {
		if(hiddenString.indexOf(inputData) == -1) {
			failed++;		//Ʋ�� ���� �߰�
		} else {
			int index = hiddenString.indexOf(inputData);
			do {
				outputString.setCharAt(index, inputData.charAt(0));
				remainder--;
				index = hiddenString.indexOf(inputData, index + 1);	//index+1���� �ٽ� �˻��϶�.
			} while(index != -1);
		}
	}
}	