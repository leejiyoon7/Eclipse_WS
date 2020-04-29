package enencapsulation;

public class Student {
	    String name;
	    int kor;
	    int eng;
	    int math;
	    	    
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getKor() {
	        return kor;
	    }
	    public void setKor(int kor) {
	        this.kor = kor;
	    }
	    public int getEng() {
	        return eng;
	    }
	    public void setEng(int eng) {
	        this.eng = eng;
	    }
	    public int getMath() {
	        return math;
	    }
	    public void setMath(int math) {
	        this.math = math;
	    }
	    
	    public int Total() {
	        return kor+eng+math;
	    }
	    public float Avg() {
	        return (kor+eng+math)/3.0f;
	    }
}
