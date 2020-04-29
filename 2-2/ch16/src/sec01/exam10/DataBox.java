package sec01.exam10;

//������ü Ŭ����
public class DataBox {
	private String data;
	
	//ConsummerThread�� ȣ���ϴ� ����ȭ �޼���
	public synchronized String getData() {
		if(this.data == null) {//data�� ������
			try {
				wait();//ConsummerThread�� �Ͻ�����
			} catch(InterruptedException e) {}
		}
		
		//data�� ������
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		data = null;//data�ʵ带 null ����
		notify();//ProducerThread�� ������� ��ȯ
		return returnValue;
	}
	
	//ProducerThread�� ȣ���ϴ� ����ȭ �޼���
	public synchronized void setData(String data) {
		if(this.data != null) {//���� ConsummerThread�� �����͸� ���� ���� ���
			try {
				wait();//ProducerThread�� �Ͻ� ����
			} catch(InterruptedException e) {}
		}
		
		//data==null�̸�
		this.data = data;//data�ʵ忡 �� ����
		System.out.println("ProducerThread�� ������ ������: " + data);
		notify();//ConsummerThread�� ������� ��ȯ
	}
}


