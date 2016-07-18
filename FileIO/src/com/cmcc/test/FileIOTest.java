package com.cmcc.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.junit.Test;

public class FileIOTest {
    
    /*
     * 1、按字节读写
     * 2、按字符读写(Reader类的一些方法，太复杂，不掌握)
     * 3、按行读写
     * 4、内容追加到文件尾部
     */

    //1、按字节读写
    @Test
    public void readFileByByte(){
        String filename = "f:\\1.jpg";
        File file = new File(filename);
        if(!file.exists()){
            return;
        }
        
        try {
            System.out.println("-----------------以字节为单位读取文件，一次读取多个字节-----------------");
            
            InputStream in = new FileInputStream(file);
            StringBuilder sb = new StringBuilder();
            int len = 0;
            byte buffer[] = new byte[1024];
            while((len = in.read(buffer))>0){
                sb.append(buffer);
            }
            
            in.close();
            System.out.println(sb.toString());
            System.out.println("文件读取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件读取失败！");
        }
        
        try {
            System.out.println("-----------------以字节为单位读取文件，一次读取一个字节-----------------");
            
            InputStream in = new FileInputStream(file);
            int tmpByte = 0;
            while((tmpByte = in.read())>0){
                System.out.println(tmpByte);
            }
            
            in.close();
            System.out.println("文件读取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件读取失败！");
        }
    }
    
    //2、按字符读写
    
    //3、按行读写
    @Test
    public void readFileByLine(){
        String filename = "f:\\1.log";
        File file = new File(filename);
        if(!file.exists()){
            return;
        }
        
        Reader reader;
        try {
            System.out.println("-----------------按行读取文件-----------------");
            
            reader = new FileReader(file);
            BufferedReader bf = new BufferedReader(reader);
            String line = null;
            int lineNum = 1;
            while((line = bf.readLine()) != null){
                System.out.println("lineNum = "+(lineNum++)+line);
            }
            
            reader.close();
            bf.close();
            System.out.println("文件读取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件读取失败！");
        }
    }
    
    //4、内容追加到文件尾部
    @Test
    public void appendString(){
        String filename = "f:\\1.log";
        File file = new File(filename);
        if(!file.exists()){
            return;
        }
        
        try {
            System.out.println("-----------------内容追加到文件尾部-----------------");
            
            FileWriter fw = new FileWriter(file, true);
            fw.write("我是添加内容，哈哈！");
            fw.close();
            System.out.println("文件添加成功！");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件添加失败！");
        }
    }
    
    //5、创建文件夹
    public void createDir(){
        String dir = "d:\\tmpDir";
        File file = new File(dir);
        if(!file.exists()){
            file.mkdir();       //创建单层文件夹
//          file.mkdirs();      //创建多层文件夹
        }
    }
    
    //6、创建文件
    public void createFile(String path, String fileName) throws IOException{
        File file = new File(path+"\\"+fileName);
        if(!file.exists()){
            file.createNewFile();
        }
    }
    
    //7、删除文件
    public void deleteFile(String path, String fileName){
        File file = new File(path+"\\"+fileName);
        if(file.exists() && file.isFile()){
            file.delete();
        }
    }
    
    //8、删除文件夹
    //要利用File类的delete()方法删除目录时，必须保证该目录下没有文件或者子目录，否则删除失败，因此在实际应用中，我们要删除目录，必须利用递归删除该目录下的所有子目录和文件，然后再删除该目录
    public void deleteDir(String path){
        File dir = new File(path);
        if(dir.exists()){
            File files[] = dir.listFiles();
            if(files != null && files.length>0){
                for(File file : files){
                    if(file.isDirectory()){
                        deleteDir(path+"\\"+file.getName());
                    } else {
                        file.delete();
                    }
                }
            } else {
                dir.delete();
            }
        }
    }
}
