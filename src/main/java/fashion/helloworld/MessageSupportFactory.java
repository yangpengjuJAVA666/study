package fashion.helloworld;

import java.util.Properties;

/*
 * @author young.yang@marketin.cn
 * @since feature-2.12-dashboard
 */
public class MessageSupportFactory {

    private static MessageSupportFactory instance;

    private Properties props;

    private MessageRender messageRender;

    private MessageProvider messageProvider;

    static {
        instance = new MessageSupportFactory();
    }

    private MessageSupportFactory() {

        props = new Properties();

        try {

            props.load(this.getClass().getResourceAsStream("/hello.properties"));

            messageRender = (MessageRender) Class.forName(props.getProperty("render.class")).newInstance();

            messageProvider = (MessageProvider) Class.forName(props.getProperty("provider.class")).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MessageRender getMessageRender() {

        return messageRender;
    }

    public MessageProvider getMessageProvider() {

        return messageProvider;
    }

    public static MessageSupportFactory getInstance() {

        return instance;
    }

}
