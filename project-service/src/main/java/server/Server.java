package server;

/**
 * Created by charlie on 3/11/17.
 */

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import config.ConfigurationImpl;
import healthcheck.TemplateHealthCheck;
import resources.HelloWorldResource;
import resources.lines.LinesResource;

public class Server extends Service<ConfigurationImpl> {


    public static void main(String[] args) throws Exception {
        new Server().run(args);
    }

    @Override
    public void initialize(Bootstrap<ConfigurationImpl> bootstrap) {
        bootstrap.setName("application");
        bootstrap.addBundle(new AssetsBundle("/project-ui/src/main/html", "/", "index.html"));
    }

    @Override
    public void run(ConfigurationImpl configuration, Environment environment) throws Exception {

        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();
        environment.addResource(new HelloWorldResource(template, defaultName));
        environment.addResource(new LinesResource());
        environment.addHealthCheck(new TemplateHealthCheck(template));
        environment.setJerseyProperty("urlPattern", "/api/*");


    }

}
