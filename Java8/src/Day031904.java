
public class Day031904 {

	public static void main(String[] args) {
		int number = 10;
		String isOk = "";
		if(number ==1) {
			isOk = "찾았습니다.";
		} else if(number == 2) {
			isOk = "찾았습니다.";
		} else if(number == 3) {
			isOk = "찾았습니다.";
		} else if(number == 4) {
			isOk = "찾았습니다.";
		} else if(number == 5) {
			isOk = "찾았습니다.";
		} else if(number == 6) {
			isOk = "찾았습니다.";
		} else if(number == 7) {
			isOk = "찾았습니다.";
		} else if(number == 8) {
			isOk = "찾았습니다.";
		} else if(number == 9) {
			isOk = "찾았습니다.";
		}
		System.out.println(isOk);
		
		if(number > 5) {
			/* 6 7 8 9 10 */
			if(number > 7) {
				/* 8 9 10 */
			} else {
				/* 6 7 */
				if(number > 6) {
					/* 7 */
				} else {
					/* 6 */
				}
			}
		} else {
			/* 1 2 3 4 5 */
			if(number > 2) {
				/* 3 4 5 */
			} else {
				/* 1 2 */
			}
		}
	}
}
