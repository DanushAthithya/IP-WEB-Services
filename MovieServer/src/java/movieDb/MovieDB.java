/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieDb;

import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author danus
 */
@WebService(serviceName = "MovieDB")
public class MovieDB {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "db")
    public String[] db(@WebParam(name = "movie_name") String movie_name) {
        //TODO write your implementation code here:
        HashMap<String,String[]> map=new HashMap<String,String[]>();
        String[] strarr;
        strarr=new String[]{"Historical","Tamil","2023","7.5","Mani Ratnam"};
        map.put("PonniyinSelvan-2",strarr);
        strarr=new String[]{"Rom Com","Tamil","2023","7.8","Pradeep Ranganadhan"};
        map.put("Love Today",strarr);
        strarr=new String[]{"Crime Drama","Tamil","2023","8.5","Vetri Maran"};
        map.put("Viduthalai-1",strarr);
        strarr=new String[]{"Drama","Tamil","2023","6.5","Varisu"};
        map.put("Varisu",strarr);
        strarr=new String[]{"Crime Drama","Tamil","2023","7.2","Krishna"};
        map.put("Pathu Thala",strarr);
        strarr=new String[]{"Historical","Tamil","2022","7.7","Mani Ratnam"};
        map.put("PonniyinSelvan-1",strarr);
        strarr=(String[])map.get(movie_name);
        return strarr;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "movSearch")
    public String[] movSearch(@WebParam(name = "movie_name") String movie_name) {
        //TODO write your implementation code here:
        
        return db(movie_name);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "movComp")
    public String movComp(@WebParam(name = "movie_1") String movie_1, @WebParam(name = "movie_2") String movie_2) {
        //TODO write your implementation code here:
        double a=Double.parseDouble(db(movie_1)[3]);
        double b=Double.parseDouble(db(movie_2)[3]);
        return (a>b?movie_1:movie_2);
    }

    /**
     * This is a sample web service operation
     */
    
}
