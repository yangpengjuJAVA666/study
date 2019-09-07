package fashion.helloworld;

/*
 * @author young.yang@marketin.cn
 * @since feature-2.12-dashboard
 */
public class HelloWorldMessageRender implements MessageRender {

    public void render(String msg) {
        System.out.println(msg);
    }
}