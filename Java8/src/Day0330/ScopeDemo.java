package Day0330;

/* ��Ȱ�ڵ� ��������, �������� ���� */

public class ScopeDemo {   //Ŭ���� ScopeDemo ����
    static int i = 2;   // static : Ŭ���� ����
                        // ��������

    /* a �޼ҵ� ���� */
    static void a() {   // static : Ŭ���� �޼ҵ�, void : ��ȯ�� ����
        i = 0;		// ���� �޼ҵ忡�� i�� 0�� ��, a�޼ҵ尡 ����Ǿ� i�� 0���� ���Ѵ�.
        			// ���� �޼ҵ忡�� i�� 1�� ��, a�޼ҵ尡 ����Ǿ� i�� 0���� ���Ѵ�.
        			// ���� �������� i�� 0~4���� �ݺ��Ǿ�� �ϴµ� i�� �ڲ� 0�� �Ǵ� ������ �ݺ�  
    }
 
    /* ���� �޼ҵ� - ���� ���� */
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);   // 0�� �ݺ��Ǿ� ���
        }
    }
}
