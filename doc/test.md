#测试文档



---             



>课程名称：                软件复用                         
>项目名称：   客户端-服务器项目（上机实践01）                        
>项目组编号：                 第7组                         
>项目组成员：1352847欧阳俊鹏、1352855侯潇雪、              
>1352888林悦锵、1352916陈宏俊、1352989赵明阳                                  

----


###文档信息：
* 文档名称  ：  测试文档
* 版本 ：	v1.0
* 文档编号	： 01
* 编写日期	： 2016/03/28
* 编写人员	： 侯潇雪
* 评审人员	： 项目组全体人员

----

###修订历史：
* 编写日期:2016年03月28日
* 版本:v1.0
* 说明:初稿
* 作者:侯潇雪


----
	
###一、程序编写目标
#####1.1程序编写目标：
>建立一个客户端-服务器的通信应用。


#####1.2功能描述：
   该项目具体功能要求如下：
#####*登录：*
 * 实现用户的注册，选择相应服务器并登录；
 * 配置服务端端口号并运行；
 * 登录后保持客户端与服务端的连接。
 * 记录每分钟客户端与服务端的信息：
      客户端：登录成功的次数
              登录失败的次数
      服务端：通过登录验证的次数
              未通过登录验证的次数

#####*通信：*
 * 服务端验证消息给出回应，并将客户端的信息转发到其余登录状态下的客户端；
 * 忽略客户端一秒内发送的超过五条的消息；
 * 客户端在一次登录中发送超过100条消息后，服务端发送的“重新登录”的消息，客户端自动重新登录（此过程要保持二者的连接）；
 * 记录每分钟客户端与服务端的信息：
      客户端：发送/收到消息的数量
      服务端：转发/收到/忽略的消息数
 
 ---
   

###二、测试概要
>对软件项目进行单元测试及功能测试，检查产品各功能是否符合期望，尽早发现程序中的错误，提高软件的可靠性。

---

###三、测试环境
* IntelliJ IDEA
* Junit

---

###四、单元测试
#####VerificationTool 测试
 
		
编号 | 测试项 | 期望结果 | 测试结果 | 测试时间 |
--- | --- | --- | --- | --- |
1 | MD5加密函数测试 | 与MD5加密工具结果相同 | 正确 | 2016/3/28 |
2 | 测试账号在线 | 返回1 | 正确 | 2016/3/28 |
3 | 测试账号离线 | 返回0 | 正确 | 2016/3/28 |
4 | 登陆（账号离线） | 返回1 | 正确 | 2016/3/28 |
5 | 登陆（账号在线） | 返回-1 | 正确 | 2016/3/28 |


###五、手动测试
### 客户端
编号 | 测试项 | 期望结果 | 测试结果 | 测试时间 |
--- | --- | --- | --- | --- |
1 | “Login”按钮 | 点击后跳转到客户端界面 | 正确	| 2016/03/28 |
2 | “Port”文本框 | 可正常输入，默认值为8887 | 正确 | 2016/03/28 |
3 | “IP”文本框 | 可正常输入，默认值为127.0.0.1 | 正确 |	2016/03/28 |
4 | “Id”文本框 | 可正常输入 | 正确 | 2016/03/28 |
5 | 文本域 | 接收消息，不可编辑 | 正确 |	2016/03/28 |
6 | 消息文本框 | 可发送消息 | 正确 | 2016/03/28 |
7 | “Send”按钮 | 可点击，点击后消息发送 | 正确 | 2016/03/28 |
8 | “Relog”按钮 | 可点击，点击后跳转至客户端登陆界面 | 正确 | 2016/03/28 |
9 | “Exit”按钮 | 可点击，点击后退出客户端 | 正确 | 2016/03/28 |
10| “IP”标签 | 显示当前连接的服务器IP |	正确 | 2016/03/28 |
11| “Port”标签 | 显示当前连接的服务器端口号 | 正确 | 2016/03/28 |



###服务端
编号 | 测试项 | 期望结果 | 测试结果 | 测试时间 |
--- | --- | --- | --- | --- |
1	|“Login”按钮|	点击后跳转到服务端界面|	正确|	2016/03/28|
2	|“Port”文本框|	可正常输入，默认值为8887|	正确|	2016/03/28|
3|	文本域|	接收消息，不可编辑|	正确|	2016/03/28|
4|	“Start”按钮|	可点击，点击后服务器启动，文本域显示启动信息|	正确|	2016/03/28|
5	|“Port”标签|	显示当前服务器端口号|	正确|	2016/03/28|
6|	“Restart”按钮|	可点击，点击后服务器重启|	正确|	2016/03/28|
7|	“Exit”按钮|	可点击，点击退出服务端|	正确|	2016/03/28|


###六、测试结果及分析
> 本次测试错误覆盖率达90%，本文档包含了单元测试及功能的手动测试部分，均正常，许可证功能（每次登录发送消息不得超过100条及每秒不能超过五条消息的测试部分由代码实现，未手工进行）正常。

 本次测试达到了测试目的及测试标准。
