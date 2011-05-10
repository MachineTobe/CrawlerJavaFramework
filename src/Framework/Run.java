package Framework;

import IE.Crawler;
import Interfaces.ICrawler;

public class Run {
	
	/* Bitte hier den Korrekten Klassennamen des Crawlers angeben */
	public static void runCrawler() {
		ICrawler crawler = new Crawler();
		crawler.run();
	}
	
}
