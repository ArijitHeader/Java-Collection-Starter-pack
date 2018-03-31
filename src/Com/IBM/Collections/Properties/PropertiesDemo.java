package Com.IBM.Collections.Properties;

import java.io.*;

import java.util.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
        FileInputStream f=new FileInputStream("abc.properties");
        p.load(f);
        System.out.println(p);
        String s=p.getProperty("AAA");
        System.out.println(s);
        p.setProperty("BBB", "3333");
        FileOutputStream fo=new FileOutputStream("abc.properties");
        p.store(fo, "File Store Successfully");
        System.out.println(p);
	}

}
