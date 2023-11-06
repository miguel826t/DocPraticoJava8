package testesUnitariosJUnit;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class RuleErrorCollector {

	@Rule
	private static ErrorCollector error = new ErrorCollector();
	
	@Test
	public void test() {
		Integer valorInserido = 5;
		
		error.checkThat(valorInserido,is(5));
		error.checkThat(valorInserido,is(8));
		error.checkThat(valorInserido,is(10));
	}
	
	
}
