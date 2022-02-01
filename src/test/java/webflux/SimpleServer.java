package webflux;

import reactor.core.publisher.Flux;

public class SimpleServer {
  private final KitchenService kitchen;

  public SimpleServer(KitchenService kitchen) {
    this.kitchen = kitchen;
  }

  Flux<Dish> doingMyJob() {
    return this.kitchen.getDishes()
        .map(dish -> Dish.deliver(dish));
  }
}
