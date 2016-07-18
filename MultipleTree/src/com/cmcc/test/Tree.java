package com.cmcc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cmcc.data.VirtualDataGenerator;
import com.cmcc.domain.Node;

public class Tree {
    public static void main(String[] args) {
//      // 读取层次数据结果集列表 
//      List dataList = VirtualDataGenerator.getVirtualResult();
//
//      // 节点列表（映射表，用于临时存储节点对象）
//      HashMap nodeList = new HashMap();
//      // 根节点
//      Node root = null;
//      // 将结果集存入映射表（后面将借助映射表构造多叉树）
//      for (Iterator it = dataList.iterator(); it.hasNext();) {
//          Map dataRecord = (Map) it.next();
//          Node node = new Node();
//          node.id = (String) dataRecord.get("id");
//          node.text = (String) dataRecord.get("text");
//          node.parentId = (String) dataRecord.get("parentId");
//          nodeList.put(node.id, node);
//      }
//      
//      // 构造无序的多叉树
//      Set entrySet = nodeList.entrySet();
//      for (Iterator it = entrySet.iterator(); it.hasNext();) {
//          Node node = (Node) ((Map.Entry) it.next()).getValue();
//          if (node.parentId == null || node.parentId.equals("")) {
//              root = node;
//          } else {
//              ((Node) nodeList.get(node.parentId)).addChild(node);
//          }
//      }
//    
//      // 输出无序的树形结构的JSON字符串
//      System.out.println(root);
//      // 对多叉树进行横向排序
//      root.sortChildren();
//      // 输出有序的树形结构的JSON字符串
//      System.out.println(root);
        
        Node root = null;
        
        
        List<Node> nodes = VirtualDataGenerator.getVirtualData();
        Map<String, Node> map = new HashMap<String, Node>();    //将所有节点nodes存储到Map中，方便后面获取节点的id
        for(Node node : nodes){
            map.put(node.getId(), node);
        }
        
        //操作：将node填充到对应的父节点的children属性中，处理好父子节点关系
        for(Node node : nodes){
            if(node.getParentId()==null || node.getParentId()==""){
                root = node;
            } else {
                Node parent = map.get(node.getParentId());
                parent.getChildren().add(node);
            }
        }
        
        //输出无序的树形结构
        System.out.println(root);
        //将无序树进行排序
        root.sortChildren();
        //输出有序的树形结构
        System.out.println(root);
        
        
    }
}
