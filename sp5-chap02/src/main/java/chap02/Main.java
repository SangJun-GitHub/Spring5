package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Sang Jun Park on 6/15/2023.
 * GitHub : http://github.com/SangJun-GitHub
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = ctx.getBean("greeter", Greeter.class);

        String msg = g.greeter("Spring");
        System.out.println(msg);
        ctx.close();
    }
}
