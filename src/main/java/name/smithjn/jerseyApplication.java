package name.smithjn;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class jerseyApplication extends Application<jerseyConfiguration> {

    public static void main(final String[] args) throws Exception {
        new jerseyApplication().run(args);
    }

    @Override
    public String getName() {
        return "jersey";
    }

    @Override
    public void initialize(final Bootstrap<jerseyConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final jerseyConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
