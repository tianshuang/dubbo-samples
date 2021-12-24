package org.apache.dubbo.samples.serialization.dto;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    public User(Long userId) {
        if (userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }
        this.userId = userId;
    }

    private Long userId;
    private String userName;
    private Long bookId;
    private String bookName;
    private Integer type;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer status;
    private Integer isDelete;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                '}';
    }
}
