

public class MyArrayListTest {

	public static void main(String[] args) {
		IList myList=new MyArrayList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		//myList.clear();
		//myList.add(7);
		
		myList.remove(2);
		myList.remove(0);
		
		System.out.println("val ="+myList.get(3));
		System.out.println("size= "+myList.size());
		
		System.out.println(myList);
	}

}

