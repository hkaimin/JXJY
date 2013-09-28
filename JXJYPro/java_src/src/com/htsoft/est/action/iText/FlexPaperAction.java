package com.htsoft.est.action.iText;

import java.text.SimpleDateFormat;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.htsoft.core.web.action.BaseAction;
import com.htsoft.est.model.document.Document;
import com.htsoft.est.service.document.DocumentService;

/**
 * @description 在线文档展示操作
 * @class FlexPaperAction
 * @extends BaseAction
 * @author YHZ
 * @company www.jee-soft.cn
 * @createtime 2011-6-10AM
 * 
 */
public class FlexPaperAction extends BaseAction {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private Long docId;

	@Resource
	private DocumentService documentService;

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public Long getDocId() {
		return docId;
	}

	@Override
	public String execute() {
		Document document = documentService.get(docId);
		HttpServletRequest request = getRequest();
		request.setAttribute("createtime", sdf.format(document.getCreatetime()));
		request.setAttribute("updatetime", sdf.format(document.getUpdatetime()));
		request.setAttribute("docName", document.getDocName());
		request.setAttribute("document", document);
		request.setAttribute("swfPath", request.getContextPath() + "/" + document.getSwfPath());
		request.setAttribute("attachFileList", document.getAttachFiles()
				.toArray());
		return SUCCESS;
	}
}
