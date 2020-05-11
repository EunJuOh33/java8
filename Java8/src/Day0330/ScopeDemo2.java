package Day0330;

public class ScopeDemo2 {
	/* 필드 */
	int left, right;
	int up, down;
	
	/* 메소드 */
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum(int _up, int _down) {
		up = _up;
		down = _down;
	}
}

