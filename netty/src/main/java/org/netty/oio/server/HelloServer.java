package org.netty.oio.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class HelloServer {
	private int port;

	public HelloServer(int port) {
		this.port = port;
	}

	public void run() throws Exception {
		EventLoopGroup bossGroup = new NioEventLoopGroup(); // 用来接收进来的连接
		EventLoopGroup workerGroup = new NioEventLoopGroup(); // 用来处理已经被接收的连接
		System.out.println("准备运行端口：" + port);

		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class) // 这里告诉Channel如何接收新的连接
					.childHandler(new ChannelInitializer<SocketChannel>() {
						@Override
						protected void initChannel(SocketChannel ch) throws Exception {
							// 自定义处理类
							ch.pipeline().addLast(new HelloServerHandler());
						}
					}).option(ChannelOption.SO_BACKLOG, 128).childOption(ChannelOption.SO_KEEPALIVE, true);

			// 绑定端口，开始接收进来的连接
			ChannelFuture f = b.bind(port).sync();

			// 等待服务器socket关闭
			f.channel().closeFuture().sync();
		} catch (Exception e) {
			// 退出，释放线程池资源
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}

	/**
	 * 
	 * 测试windows,cmd启动后 telnet 127.0.0.1 10110 回车;输入任何字符，回车后发送到服务端
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int port = 10110;
		new HelloServer(port).run();
	}

}
