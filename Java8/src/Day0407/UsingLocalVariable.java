package Day0407;

public class UsingLocalVariable {
		void method(int arg) {	//arg�� final Ư���� ����
				int localVar = 40;	//localVar�� final Ư���� ����
				
				//arg = 31;			//final Ư�� ������ ���� �Ұ�
				//localVar = 41;	//final Ư�� ������ ���� �Ұ�
				
				//���ٽ�
				MyFunctionalInterface fi = () -> {
						//���� ���� ���
						System.out.println("arg: " + arg);	//10
						System.out.println("localVar: " + localVar + "\n");	//40
				};
				fi.method();
		}
		
		//���� �ٲ� �� �ִ�.
		void method2(int x) {
			System.out.println(x);
			x = 50;
			System.out.println(x);
		}
}
