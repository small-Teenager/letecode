package spi.java;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description TODO
 * @Author quancong
 * @Email quancong@ixiappu.com
 * @Date 2020/10/26
 */
public class JavaSpiTest {

    public static void main(String[] args) {
        ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);

        Iterator<Search> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            search.searchDoc("hello world");
        }
    }
}
