package Practicejava;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public void ArrayListExample() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("Benz");
		arrayList.add("Bugati");
		arrayList.add("Bmw");
		arrayList.add("Bentley");
		System.out.println(arrayList);

	}

	public static void main(String[] args) {
		Arraylist example = new Arraylist();
		example.ArrayListExample();

	}

}
