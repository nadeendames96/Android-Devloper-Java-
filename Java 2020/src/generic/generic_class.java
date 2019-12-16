package generic;

//Class Generic 
public class generic_class<T> {
	private T t;

	void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generic_class<Integer> gc=new generic_class();
		generic_class<Double> gc4=new generic_class();
		generic_class<String> gc2=new generic_class();
		generic_class<Character> gc3=new generic_class();

		
		   gc.add(5);
		   gc2.add(new String("Nadeen"));
		   System.out.println(gc.get());
		   System.out.println(gc2.get());

	}

}
