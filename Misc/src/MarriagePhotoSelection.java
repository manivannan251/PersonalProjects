import java.io.File;

public class MarriagePhotoSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name  = "123.jpg";
		String[] splitName = name.split("[.]");
		for(String s1:splitName) {
			System.out.println(s1);
		}
		File f = new File("D:\\personal\\marriage\\103ND750");
		String[] fileList = f.list();
		int c=0;
		for(String f1:fileList) {
			c++;
			System.out.println(f1.split("[.]")[0]);
		}
		System.out.println("File Count "+c);

	}

}
