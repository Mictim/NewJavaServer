package newServer;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by mictim on 4/5/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();

        Server server = new Server(8080);
        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
