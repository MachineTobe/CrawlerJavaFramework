import Framework.CrawlerDatatypes;


public class Tester {

	public static void main(String[] args) {
		Framework.Run.runCrawler();
		System.out.println("Double:\n" + CrawlerDatatypes.getDoubleEntries());
		System.out.println("Array:\n" + CrawlerDatatypes.getArrayEntries());
		System.out.println("Timeseries:\n" + CrawlerDatatypes.getTimeseriesEntries());
	}

}
