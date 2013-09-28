package com.htsoft.est.dao.info;
/*
 *  广州宏天软件有限公司 EST-BPM管理平台   -- http://www.jee-soft.cn
 *  Copyright (C) 2008-2011 GuangZhou HongTian Software Limited company.
*/
import java.util.List;

import com.htsoft.core.dao.BaseDao;
import com.htsoft.est.model.info.AppTips;

/**
 * 
 * @author 
 *
 */
public interface AppTipsDao extends BaseDao<AppTips>{
	/**
	 * 根据名称去查找TIP
	 */
	public List<AppTips> findByName(String name);
	
}