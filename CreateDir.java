import java.io.File;

public class CreateDir {
	public static void main(String args[]) {
		String dirname = "/tmp/user/java/bin";
		System.out.println("dirname is:" + dirname);

		File d = new File(dirname);

		d.mkdirs();
	}
}
