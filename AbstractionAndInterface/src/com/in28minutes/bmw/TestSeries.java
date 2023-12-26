package com.in28minutes.bmw;

public class TestSeries {

	public static void main(String[] args) {
		ThreeSeries threeSeries = new ThreeSeries();
		threeSeries.accelerate();
		threeSeries.commonFunction();
		
		FiveSeries fiveSeries = new FiveSeries();
		fiveSeries.accelerate();
		fiveSeries.commonFunction();
	}

}
