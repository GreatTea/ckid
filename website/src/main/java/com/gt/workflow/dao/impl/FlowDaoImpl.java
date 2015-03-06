package com.gt.workflow.dao.impl;

import com.gt.core.BaseDao;
import com.gt.workflow.dao.FlowDao;
import com.gt.workflow.entity.Flow;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 14-8-27.
 */
@Repository("flowDaoImpl")
public class FlowDaoImpl extends BaseDao<Flow, String> implements FlowDao {

}
