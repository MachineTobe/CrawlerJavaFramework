package IE;

import Interfaces.ICrawler;

public class Crawler implements ICrawler {
	
	public void run() {
		Framework.CrawlerDatatypes.setNewDouble("Mittelwert", 5.0);
		Framework.CrawlerDatatypes.setNewDouble("Diff", 4.0);
		Framework.CrawlerDatatypes.setNewDouble("StdAbw", 3.0);
	}

}
