class NewThread implements Runnable 
{
	int index;
	NewThread(int i) {
		index = i;
		Thread t = new Thread(this, "Demo Thread " + i);
		System.out.println("Child thread: " + t);
		t.start();
	}

	public void run () {
		try {
			for (int i = 50; i> 0; i--) {
				System.out.println("Child Thread: " + index + "," + i);

				Thread.sleep(400);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread:" + index);
	}
}

public class ThreadDemo {
	public static void main(String args[]) {
		for (int i = 0; i<5; i++)
			new NewThread(i);

		try {
			for (int i = 50; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(800);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
