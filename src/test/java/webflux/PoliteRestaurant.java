package webflux;

import org.junit.jupiter.api.Test;

public class PoliteRestaurant {

  @Test
  void subscribe() {
    PoliteServer server = new PoliteServer(new KitchenService());
    server.doingMyJob().subscribe(
        dish -> System.out.println("PoliteRestaurant subscribe : Consuming = " + dish),
        throwable -> System.out.println(throwable)
    );
  }
}
