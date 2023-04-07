/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package MyWebService;

import IO.IO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NewWebService")
public class NewWebService {
    @WebMethod(operationName = "checkSanPham")
    public int checkSanPham(@WebParam(name = "id") String id, @WebParam(name = "count") int count) {
        int output = IO.check(id, count);
        return output;
    }
}
