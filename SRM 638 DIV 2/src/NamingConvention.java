import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NamingConvention {
	
	public String toCamelCase(String variableName) {
		String res = "";
		boolean flag = false;
		for(char c: variableName.toCharArray()){
			if(c!='_'){
				if(flag) {
					res += (char)(c-32);
					flag = false;
				}
				else res += c;
			}
			else flag = true;
		}
		return res;
	}
}
