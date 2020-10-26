package spi.impl;

import spi.Search;

/**
 * @Description TODO
 * @Author quancong
 * @Email quancong@ixiappu.com
 * @Date 2020/10/26
 */
public class FileSearch implements Search {
    @Override
    public void searchDoc(String keyword) {
        System.out.println("file search:" + keyword);
    }
}