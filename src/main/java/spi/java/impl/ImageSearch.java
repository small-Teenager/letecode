package spi.java.impl;

import spi.java.Search;

/**
 * @Description TODO
 * @Author quancong
 * @Email quancong@ixiappu.com
 * @Date 2020/10/26
 */
public class ImageSearch implements Search {
    @Override
    public void searchDoc(String keyword) {
        System.out.println("image search:"+keyword);
    }
}
