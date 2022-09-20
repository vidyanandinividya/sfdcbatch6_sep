package session4.stream;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String[] str=new String[10];
		Optional<String> isNull=Optional.ofNullable(str[9]);
		//Getting the substring
		if(isNull.isPresent())
		{
		String str2=str[9].substring(2,5);
		System.out.println(str2);
		}
		else
		{
			System.out.println("Cannot get the substring from an empty string");
		}
		str[9]="Java stream API";
		Optional<String> isNull2=Optional.ofNullable(str[9]);
		//Getting the substring
		if(isNull2.isPresent())
		{
		String str2=str[9].substring(2,5);
		System.out.println("Substring is:"+str2);
		}
		else
		{
			System.out.println("Cannot get the substring from an empty string");
		}

	}

}
