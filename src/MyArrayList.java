import java.util.Arrays;

public class MyArrayList implements IList{
	private int [] data;
	private int sz = 0;
	private static final int DEFAULT_SIZE = 5;
	private int maxSize = DEFAULT_SIZE;
	
	public MyArrayList() {
		super();
		this.sz = 0;
		data = new int[maxSize];
	}
	
	private void resizeCapacity() {
		int newSize = maxSize * 2;
		data = Arrays.copyOf(data, newSize);
		maxSize = newSize;
	}
	
	public void add(int value) {
		if (sz == maxSize) {
			resizeCapacity();
		}
		
		data[sz++] = value;
	}
	
	public void clear() {
		data = null;
		sz = 0;
		maxSize = DEFAULT_SIZE;
		data = new int [maxSize];
	}
	
	public int indexOf(int value) {
		for (int i = 0; i < sz; i++) {
			if (data[i] == value)
				return i;
		}
		return -1;
	}
	
	public int get(int index) {
		if (index >= 0 && index < sz) {
			return data[index];
		}
		return -1;
	}
	
	public int remove(int index) {
		int val = -1;
		if (index >= 0 && index < sz) {
			val = data[index];
			for (int i = index; i < sz; i++) {
				data[i] = data[i + 1];
			}
			sz--;
			 if (sz*2 < maxSize) {
				 int newSize = maxSize/2;
				 data = Arrays.copyOf(data, newSize);
				 maxSize = newSize;
			 }
		}// end of if
		return val;
	}
	
	public int size() {
		return sz;
		
	}
	public String toString()
	{
		String s="[";
		for(int i=0; i<sz; i++)
		{
			s+=data[i]+", ";
		}
		s=s.substring(0,s.length()-2);
		s+="]";
	
		s+="\n";
		s+="Size="+sz+", Capacity="+maxSize;
		
		return s;
	}
	
	
	
	
	
	
	
	
	
	
}