class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

public class IntanceOfEx {

	static void print(Person p) {
		if(p instanceof Person) { // p가 Person에 속해 있으면 true를 반환
			System.out.print("Person ");
		}
		if(p instanceof Student) {
			System.out.print("Student ");
		}
		if(p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if(p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); print(new Student());
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		System.out.print("new Professor() -> \t"); print(new Professor());

	}

}
