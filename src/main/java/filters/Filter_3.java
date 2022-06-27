package filters;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;
import java.io.IOException;

import java.io.PrintWriter;

public class Filter_3 extends HttpFilter {

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        PrintWriter out = response.getWriter();

        out.println("    Filter 3-B");

        chain.doFilter(request, response);//call next  

        out.println("    Filter 3-A");

    }
}
