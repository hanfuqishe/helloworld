import java.io.File;

public class DirList {
	public static void main(String args[]){
		if (args.length >=1)
			showContent(args[0]);
			System.out.print("Everything runs ok.");
		else 
			System.out.print("need 1 arg as dirname");
	}

	private static void showContent(String dirname)
	{
		File f1 = new File(dirname);

		if (f1.isDirectory()) {
			System.out.println("D " + dirname);

			String s[] = f1.list();

			for (int i=0; i < s.length; i++) 
				showContent(dirname + "/" + s[i]);
		} else 
			System.out.println("F " + dirname);
	}
}
