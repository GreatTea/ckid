package com.gt.core.user.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Administrator on 2015/2/6.
 */
@Entity
@Table(name = "C_BLOG_USER")
@PrimaryKeyJoinColumn(name = "ID")
public class BlogUser extends User implements Serializable {

}
