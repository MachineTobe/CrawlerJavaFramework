package Interfaces;

public interface ICrawler {

	/* 	Diese Methode dient der Implementierung der Logik des Crawlers.
		Die Werte (Timeseries, Array oder Double), welche sp�ter im validen XML-Format an das GIS-System zur�ckgegeben werden 
		sollen, m�ssen �ber die Klasse Framework.CrawlerDatatypes gesetzt werden. Nach erfolgreichem Ausf�hren der Run-Methode
		werden die hier hinterlegten Daten transformiert und als XML zur�ckgeliefert. */
	public void run();

}
