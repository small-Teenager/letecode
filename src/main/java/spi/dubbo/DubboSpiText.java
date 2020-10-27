package spi.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @Description TODO
 * @Author quancong
 * @Email quancong@ixiappu.com
 * @Date 2020/10/27
 */
public class DubboSpiText {

    public static void main(String args[]){
        ExtensionLoader<Search> extensionLoader =
                ExtensionLoader.getExtensionLoader(Search.class);
        Search file = extensionLoader.getExtension("fileSearch");
        file.searchDoc("hello world");
        Search image = extensionLoader.getExtension("imageSearch");
        image.searchDoc("hello world");
    }
}
