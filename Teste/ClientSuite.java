package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestClient.class,
	TestClientBuilder.class,
	TestClientDAO.class
	})
public class ClientSuite {

}
