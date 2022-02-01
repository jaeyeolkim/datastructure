package webflux;

import reactor.core.publisher.Flux;

public class PoliteServer {
  private final KitchenService kitchen;

  public PoliteServer(KitchenService kitchen) {
    this.kitchen = kitchen;
  }

  Flux<Dish> doingMyJob() {
    return this.kitchen.getDishes()
        .doOnNext(dish -> {
          System.out.println("PoliteServer doingMyJob : Thank you " + dish);
          System.out.println("PoliteServer doingMyJob : =========================");
        })
        .doOnError(error -> System.out.println("error.getMessage() = " + error.getMessage()))
        .doOnComplete(() -> System.out.println("PoliteServer doingMyJob : Thanks for all your hard work!"))
        .map(Dish::deliver);
  }
}
