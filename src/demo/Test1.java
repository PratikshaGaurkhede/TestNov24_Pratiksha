package demo;



public class Test1 {
	/*
	 1
	 1 2
	 1 2 3
	 1 2 3 4
	 */
		
		void getNum() {
			for(int i=1; i<=4;i++) {
				for(int j=1; j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Test1 assign38=new Test1();
			assign38.getNum();
		}
	}



