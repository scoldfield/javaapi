package com.cmcc.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cmcc.domain.Node;

/**
*构造虚拟的层次数据
*/
public class VirtualDataGenerator{
    //构造无序的结果集列表，实际应用中，该数据应该从数据库中查询获得；
//  public static List getVirtualResult(){
//      List dataList = new ArrayList();
//
//      HashMap node1 = new HashMap();
//      node1.set("112000");
//      node1.set("廊坊银行解放道支行");
//      node1.set("110000");
//
//      HashMap node1 = new HashMap();
//      node2.set("112200");
//      node2.set("廊坊银行三大街支行");
//      node2.set("112000");
//
//      HashMap node1 = new HashMap();
//      node3.set("112100");
//      node3.set("廊坊银行广阳道支行");
//      node3.set("112000");
//
//      HashMap node1 = new HashMap();
//      node4.set("113000");
//      node4.set("廊坊银行开发区支行");
//      node4.set("110000");
//
//      HashMap node1 = new HashMap();
//      node5.set("100000");
//      node5.set("廊坊银行总行");
//      node5.set("");
//
//      HashMap node1 = new HashMap();
//      node6.set("110000");
//      node6.set("廊坊分行");
//      node6.set("100000");
//
//      HashMap node1 = new HashMap();
//      node7.set("111000");
//      node7.set("廊坊银行金光道支行");
//      node7.set("110000");
//
//      dataList.add(node1);
//      dataList.add(node2);
//      dataList.add(node3);
//      dataList.add(node4);
//      dataList.add(node5);
//      dataList.add(node6);
//      dataList.add(node7);
//
//      return dataList;
//  }
    
    public static List<Node> getVirtualData(){
        List<Node> nodes = new ArrayList<Node>();
        
        Node node1=new Node();
        node1.setId("112000");
        node1.setText("廊坊银行解放道支行");
        node1.setParentId("110000");
        
        Node node2=new Node();
        node2.setId("112200");
        node2.setText("廊坊银行三大街支行");
        node2.setParentId("112000");

        Node node3=new Node();
        node3.setId("112100");
        node3.setText("廊坊银行广阳道支行");
        node3.setParentId("112000");

        Node node4=new Node();
        node4.setId("113000");
        node4.setText("廊坊银行开发区支行");
        node4.setParentId("110000");

        Node node5=new Node();
        node5.setId("100000");
        node5.setText("廊坊银行总行");
        node5.setParentId("");

        Node node6=new Node();
        node6.setId("110000");
        node6.setText("廊坊分行");
        node6.setParentId("100000");

        Node node7=new Node();
        node7.setId("111000");
        node7.setText("廊坊银行金光道支行");
        node7.setParentId("110000");
        
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);
        nodes.add(node6);
        nodes.add(node7);
        return nodes;
    }
}
