package webflux.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 블로킹 리포지토리 사용하지 말자
 */
//@Component
public class RepositoryDatabaseLoader {

//  @Bean
  CommandLineRunner initialize(BlockingItemRepository repository) {
    return args -> {
      repository.save(new Item("clock", 19.99));
      repository.save(new Item("TV", 24.99));
    };
  }
}
