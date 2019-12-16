package inheretance;

public class inheretance_class {
	private int num;
	private String name;
	 public void setName(String name) {
		this.name = name;
	}
	 public String getName() {
		return name;
	}
	 public void setNum(int num) {
		this.num = num;
	}
	 public int getNum() {
		return num;
	}
	 
	 
	 
}
class inheretance_sub_class extends inheretance_class{
	 public int id;
}

