package com.reporting;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonfile) {
//	1.	mension the path of the JVMReport where store
		File file = new File("C:\\Users\\Ajith\\eclipse-workspace\\Cucumber\\target");

//	2.	generate object for configuration
		Configuration configuration = new Configuration(file, "Cucumber");

//	3.	add Browser,version and os details 
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("version", "103");
		configuration.addClassifications("os", "WIN11");

//	4.	generate object for repoet
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		

	}

}
