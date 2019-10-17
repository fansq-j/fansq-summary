package com.neusoft.crm.cpc.prod.mapper;

import com.neusoft.crm.common.persistence.CrudDao;
import com.neusoft.crm.common.persistence.MyBatisDao;
import com.neusoft.crm.api.cpc.prod.data.CustomerOrderDO;

@MyBatisDao
public interface CustomerOrderMapper extends CrudDao<CustomerOrderDO> { 

}
