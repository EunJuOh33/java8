package Day0330;

/* 생활코딩 전역변수, 지역변수 예제 */

public class ScopeDemo {   //클래스 ScopeDemo 정의
    static int i = 2;   // static : 클래스 변수
                        // 전역변수

    /* a 메소드 정의 */
    static void a() {   // static : 클래스 메소드, void : 반환값 없음
        i = 0;		// 메인 메소드에서 i가 0일 때, a메소드가 실행되어 i가 0으로 변한다.
        			// 메인 메소드에서 i가 1일 때, a메소드가 실행되어 i가 0으로 변한다.
        			// 메인 영역에서 i가 0~4까지 반복되어야 하는데 i가 자꾸 0이 되니 끝없이 반복  
    }
 
    /* 메인 메소드 - 실행 영역 */
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);   // 0이 반복되어 출력
        }
    }
}
