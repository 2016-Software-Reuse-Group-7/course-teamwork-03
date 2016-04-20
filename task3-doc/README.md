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
## 复用第三组 许可证模块 
* 我们选择了第三组的许可证模块进行使用，原因是第三组的使用文档十分清晰，而且由于第三组的许可证模块的接口与我们组之前的实现类似，所以基本可以直接替换，第三组的许可证功能也很完善。
* 在使用中，我们也发现引用别人写好的插件，好处是可以大大加快代码的进度，但是对我们的程序自身的结构要求也很高，所以我们对自身代码的程序结构进行了调整，使其更具有重构性，在引入插件时也更为方便。



## 复用第九组 性能管理模块 问题与建议

##### 选择原因

- 文档清晰明了 
- 使用方便 

##### 问题与建议

- 输出文件路径和文件名不可设置    
可能会有文件被覆盖

- 模块设有set方法,缺少get方法  
例如在此项目中,需要在另外存储数据,再通过set方法更新,比较不方便    
不过模块内是使用Object类型存储性能指数,实现get方法后使用时还要注意返回的数据类型   

- 文件输出的内容格式比较简陋    
比如   
```java
        log.setParam( "array", new int[]{1, 2, 3});
        log.setParam( "date", new Date() );
        log.setParam( "map", new LinkedHashMap<String , Object>(){{
            put("key1", "value1");
            put("key2", "value2");
        }});
```
&ensp;&ensp;&ensp;&ensp;会输出   
> {date=Tue Apr 19 23:48:20 CST 2016, array=[I@6bb6844, map={key1=value1, key2=value2}}

&ensp;&ensp;&ensp;&ensp;我觉得用类型Object存储性能指数很方便,   
&ensp;&ensp;&ensp;&ensp;另外使用者要用自定义类来表示性能指数的话,类要实现toString方法

