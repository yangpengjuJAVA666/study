package fashion.helloworld;

/*
 * @author young.yang@marketin.cn
 * @since feature-2.12-dashboard
 */
public class HelloWorldDecoupled {

    public static void main(String[] args) {

        MessageSupportFactory factory = MessageSupportFactory.getInstance();

        // 消息提供方
        MessageProvider messageProvider = factory.getMessageProvider();

        // 消息打印方
        MessageRender messageRender = factory.getMessageRender();

        // 打印
        messageRender.render(messageProvider.getMessage());
    }

}