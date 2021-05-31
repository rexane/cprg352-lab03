
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        String firstNum = request.getParameter("first_num");
        String secondNum = request.getParameter("second_num");
        String cal = request.getParameter("calculate");
        
        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);
                
        int total = 0;
                
        if (firstNum == null || firstNum.equals("") || (secondNum == null || secondNum.equals("")) || firstNum.matches("\\D") || secondNum.matches("\\D") ) {
            request.setAttribute("result", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        
        try {
            
            switch (cal) {
                
            case "+":
                total = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                request.setAttribute("result", total);
                break;
                
            case "-":
                total = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                request.setAttribute("result", total);
                break;
                
            case "*":
                total = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                request.setAttribute("result", total);
                break;
                
            case "%":
                total = Integer.parseInt(firstNum) % Integer.parseInt(secondNum);
                request.setAttribute("result", total);
                break;
            }
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
            
        } catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }        
    }
}
