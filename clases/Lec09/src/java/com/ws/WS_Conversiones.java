/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author roger
 */
@WebService(serviceName = "WS_Conversiones")
public class WS_Conversiones {

    /**
     * This is a sample web service operation
     */
    
    private final float conversion = 583.1f;
    
    @WebMethod(operationName = "colToDol")
    public double colToDol(@WebParam(name = "Colones") double colones) {
        return colones / conversion;
    }
    
    @WebMethod(operationName = "colToDol")
    public double dolToCol(@WebParam(name = "Dolares") double dolares) {
        return dolares * conversion;
    }
    
    
    
}
