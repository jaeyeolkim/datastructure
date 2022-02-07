package webflux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class KitchenService {

  private List<Dish> menu = Arrays.asList(
      new Dish("Sesame"),
      new Dish("noodles"),
      new Dish("chicken")
  );
  private Random picker = new Random();

  public Flux<Dish> getDishes() {
    return Flux.<Dish>generate(sink -> sink.next(randomDish()))
        .delayElements(Duration.ofMillis(250));
  }

  private Dish randomDish() {
    return menu.get(picker.nextInt(menu.size()));
  }

}
