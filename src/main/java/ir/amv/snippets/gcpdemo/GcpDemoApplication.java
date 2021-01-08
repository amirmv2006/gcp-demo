package ir.amv.snippets.gcpdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class GcpDemoApplication {

  @Bean
  Function<String, String> reverseFn() {
    return s -> new StringBuilder(s).reverse().toString();
  }

  public static void main(String[] args) {
    SpringApplication.run(GcpDemoApplication.class, args);
  }

}
