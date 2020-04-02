package Day0402;

public class A {
	A() {
		System.out.println("A ��ü�� ������");
	}
	// �ν��Ͻ� ��� Ŭ����
	class B {
		B() {	//������
			System.out.println("B ��ü�� ������");
		}
		
		int field1;
		
		// static int field2;	//static�� ����� �� ����.
		void method1() {
		}
		
		// static void method2(){}
	}
	
	
	// ���� ��� Ŭ����
	static class C {	
		C() {
			System.out.println("C ��ü�� ������");
		}
		
		int field1;
		static int field2;
		
		void method1() {
		}
		
		static void method2() {
		}
	}
	
	
	void method() {
		/** ���� Ŭ���� **/
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}
			
			int field1;
			
			//static int field2;
			void method1() {
			}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	
	//�ν��Ͻ� �ʵ�
	B outerfield1 = new B();	// (O) outerfield : �ܺ� Ŭ������  �ʵ��� ��.
	C outerfield2 = new C(); //(O)
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();	//(O)
		C var2 = new C();	//(O)	
	}
	
	// ���� �ʵ� �ʱ�ȭ
	// static B field3 = new B();	//(X) A��ü ����
	static C outerfield4 = new C();	//(o) ������ ����
	// ���� �޼ҵ�
	
	static void method2( ) {
		// B var1 = new B();	//(X) A ��ü ����
		C var2 = new C();	//(O) ������ ����
	}
	
}
