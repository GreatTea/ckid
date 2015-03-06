package com.gt.workflow.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="WF_FLOW_NODE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE")
public class FlowNode implements Serializable {

    private static final long serialVersionUID = -4683595709757010112L;

    public enum Type {
        STEP("步骤节点"),DECISION("决策节点"),FORK("分支节点"),JOIN("合并节点");
        public String chinese;
        private Type(String chinese) {
            this.chinese = chinese;
        }
    }

    @Id
    @Column(name="ID", columnDefinition="VARCHAR(32)")
    private String id;

    /**
     * 节点名称
     */
    @Column(name="NAME", columnDefinition="NVARCHAR(50)")
    private String name;

    /**
     * 节点编码
     */
    @Column(name="CODE", columnDefinition="NVARCHAR(50)")
    private String code;

    /**
     * 所属流程ID
     */
    @ManyToOne(optional=false)
    @JoinColumn(name="FLOW_ID", columnDefinition="VARCHAR(32)")
    private Flow flow;

    /**
     * 排序
     */
    @Column(name="SORT_CODE", nullable=false)
    private String sortCode;

    public FlowNode() {

    }

    public FlowNode(String id) {
        this.id = id;
    }

    public String getTypeChinese() {
        return Type.valueOf(this.getClass().getSimpleName().toUpperCase()).chinese;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FlowNode other = (FlowNode) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
