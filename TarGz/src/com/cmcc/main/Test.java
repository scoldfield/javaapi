package com.cmcc.main;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void test() {
        File file = new File("D:\\temp");
        File[] files = file.listFiles();
        
        List<String> filenames = new ArrayList<String>();
        for(File file2 : files) {
            String name = file2.getName();
            filenames.add("D:\\temp\\" + name);
        }
        
        String targetFileName = "d:\\temp\\1.tar";
        File tarFile = new File(targetFileName);
        try {
            if(!tarFile.exists()) {
                tarFile.createNewFile();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        TarUtils tarUtils = new TarUtils();
        tarUtils.execute(filenames, targetFileName);
    }

}
