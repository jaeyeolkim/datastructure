package webflux;

import reactor.core.publisher.Flux;

class KitchenService {

  Flux<Dish> getDishes() {
    return Flux.just(
        new Dish("chicken"),
        new Dish("noodles"),
        new Dish("beef")
    );
  }
}
