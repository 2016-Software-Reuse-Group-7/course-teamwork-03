# 对其他组可复用构件的问题反映

请各位将其他组的构件替换自己负责的构件之后，将问题或意见写到这个目录下。

命名格式：复用第[x]组\_[模块名称]\_问题与建议.md

## 复用第五组 配置管理模块 问题与建议

- **文档demo中的问题** 在[ConfigBean](https://github.com/SummerWish/TahitiConfigManager)中
 
`ConfigBean.java`:

```java
public class ConfigBean {

    public String host;
    
    public int port;
    
    ...省略getter/setter

}
```

`host`,`port`应该声明为private,这样应该才符合面向对象的编程，才需要后来的generator生成`getter/setter`

- **对于整个可复用构件的建议** : 对于json等，希望能够支持多层的配置。例如：

```json
{
  "server" : {
    "port" : 8887,
    "host" : "127.0.0.1"
  },
  "db" : {
    "name":"ddming",
    "password" : "passwd"
  }
}

```

这样的话，只需要一个配置文件就可以解决真个项目的配置问题，便于对配置文件的管理。
## 复用第五组 许可证模块 
由于第三组的许可证模块的接口与我们组之前的实现基本类似，所以基本可以直接替换。



