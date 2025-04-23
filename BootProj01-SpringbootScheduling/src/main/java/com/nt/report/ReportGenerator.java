package com.nt.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator {

	/*@Scheduled(initialDelay = 2000, fixedDelay = 3000)
	public void generateSalesReport() {
		System.out.println("Sales Report One::" + new Date());
	
	}*/

	/*@Scheduled(fixedDelay = 3000)
	public void generateReport() {
		System.out.println("Sales Report Two::" + new Date());
	}*/

	/*@Scheduled(fixedDelayString = "3000")
	public void salesReport() {
		System.out.println("Sales Report Three :: " + new Date());
	}*/

	// Fixes Dealy    task1/job1 execution 15 sec time to comlete  [3 sec gap break]
	/*@Scheduled(fixedDelay = 4000)
	public void reportGenerate() {
		System.out.println("Sales Report One :: " + new Date() + "(Start)");
		try {
			Thread.sleep(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End Of the Sales Report " + new Date());
	}
	
	*/
	/*@Scheduled(fixedDelay = 3000)
	public void report() {
		System.out.println("Sales Report Two :: " + new Date() + "(Start)");
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End Of the Sales Report " + new Date());
	}*/
	
	//Fixed Rate : 1000 (10 sec) task1 /job 1 is taking 5 sec to complete  
	@Scheduled(fixedRate = 1000)
	public void reportGenerator() {
		System.out.println("Sales Report Three :: " + new Date() + "(Start)");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End Of the Sales Report " + new Date());

	}
}
