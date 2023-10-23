package servlet;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloService {
    @WebMethod
    public String saluta(String input) {
        return "Hello " + ((input == null || input.isBlank())?"World!" : input);
    }
}
