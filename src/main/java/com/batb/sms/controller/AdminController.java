package com.batb.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.batb.sms.constant.ViewNames;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping(value = "/documentEntry")
	public String getDocumentEntryPage() {
		return ViewNames.ADMIN_DOCUMENT_ENTRY;
	}
	
	@RequestMapping(value = "/rankAdjustment")
	public String getRankAdjustmentPage() {
		return ViewNames.RANK_ADJUSTMENT_ENTRY;
	}
	
	@RequestMapping(value = "/classPromotion")
	public String getClassPromotionPage() {
		return ViewNames.CLASS_PROMOTION_ENTRY;
	}
	
}
