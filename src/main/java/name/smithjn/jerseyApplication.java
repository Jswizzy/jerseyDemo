package name.smithjn;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import name.smithjn.health.TemplateHealthCheck;
import name.smithjn.resources.HelloWorldResource;

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

        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
