package sample.command;

import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import sample.Sample;

@Command(name = "NewItem", description = "Place an order")
public class NewItem implements Callable<Integer> {

  @Parameters(index = "0", paramLabel = "CUSTOMER_ID", description = "customer ID")
  private String itemName;


  @Override
  public Integer call() throws Exception {

	
    try (Sample sample = new Sample()) {
      //System.out.println(sample.placeOrder(customerId, itemIds, itemCounts));
      System.out.println(sample.newItem(itemName));
    }

    return 0;
  }
}
