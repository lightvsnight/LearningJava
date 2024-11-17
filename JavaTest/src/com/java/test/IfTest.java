package com.java.test;

import java.util.Vector;

/**
 * 
 * @author L.hk
 * 
 *         if ”Ôæ‰≤‚ ‘
 *
 */
public class IfTest {

	public static boolean a = false;
	static Vector obs = new Vector();
	public static void main(String[] args) {
		Object[] arrLocal;
			if (!a) //!a true ÷¥––  //a false ≤ª÷¥––
			   return;
			arrLocal = obs.toArray();
			System.out.println(!a);
			clearChanged();
			System.out.println(a);
	}

	protected synchronized static void clearChanged() {
		a = false;
	}
}
