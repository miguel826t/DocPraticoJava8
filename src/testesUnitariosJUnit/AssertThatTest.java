package testesUnitariosJUnit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.equalTo;;

public class AssertThatTest {
	
	public void test() {
	
		assertThat(5, is(equalTo(5)));
		assertThat(5, not(equalTo(5)));
	}
	
	
	
}
