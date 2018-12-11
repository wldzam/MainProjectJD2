package Students;

public class SaveStudentOrder {


	public static void main(String[] args) {


		StudendOrder so = new StudendOrder();
		so.husbandFirstName = "Alexei";
		so.husbandLastName = "Petrov";
		so.wifeFirstName = "Galina";
		so.wifeLastName = "Petrova";





		long ans = savestudentorder(so);
		System.out.println(ans);


	}


	static long savestudentorder(StudendOrder studendOrder) {

		long answer = 199;
		System.out.println("saveStudentorder: - " + studendOrder.wifeLastName);


		return answer;
	}


}
