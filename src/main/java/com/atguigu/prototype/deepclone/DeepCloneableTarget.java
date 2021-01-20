package com.atguigu.prototype.deepclone;

import java.io.Serializable;

/**
 * @author Rain
 * @version 1.0
 * @date 2021/1/19 23:00
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID=1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
