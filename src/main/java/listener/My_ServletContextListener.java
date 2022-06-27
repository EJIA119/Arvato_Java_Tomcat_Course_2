package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public final class My_ServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {

        ServletContext context = event.getServletContext();
        context.log("-- My_ServletContextListener.contextInitialized()");

    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {

        ServletContext context = event.getServletContext();
        context.log("-- My_ServletContextListener.contextDestroyed()");

    }

}
