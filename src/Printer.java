public class Printer {
  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;


  public Printer(int tonerLevel, boolean duplex) {
    this.tonerLevel = ((tonerLevel < 0) || (tonerLevel > 100)) ? -1 : tonerLevel;
    this.duplex = duplex;
    this.pagesPrinted = 0;
  }


  public int getPagesPrinted() {
    return pagesPrinted;
  }

  public int addToner(int tonerAmount) {
    if (tonerAmount <= 0 || tonerAmount > 100) {
      return -1;
    }

    if ((tonerAmount + tonerLevel) > 100) {
      return -1;
    }

    tonerLevel += tonerAmount;

    return tonerLevel;
  }

  public int printPages(int pages) {
    int pagesToPrint = pages;

    if (duplex) {
      pagesToPrint = (pages / 2) + (pages % 2);

    }

    pagesPrinted += pagesToPrint;

    return pagesToPrint;
  }
}
