public class WasteManagementSystem {
  public static void main(String[] args) {

    WasteCollector organicCollector = new OrganicContainer();
    WasteCollector recyclableCollector = new RecyclableContainer();
    WasteCollector hazardousCollector = new HazardousContainer();

    organicCollector.setNextCollector(recyclableCollector);
    recyclableCollector.setNextCollector(hazardousCollector);

    WasteContainer organicWaste = new WasteContainer("organic", 50);
    WasteContainer recyclableWaste = new WasteContainer("recyclable", 30);
    WasteContainer hazardousWaste = new WasteContainer("hazardous", 10);
    WasteContainer unknownWaste = new WasteContainer("electronic", 5);

    organicCollector.collectWaste(organicWaste);
    organicCollector.collectWaste(recyclableWaste);
    organicCollector.collectWaste(hazardousWaste);
    organicCollector.collectWaste(unknownWaste);
  }
}
