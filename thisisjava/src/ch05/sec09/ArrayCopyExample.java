package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy( oldStrArray, 0, newStrArray, 2, oldStrArray.length);
		for(int i = 0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
