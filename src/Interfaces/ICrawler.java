package Interfaces;

public interface ICrawler {

	/* 	Diese Methode dient der Implementierung der Logik des Crawlers.
		Die Werte (Timeseries, Array oder Double), welche später im validen XML-Format an das GIS-System zurückgegeben werden 
		sollen, müssen über die Klasse Framework.CrawlerDatatypes gesetzt werden. Nach erfolgreichem Ausführen der Run-Methode
		werden die hier hinterlegten Daten transformiert und als XML zurückgeliefert. */
	public void run();

}
