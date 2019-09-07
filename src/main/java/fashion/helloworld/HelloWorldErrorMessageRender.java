package fashion.helloworld;

/*
 * @author young.yang@marketin.cn
 * @since feature-2.12-dashboard
 */
public class HelloWorldErrorMessageRender implements MessageRender {

    public void render(String msg) {
        System.err.println(msg);
    }
}