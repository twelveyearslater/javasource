package class06;

public class TestMultiDimensionalArray {
	public static void main(String[] args){
//		定义一个二维不规则数组，没有赋值的位置为空，所以称为不规则二维数组
		int[][] a = {{1,2},{3,4,0,9,2,3},{5,6,7}};
//		构造tmda并分配存储空间
		TestMultiDimensionalArray tmda = new TestMultiDimensionalArray();
//		调用方法打印二维数组a
		tmda.show(a);
		
		System.out.println("-----------------------------");
//		定义一个2行3列的整形二维数组
		int[][]b = new int[2][3];
//		赋值，没有赋值的值默认为零
		b[1][0] = 4;
		b[1][1] = 5;
		b[1][2] = 6;
//		打印数组b
		tmda.show(b);
	}
//	打印二维数组的方法（ps：行列的打印方法与行列长短的表示方法）
	public void show(int[][] s){
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length;j++){
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}

}
