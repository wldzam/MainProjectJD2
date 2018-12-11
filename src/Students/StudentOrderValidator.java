package Students;

public class StudentOrderValidator {

	public static void main(String[] args) {

		checkAll();
	}

	static void checkAll() {


		StudendOrder so = readStudentOrder();

		AnswerCityRegister cityAnswer = checkCityRegister(so);
		AnswerWedding wedAnswer = checkWedding(so);
		AnswerChildren childAnswer = checkChildren(so);
		AnswerStudent studentAnswer = checkStudent(so);

		sendMail(so);

	}

	static StudendOrder readStudentOrder() {

		StudendOrder so = new StudendOrder();
		return so;

	}

	static AnswerCityRegister checkCityRegister(StudendOrder so) {

		System.out.println("CityRegister is running");
		AnswerCityRegister ans = new AnswerCityRegister();
		return ans;
	}


	static AnswerWedding checkWedding(StudendOrder so) {


		System.out.println("Wedding is running");
		return new AnswerWedding();
	}

	static AnswerChildren checkChildren(StudendOrder so) {

		System.out.println("checkChildren is running");
		return new AnswerChildren();

	}

	static AnswerStudent checkStudent(StudendOrder so) {

		System.out.println("checkStudent is running");
		return new AnswerStudent();

	}

	static void sendMail(StudendOrder so) {


	}

}
