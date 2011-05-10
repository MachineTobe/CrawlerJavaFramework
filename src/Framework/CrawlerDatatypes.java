package Framework;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class CrawlerDatatypes {

	private static HashMap<String, HashMap<Date, Double>> timeseries_entries = new HashMap<String, HashMap<Date, Double>>();
	private static HashMap<String, ArrayList<Double>> array_entries = new HashMap<String, ArrayList<Double>>();
	private static HashMap<String, Double> double_entries = new HashMap<String, Double>();
	
	public static void setNewTimeseries(String paramName, HashMap<Date, Double> timeseries) {
		timeseries_entries.put(paramName, timeseries);
	}
	
	public static void setNewArray(String paramName, ArrayList<Double> array) {
		array_entries.put(paramName, array);
	}
	
	public static void setNewDouble(String paramName, double value) {
		double_entries.put(paramName, value);
	}
	
	public static HashMap<String, Double> getDoubleEntries() {
		return double_entries;
	}
	
	public static HashMap<String, ArrayList<Double>> getArrayEntries() {
		return array_entries;
	}
	
	public static HashMap<String, HashMap<Date, Double>> getTimeseriesEntries() {
		return timeseries_entries;
	}
}
