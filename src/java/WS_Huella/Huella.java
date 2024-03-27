/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WS_Huella;

import Huella_import.BasicRequest;
import Huella_import.DeletePersonRequest;
import Huella_import.ExistPersonRequest;
import Huella_import.IWSMbss;
import Huella_import.MbssService;
import Huella_import.Request;
import Huella_import.RequestType;
import Huella_import.Response;
import Huella_import.RoutingData;
import com.infomedia.utils.PropertyLoader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author CONSULTOR
 */
@WebService(serviceName = "WS_Huella")
public class Huella {
    
    
    Properties prop;
    public Huella(){
        prop=PropertyLoader.load("huella.properties");
    }
    
    @WebMethod(operationName = "exist_person")
    public void exist_person(@WebParam(name = "id_persona") String id_persona, @WebParam(name = "matchToPersonSLALevel") int matchToPersonSLALevel, @WebParam(name = "priority") int priority ) throws MalformedURLException {
        try{
        URL voURL = new URL(prop.getProperty("URL"));
        IWSMbss service= new MbssService(voURL).getPort(IWSMbss.class);
        
        // Crear el objeto basic para agregar el valor 
        BasicRequest basic=new BasicRequest();
        basic.setId(id_persona);
        
        ExistPersonRequest exist= new ExistPersonRequest();
        exist.setId(id_persona);
        exist.setBasicRequest(basic);
        
        RequestType reqt= RequestType.EXIST_PERSON;
        
        //Creando el objeto request
        Request request= new Request();
        //Agregando valores de request
        request.setRequestType(reqt);
        request.setExistPersonRequest(exist);
        
        // Crear el objeto routingData
        RoutingData rd=new RoutingData();
        rd.setMatchToPersonSLALevel(matchToPersonSLALevel);
        rd.setPriority(priority);
        
        Response res=service.process(request, rd);
        
        System.out.println("Response: "+res.getExistPersonResponse().isExist());
        System.out.println("Code: "+ res.getExistPersonResponse().getBasicResponse().getError().getCode());
        }catch(Exception e){
            System.out.println("ERROR: "+e);
        }
    }
        @WebMethod(operationName = "delete_person")
        public void delete_person(@WebParam(name = "id_persona") String id_persona, @WebParam(name = "matchToPersonSLALevel") int matchToPersonSLALevel, @WebParam(name = "priority") int priority ) throws MalformedURLException {
            try{
                URL voURL = new URL(prop.getProperty("URL"));
                IWSMbss service= new MbssService(voURL).getPort(IWSMbss.class);
                
                BasicRequest basic=new BasicRequest();
                basic.setId(id_persona);
                
                DeletePersonRequest delete= new DeletePersonRequest();
                delete.setId(id_persona);
                
                RoutingData rd=new RoutingData();
                rd.setMatchToPersonSLALevel(matchToPersonSLALevel);
                rd.setPriority(priority);
                
                RequestType reqt= RequestType.DELETE_PERSON;
                
                Request request= new Request();
                //Agregando valores de request
                request.setRequestType(reqt);
                request.setDeletePersonRequest(delete);
                
                Response res=service.process(request, rd);
        
                System.out.println("Response: "+res.getDeletePersonResponse().getBasicResponse().getId());
                System.out.println("Response: "+res.getDeletePersonResponse().getBasicResponse().getError().getMessage());
                System.out.println("Code: "+ res.getExistPersonResponse().getBasicResponse().getError().getCode());
                
            }catch(Exception e){
                System.out.println("ERROR: "+e);
            }
        }
    }
    
    

