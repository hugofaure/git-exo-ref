import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
	private MesMessages monMessage= new MesMessages();
	private String ma_chaine_test;
	
	@BeforeEach
	public void setUp() {
		ma_chaine_test = "test";
	}
	
//	@Test
//	public void testMain() {
//		assertEquals(ma_chaine_test, monMessage.getMessage1());
//	}

}
