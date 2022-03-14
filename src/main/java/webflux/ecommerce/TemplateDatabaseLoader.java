package webflux.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {

  /**
   * 블로킹 리포지토리 사용하지 않고 블로킹 방식으로 데이터를 로딩
   */
  @Bean
  CommandLineRunner initialize(MongoOperations mongo) {
    return args -> {
      mongo.save(new Item("alarm", 10));
      mongo.save(new Item("TV", 20));
    };
  }
}
