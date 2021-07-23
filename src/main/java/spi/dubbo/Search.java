package spi.dubbo;

//import com.alibaba.dubbo.common.extension.SPI;

import org.apache.dubbo.common.extension.SPI;

/**
 * @Description 与 Java SPI 实现类配置不同，Dubbo SPI 是通过键值对的方式进行配置，这样我们可以按需加载指定的实现类。
 *  另外，在测试 Dubbo SPI 时，需要在接口上标注 @SPI 注解
 * @Author quancong
 * @Email quancong@ixiappu.com
 * @Date 2020/10/27
 */
@SPI
public interface Search {
    void searchDoc(String keyword);
}
