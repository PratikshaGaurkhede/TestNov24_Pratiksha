package demo;



public class Test2 {
/*	*
	 1 1 1 1
	 2 2 2 2
	 3 3 3 3
	 4 4 4 4
	 5 5 5 5
	 */
		void getNum() {
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=4;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
	}
		public static void main(String[] args) {
			Test2 assign40 =new Test2();
			assign40.getNum();
		}
	}


