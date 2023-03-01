package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Interview_Programs {

	@Test(priority = 2)
	public void find_Duplicate_Characters() {
		
		String s = "Lenovo Laptop";
		char[] c = s.toCharArray();
		int length = c.length;
		int i=0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		while(i!=length) {
			if(map.containsKey(c[i])==false) {
				map.put(c[i],1);
			}else {
				int ov = map.get(c[i]);
				int nv = ov+1;
				map.put(c[i], nv);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> smap = map.entrySet();
		
		for (Map.Entry<Character, Integer> data : smap) {
			if(data.getValue()>1) {
				System.out.println("Duplicates characters in the given string is     "+data.getKey()+"   ,    it is repeated   "+data.getValue()+"        times");
			}
		}
	}
	
	
	@Test(dependsOnMethods = {"find_Duplicate_Characters"})
	public void find_duplicate_Words() {
		String[] s = {"Hello","Hello","java","Java","Laptop","Samsung", "Samsung"};
		
		int length = s.length;
		int i =0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		while(i!=length) {
			if(map.containsKey(s[i])==false) {
				map.put(s[i], 1);
			}else {
				int ov = map.get(s[i]);
				int nv = ov+1;
				map.put(s[i], nv);
			}
			i++;
		}
		Set<Map.Entry<String, Integer>> smap = map.entrySet();
		for (Map.Entry<String, Integer> data : smap) {
			if(data.getValue()>1) {
				System.out.println("Duplicate words in given String are    "+data.getKey());
			}
		}
	}
	
	@Test(dependsOnMethods = {"reverse_Pallindrome"})
	public void pallindrome() {
	
		int num = 425;
		int temp, sum, r=0;
		sum=0;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not a Pallindrome");
		}
		
	}
		
	@Test(dependsOnMethods = {"prime_Number"})
	public void reverse_Pallindrome() {
		String s="MadaaaM";
		String r="";
		for(int i= s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		if(s.equals(r)) {
			System.out.println("Reverse Variable Value is   "+r);
		}else {
			System.out.println("String is reversed but it ia not a pallindrome");
		}
	}
		
		@Test(dependsOnMethods = {"fibanacci"})
		public void prime_Number() {
			int n=121;
			int count=0;
			if(n>1) {
				
				for(int i=1;i<=n;i++){
					if(n%i==0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println("It is a Prime Number");
				}else {
					System.out.println("It has more than two factors, it is not a prime number");
				}
				
			}else {
				System.out.println("Number is less than one   ");
			}
		}
		
		
		@Test(priority = 1)
		public void fibanacci() {
			int n1=0;
			int n2=1;
			int sum=0;
			for(int i=2;i<=10;i++) {
				sum=n1+n2;
				n1=n2;
				n2=sum;
			}
			System.out.println("Fibanacci Values upto 10 is     "+sum);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
