//package org.utility;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//import net.masterthought.cucumber.Configuration;
//import net.masterthought.cucumber.ReportBuilder;
//
//
//public class JVMReport {
//	
//	public static void generateJVMReport(String json) {
//		File loc= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
//		Configuration con= new Configuration(loc, "HotelApp");
//		List<String> jsonfile=new ArrayList<String>();
//		jsonfile.add(json);
//		ReportBuilder r=new ReportBuilder(jsonfile, con);
//		r.generateReports();
//		
//	}
//
//}
