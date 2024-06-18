package com.lgy.springex_3_10;

public class Capital {
	public void alphabet(String a) {
		char b=a.charAt(0);
		for (char i = b; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
