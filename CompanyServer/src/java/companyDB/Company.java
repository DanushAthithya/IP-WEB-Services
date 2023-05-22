/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyDB;

import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.*;
import javax.jws.WebParam;

/**
 *
 * @author danus
 */
@WebService(serviceName = "Company")
public class Company {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "compsear")
    public String[] compsear(@WebParam(name = "companyName") String companyName) {
        //TODO write your implementation code here:
        HashMap<String,String[]> map=new HashMap<String,String[]>();
        String[] strarr;
        String description,img;
        img="data:image/jpeg;base64,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";
        description="Robert Lewandowski is a Polish professional footballer who plays as a striker for La Liga club Barcelona and captains the Poland national team.";
        strarr=new String[]{description,img};
        map.put("Robert Lewandowski",strarr);
        img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRn-PnBK62ZqD8AIYoo6MMQBm_AkGTgW0vS8DVW5x-tc9bQSEsfYPlv&usqp=CAE&s";
        description="Lionel Messi is a football player from Argentina who plays for FC Barcelona. He has won the Ballon D'Or, the annual award given to the best player in the world, 7 times, 2022 FIFA World Cup winner and an Olympic gold medal winner in 2008.";
        strarr=new String[]{description,img};
        map.put("Messi",strarr);
        img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5SA0R8wTXisxUKDG6H57sAWcreRvPGZeOwBpDBOxsSV8k13TPrqit&usqp=CAE&s";
        description="He is one of the most famous Portuguese soccer players in the world and has played for Manchester United and Real Madrid. He is the highest paid footballer in the world and in the history of football. Each year he earns a base salary of $40 million and extra $30 million from endorsements.";
        strarr=new String[]{description,img};
        map.put("Christiano Ronaldo",strarr);
        img="https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg/330px-20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Neymar_850_1705.jpg";
        description="Neymar da Silva Santos Junior, known as Neymar or Neymar Jr. (born 5 February 1992) is a professional Brazilian footballer that can play as a left or right Winger or as a Striker.";
        strarr=new String[]{description,img};
        map.put("Neymar",strarr);
        strarr=(String[])map.get(companyName);
        return strarr;
    }

    /**
     * This is a sample web service operation
     */
    
}
