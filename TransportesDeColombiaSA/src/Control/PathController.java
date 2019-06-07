/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
    private String jsonpath;
    private String jsonfile1;
    private String jsonfile2;
    private String clientpath;
    private String shpath;
     public void connectJsonReportFile() {
        JSONParser jsonparser = new JSONParser();
        try (FileReader fr = new FileReader("C:\\Users\\diegoalejo\\Documents\\NetBeansProjects\\TransportesDeColombiaSA\\src\\Json\\Report.json")) {
            Object object = jsonparser.parse(fr);
            JSONObject jsonobject = (JSONObject) object;
            JSONObject jsonreport = (JSONObject) jsonobject.get("ReportPath");
            jsonpath = (String) jsonreport.get("Path");
            jsonfile1 = (String) jsonreport.get("File1");
            jsonfile2 = (String) jsonreport.get("File2");
            clientpath = jsonpath+jsonfile1;
            shpath=jsonpath+jsonfile2;
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
