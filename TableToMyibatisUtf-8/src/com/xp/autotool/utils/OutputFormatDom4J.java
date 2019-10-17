package com.xp.autotool.utils;

import org.dom4j.io.OutputFormat;

public class OutputFormatDom4J extends OutputFormat {

	   public static OutputFormat createPrettyPrint() {  
		         OutputFormat format = new OutputFormat();  
		          format.setIndentSize(2);  
		          format.setNewlines(true);  
		          format.setTrimText(false);  
		          format.setPadText(true);  
		          return format;  
		      }  

}
