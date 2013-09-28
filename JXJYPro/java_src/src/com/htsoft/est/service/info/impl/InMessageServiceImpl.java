package com.htsoft.est.service.info.impl;
/*
 *  广州宏天软件有限公司 EST-BPM管理平台   -- http://www.jee-soft.cn
 *  Copyright (C) 2008-2011 GuangZhou HongTian Software Company
*/

import java.util.Date;
import java.util.List;

import com.htsoft.core.service.impl.BaseServiceImpl;
import com.htsoft.core.web.paging.PagingBean;
import com.htsoft.est.dao.info.InMessageDao;
import com.htsoft.est.model.info.InMessage;
import com.htsoft.est.model.info.ShortMessage;
import com.htsoft.est.service.info.InMessageService;

public class InMessageServiceImpl extends BaseServiceImpl<InMessage> implements
		InMessageService {

	private InMessageDao dao;
	public InMessageServiceImpl(InMessageDao dao) {
		super(dao);
		this.dao=dao;
	}
	@Override
	public InMessage findByRead(Long userId) {
		return dao.findByRead(userId);
	}
	@Override
	public Integer findByReadFlag(Long userId) {
		return dao.findByReadFlag(userId);
	}
	@Override
	public List<InMessage> findAll(Long userId, PagingBean pb) {
		return dao.findAll(userId, pb);
	}
	@Override
	public List findByUser(Long userId, PagingBean pb) {
		return dao.findByUser(userId, pb);
	}
	@Override
	public List searchInMessage(Long userId, InMessage inMessage,
			ShortMessage shortMessage, Date from, Date to, PagingBean pb) {
		return dao.searchInMessage(userId, inMessage, shortMessage, from, to, pb);
	}
	@Override
	public InMessage findLatest(Long userId) {
		return dao.findLatest(userId);
	}

}
