package com.aug.sessions;

public class FundManager {

	public static void main(String[] args) {
		float gainF = 0.000000004f; // 12.6 per year
		getProfitPerScond(1000000000, gainF);
		double gainD = 0.000000004f; // 12.6 per year
		getProfitPerScond(1000000000, gainD);
	}

	public static float getProfitPerScond(float value, float gain) {
		value = value + (value * gain);
		System.out.printf("%f \n", value);
		return value;
	}
	
	public static double getProfitPerScond(double value, double gain) {
		value = value + (value * gain);
		System.out.printf("%f \n", value);
		return value;
	}

}
