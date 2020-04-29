package sec01.exam05;

//제네릭으로 Pair클래스 선언(멀티 타입 파라미터)
public class Pair<K, V> {
	//필드
	private K key;
	private V value;

	//생성자
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) { 
		this.key = key; 
	}
	public void setValue(V value) { 
		this.value = value; 
	}
	public K getKey()   { 
		return key; 
	}
	public V getValue() { 
		return value; 
	}
}
