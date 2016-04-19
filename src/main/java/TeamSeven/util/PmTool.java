package TeamSeven.util;

import TeamSeven.entity.MessageCount;
import log.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by tina on 16/4/19.
 */
public class PmTool {
    private static Log log;
    private static MessageCount mc;

    // 服务端开启时
    public static void initServerPm() throws IOException
    {
        log = new Log();
        mc = new MessageCount( true );
        log.setDelay( 0 );
        log.setParam( "name", "server");

        startOutput();
    }

    // 客户端开启时
    public static void initClientPm( String name ) throws IOException
    {
        log = new Log();
        mc = new MessageCount( false );
        log.setDelay( 0 );
        log.setParam( "name", name );

        startOutput();
    }

    // 客户端发送一条消息
    public static void clientAddMessage()
    {
        mc.addSendMessageCount( 1 );
        log.setParam( "发送消息数量", mc.getSendMessageCount() );

    }

    // 服务端接收一条消息 or 客户端一条消息被接收
    public static void addReceivedMessage()
    {
        mc.addReceivedMessageCount( 1 );
        log.setParam( "接收消息数量", mc.getReceivedMessageCount() );
    }

    // 服务端忽略一条消息 or 客户端一条消息被接收
    public static void addIgnoredMessage()
    {
        mc.addIgnoredMessageCount( 1 );
        log.setParam( "接收消息数量", mc.getIgnoredMessageCount() );
    }

    // 开始生成文件
    public static void startOutput() throws IOException {
        log.run();
    }

    // 停止生成文件
    public static void endOutput() throws IOException {
        log.stop();
    }
}
