package Lesson5Wrappers;


/*
abs() — абсолютное значение объекта this ;

	add(x) — операция this + х ;

	divide(х, r) — операция this / х с округлением по способу r ;

	divide(х, n, r) — операция this / х с изменением порядка и округлением по способу r ;

	mах(х) — наибольшее из this и х ;

	min(x) — наименьшее из this и х ;

	movePointLeft(n) — сдвиг влево на n разрядов;

	movePointRight(n) — сдвиг вправо на n разрядов;

	multiply(х) — операция this * х ;

	negate() — возврзщает объект с обратным знаком;

	scale() — возвращает порядок числз;

	setscaie(n) — устзнавливает новый порядок n ;

	setscaie(n, r) — устанавливает новый порядок п и округляет число при необходимости по способу r ;

	signumo — знак числа, хранящегося в объекте;

	subtract(х) — операция this - х ;

	toBiginteger() — округление числа, хранящегося в объекте;

	unscaiedvalue() —возвращает мантиссу числа.

*/





import java.math.BigDecimal;

public class Wrappers {


		public static void main(String[] args) {


				OperatorPlus TestPlus = new OperatorPlus();
				OperatorMinus TestDivide = new OperatorMinus();

				TestPlus.first = BigDecimal.valueOf(3.5);
				TestPlus.second = BigDecimal.valueOf(3.5);

				TestDivide.first = BigDecimal.valueOf(10);
				TestDivide.second = BigDecimal.valueOf(5);




				TestPlus.process();
				TestDivide.process();
				System.out.println(TestDivide.process());


		}


}
