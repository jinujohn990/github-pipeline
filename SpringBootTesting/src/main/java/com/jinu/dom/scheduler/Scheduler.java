package com.jinu.dom.scheduler;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
	@Component
	public class Scheduler {
	  // @Scheduled(cron = "* * * ? * *")
	   public void cronJobSch() throws IOException, InterruptedException {
		   System.out.println("Inside cron");
		  // TimeUnit.SECONDS.sleep(30);
		  // TimeUnit.MINUTES.sleep(2); 
		   /*try {
			   Path path = Paths.get("examplefile.txt");
		        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);
		        System.out.println("File channel opened for read. Acquiring lock...");
		        System.out.println("Java cron job for every second... " );
		        TimeUnit.MINUTES.sleep(2); 
		   }catch (NonWritableChannelException e) {
			System.out.println("No able to open the file....");
		}
		   catch (Exception e) {
				System.out.println(e.getMessage());
			}*/
		    
	   }
	
}
