package lgs;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		System.out.println("HashSet -- randomly");
		Set<Student> hs = new HashSet<>();
		Collections.addAll(hs, new Student("Vika", 26), new Student("Nika", 26), new Student("Vika", 24));
		hs.add(new Student("Nata", 23));
		hs.add(new Student("Misha", 23));

		for (Student student : hs) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("LinkedHashSet -- in the order they were added");
		Set<Student> lhs = new LinkedHashSet<>();
		Collections.addAll(lhs, new Student("Vika", 26), new Student("Nika", 26), new Student("Vika", 24));
		lhs.add(new Student("Nata", 23));
		lhs.add(new Student("Misha", 23));

		for (Student student : lhs) {
			System.out.println(student);
		}

		System.out.println();
		System.out.println("TreeSet -- how was sorted in comparator");
		Set<Student> ts2 = new TreeSet<Student>(new StudentComparator());
		Collections.addAll(ts2, new Student("Vika", 26), new Student("Nika", 26), new Student("Vika", 24));
		ts2.add(new Student("Nata", 23));
		ts2.add(new Student("Misha", 23));

		for (Student student : ts2) {
			System.out.println(student);
		}
	}

}
