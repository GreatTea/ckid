package com.gt.workflow.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Administrator on 14-8-27.
 */
@Entity
@DiscriminatorValue(value = "WF_DECI")
public class Deci extends FlowNode {

}
