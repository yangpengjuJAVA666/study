package fashion.helloworld;

/*
 * @author young.yang@marketin.cn
 * @since feature-2.12-dashboard
 */
public class HelloWorldHtmlMessageProvider implements MessageProvider {
    public String getMessage() {
        return "<html> <a href='http://www.baidu.com'>I am html</a></html>";
    }
}
