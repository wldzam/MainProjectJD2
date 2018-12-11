package Lesson5Wrappers;

import java.math.BigDecimal;

public class OperatorMinus extends OperatorPlus {


		BigDecimal first;
		BigDecimal second;

@Override
		public 	BigDecimal process() {


				return first.divide(second) ;


}}
