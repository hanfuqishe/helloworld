import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class WinDemo {

	public static void main(String agrs[])
	{
		Frame nw= new Frame("登录");
		Panel nn=new Panel();
		Label a1=new Label("用户名");
		Label a2=new Label("密码   ");
		TextField b1=new TextField("name     ");
		TextField b2=new TextField("password");
		Button n1=new Button("确定");

		nn.add(a1);
		nn.add(b1);
		nn.add(a2);
		nn.add(b2);
		nn.add(n1);
		nw.add(nn);
		nw.setBackground(Color.cyan);
		nw.setSize(300, 300);
		nw.setVisible(true);
	}
}
