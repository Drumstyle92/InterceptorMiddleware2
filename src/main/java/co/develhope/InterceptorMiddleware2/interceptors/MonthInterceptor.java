package co.develhope.InterceptorMiddleware2.interceptors;

import co.develhope.InterceptorMiddleware2.entities.MonthEntity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Drumstyle92
 * Class that with the implementation of the appropriate interface takes methods to be able to manage the interceptor
 */
@Component
public class MonthInterceptor implements HandlerInterceptor {

    /**
     * List created to simulate a database through the reference entity
     */
    public static List<MonthEntity> months = new ArrayList<>(Arrays.asList(
            new MonthEntity(1, "January", "Gennaio", "Januar"),
            new MonthEntity(2, "February", "Febbraio", "Februar"),
            new MonthEntity(3, "March", "Marzo", "März"),
            new MonthEntity(4, "April", "Aprile", "April"),
            new MonthEntity(5, "May", "Maggio", "Mai"),
            new MonthEntity(6, "June", "Giugno", "Juni")
    ));

    /**
     * @param request parameter representing the request in HTTP
     * @param response parameter representing the response in HTTP
     * @param handler Parameter through which a calling component passes
     * @return Returns true if the call should continue, false if it should stop
     * @throws Exception
     * Method with which we check the pre-call and based on the data we will have a result
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberHeader = request.getHeader("monthNumber");
        if (monthNumberHeader == null || monthNumberHeader.isEmpty()) {

            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "monthNumber header is missing");

            return false;

        }

        Optional<MonthEntity> foundMonth = months.stream()

                .filter(month -> month.getMonthNumber() == Integer.parseInt(monthNumberHeader)).findFirst();

        if (foundMonth.isPresent()) {

            request.setAttribute("month", foundMonth.get());

        } else {

            request.setAttribute("month", new MonthEntity(0, "nope", "nope", "nope"));

        }

        return true;

    }

}
