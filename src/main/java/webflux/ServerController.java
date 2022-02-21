package webflux;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/* @RestController는 화면 구성을 위한 템플릿을 사용하는 대신에 결과 데이터를 직렬화하고 HTTP 응답 본문에 직접 써서 반환하는 REST 컨트롤러임을 나타낸다 */
@RestController
public class ServerController {
  private final KitchenService kitchen;

  public ServerController(KitchenService kitchen) {
    this.kitchen = kitchen;
  }

  @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  Flux<Dish> serveDishes() {
    return this.kitchen.getDishes();
  }

  @GetMapping(value = "/served-dishes", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  Flux<Dish> deliverDishes() {
    return this.kitchen.getDishes().map(dish -> Dish.deliver(dish));
  }
}
