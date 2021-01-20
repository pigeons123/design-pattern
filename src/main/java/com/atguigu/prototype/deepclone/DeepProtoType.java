package com.atguigu.prototype.deepclone;

import java.io.*;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 23:04
 */
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        DeepProtoType deepPrototype = (DeepProtoType) deep;
        DeepCloneableTarget deepCloneableTarget = (DeepCloneableTarget) deepPrototype.deepCloneableTarget.clone();
        deepPrototype.deepCloneableTarget = deepCloneableTarget;
        return deepPrototype;
    }

    //深拷贝，通过对象的序列化来实现
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType copyObj= (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
