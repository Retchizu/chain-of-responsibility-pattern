public class OrganicContainer implements WasteCollector {
  private WasteCollector nextCollector;

  @Override
  public void setNextCollector(WasteCollector nextCollector) {
      this.nextCollector = nextCollector;
  }

  @Override
  public void collectWaste(WasteContainer container) {
      if (container.getType().equalsIgnoreCase("organic")) {
          System.out.println("Collecting and composting organic waste: " + container.getCapacity() + " kg");
      } else if (nextCollector != null) {
          nextCollector.collectWaste(container);
      } else {
          System.out.println("No collector available for waste type: " + container.getType());
      }
  }
}
