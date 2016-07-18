package com.cmcc.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 节点类
 */
public class Node {
//  /**
//    * 节点编号
//    */
//   public String id;
//   /**
//    * 节点内容
//    */
//   public String text;
//   /**
//    * 父节点编号
//    */
//   public String parentId;
//   /**
//    * 孩子节点列表
//    */
//   private List children = new ArrayList();
//   // 添加孩子节点
//   public void addChild(Node node) {
//    children.add(node);
//   }
//   
//   // 先序遍历，拼接JSON字符串。输出该节点及其所有孩子节点
//   public String toString() {
//       String result = "{" + "id : '" + id + "'" + ", text : '" + text + "'";
//       if (children.size() != 0) {
//           result += ", children : [";
//           for (int i = 0; i < children.size(); i++) {
//               result += ((Node) children.get(i)).toString() + ",";   
//           }
//           result = result.substring(0, result.length() - 1);
//           result += "]";
//       } else {
//           result += ", leaf : true";
//       }
//       return result + "}";
//   }
//
//   // 兄弟节点横向排序
//   public void sortChildren() {
//       if (children.size() != 0) {
//           // 对本层节点进行排序（可根据不同的排序属性，传入不同的比较器，这里 传入ID比较器）
//           Collections.sort(children, new NodeIDComparator());
//           // 对每个节点的下一层节点进行排序   
//           for (int i = 0; i < children.size(); i++) {
//               ((Node) children.get(i)).sortChildren();
//           }
//       }
//  }
    
    //节点id
    private String id;
    //节点内容
    private String text;
    //父节点id
    private String parentId;
    //子节点
    List<Node> children = new ArrayList<Node>();
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public List getChildren() {
        return children;
    }
    public void setChildren(List children) {
        this.children = children;
    }
    
    public void addChild(Node node){
        children.add(node);
    }
    
    //排列该节点的所有子节点
    public void sortChildren(){
        if(children.size()!=0){
            Collections.sort(children, new Comparator(){

                @Override
                public int compare(Object node1, Object node2) {
                    return (((Node)node1).getId()).compareTo((((Node)node2).getId()));
                }
                
            });
        }
        
        //再排列该节点的所有子节点的所有子节点
        for(Node node : children){
            node.sortChildren();
        }
    }
    
    //输出节点及其子节点
    @Override
    public String toString() {
        String result =  "{id=" + id + ", text=" + text + ", parentId=" + parentId + ", children=[";
        if(children.size()!=0){
            for(Node child : children){
                result += child.toString() + ",";
            }
            
            result.subSequence(0, result.length()-1);
        }
        
        result += "]";
        result+="}";
        
        return result;
    }
    
    
}
