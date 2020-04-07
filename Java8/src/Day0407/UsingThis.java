package Day0407;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
			int innerField = 20;
			
			void method() {
				//람다식
				Functional fi= () -> {
						System.out.println("outterField: " + outterField);	//10
						System.out.println("outterField: " + UsingThis.this.outterField + "\n");	//10
						System.out.println("innerField: " + innerField);	//20
						System.out.println("innerField: " + this.innerField + "\n");	//20
				};
				fi.method();
				
				
				Functional fi2 = new Functional() {
					
					@Override
					public void method() {
						System.out.println("outterField: " + outterField);
						System.out.println("outterField: " + UsingThis.this.outterField + "\n");
						System.out.println("innerField: " + innerField);
						System.out.println("innerField: " + this.innerField + "\n");	//this.innerField라고 쓰면 오류.
					}
				};
				fi2.method();
			}
	}
}
