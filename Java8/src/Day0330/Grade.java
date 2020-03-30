package Day0330;

public class Grade {
	//핃드
	int kor, eng, mat;
	
	//생성자
	Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//메서드
	int avg() {
		int sum = kor + eng + mat;
		return sum / 3;
	}
}
