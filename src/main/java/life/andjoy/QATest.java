package life.andjoy;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import life.andjoy.resources.UserResource;
import life.andjoy.services.UserService;

public class QATest extends Application<Configuration> {

	public static void main(String[] args) throws Exception {
		new QATest().run(args);
	}

	@Override
	public String getName() {
		return "qa-test";
	}

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap) {
		// nothing to do yet
	}

	@Override
	public void run(Configuration configuration, Environment environment) {
		environment.jersey().register(new UserResource(new UserService()));
	}
}
