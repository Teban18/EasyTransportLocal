/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Teban18
 */
public class PathController {
    private String canonicalPath;
    private final String BASE_URL_SETTING = "\\src\\Json\\";
    private String jsonpath;
    private String jsonfileclient;
    private String jsonfilereport;
    private String clientpath;
    private String shpath;
    
    
    
     public void connectJsonReportFile() {
          try{
                 canonicalPath = new File(".").getCanonicalPath();
            }catch(IOException e){
                System.err.println(e);
                }
          String way =canonicalPath+BASE_URL_SETTING;
        JSONParser jsonparser = new JSONParser();
        try (FileReader fr = new FileReader(way+"Report.json")) {         
            Object object = jsonparser.parse(fr);
            JSONObject jsonobject = (JSONObject) object;
            JSONObject jsonreport = (JSONObject) jsonobject.get("ReportPath");
                jsonfileclient = (String) jsonreport.get("FileClient");
                jsonfilereport = (String) jsonreport.get("FileShipment");
                    clientpath = canonicalPath+"\\"+jsonfileclient;
                    shpath=canonicalPath+"\\"+jsonfilereport;
        } catch (FileNotFoundException e) {
            System.out.println("Error File" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error IO " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("Error Parse" + e.getMessage());
        }
    }

    public String getClientpath() {
        return clientpath;
    }

    public String getShpath() {
        return shpath;
    }
    
     
    
     
     
}
