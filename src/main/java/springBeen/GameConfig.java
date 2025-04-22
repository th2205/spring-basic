package springBeen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    @Bean
    public GameConsole game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }
}
