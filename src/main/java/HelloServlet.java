package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import processing.data.JSONArray;
 
@MultipartConfig(maxFileSize = 1024 * 1024 * 2)
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public HelloServlet() {
        
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	doPost(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        response.setHeader("Cache-control", "no-cache, no-store");
    	
    	if(request.getParameter("blazon") != null) {
    		
    		String blazon = request.getParameter("blazon");

    		try {
    			UsingProcessing.heraldicGenerator(blazon);
    		}
    		catch(Exception e) {
    			
    			response.setContentType("application/json");
    			
    			String[] errorMsg = ThrowingErrorListener.getErrorMsg();    				
    			PrintWriter writer = response.getWriter();	
    			JSONArray jsErrorMessageArray = new JSONArray();
    			
    			for (int i = 0; i < errorMsg.length; i++) {
    				jsErrorMessageArray.append(errorMsg[i]);
    		    }
    			
    			writer.println(jsErrorMessageArray);
    			writer.close();
    		}
    	}
    	
    	if(request.getParameter("surname-download") != null) {
    		//Create surname folder
    		String surname = request.getParameter("surname-download");
    		String path = "C:\\Users\\finia\\Downloads\\"+surname;
    		File file = new File(path);
    		file.mkdir();
    		
    		//Save image
    		String fromImageFile = "http://localhost:8080/finalYearProject/images/blazon-image.png";
    		String toImageFile = "C:\\Users\\finia\\Downloads\\"+surname+"\\"+surname+".png";
    		FileUtils.copyURLToFile(new URL(fromImageFile), new File(toImageFile), 10000, 10000);
    		
    		//Save blazon Text
    		String fromTextFile = "http://localhost:8080/finalYearProject/images/blazon.txt";
    		String toTextFile = "C:\\Users\\finia\\Downloads\\"+surname+"\\"+surname+".txt";
    		FileUtils.copyURLToFile(new URL(fromTextFile), new File(toTextFile), 10000, 10000);
    	}
    	
    	if(request.getParameter("surname-upload") != null) {
    		
    		//Generate coat of arms corresponding to desired blazon
    		
    		String surname = request.getParameter("surname-upload");
    		
    		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\finia\\Downloads\\"+surname+"\\"+surname+".txt"));
    		StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            
            String retrievedBlazon = sb.toString();
            br.close();
            UsingProcessing.heraldicGenerator(retrievedBlazon);
    	}
    }
}

