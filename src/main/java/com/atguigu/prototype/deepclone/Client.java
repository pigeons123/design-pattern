package com.atguigu.prototype.deepclone;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 23:11
 */
public class Client {
    public static void main(String[] args) {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name="宋江";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");
        try {
            DeepProtoType clone = (DeepProtoType) deepProtoType.clone();
            System.out.println(deepProtoType.deepCloneableTarget==clone.deepCloneableTarget);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //方式2：完成深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.deepCloneableTarget==deepProtoType1.deepCloneableTarget);
    }
}
