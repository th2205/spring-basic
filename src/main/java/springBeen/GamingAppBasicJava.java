package springBeen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingAppBasicJava {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GameConfig.class)) {

            context.getBean(MarioGame.class).up();
            context.getBean(GameRunner.class).run();


        }
    }
}
