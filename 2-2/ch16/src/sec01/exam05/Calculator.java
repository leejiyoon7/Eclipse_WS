package sec01.exam05;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//����ȭ(synchronized) �޼���
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

