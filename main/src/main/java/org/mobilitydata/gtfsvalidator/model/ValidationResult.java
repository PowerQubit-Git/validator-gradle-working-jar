package org.mobilitydata.gtfsvalidator.model;

import org.mobilitydata.gtfsvalidator.notice.NoticeContainer;
import org.mobilitydata.gtfsvalidator.table.GtfsFeedContainer;

public class ValidationResult {
    boolean success;
    String tableTotals;
    double validationTime;
    GtfsFeedContainer feedContainer;
    String err;
    NoticeContainer noticeContainer;

    public ValidationResult() {
    }

    public ValidationResult(boolean success, String tableTotals, double validationTime, GtfsFeedContainer feedContainer, NoticeContainer noticeContainer) {
        this.success = success;
        this.tableTotals = tableTotals;
        this.validationTime = validationTime;
        this.feedContainer = feedContainer;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTableTotals() {
        return tableTotals;
    }

    public void setTableTotals(String tableTotals) {
        this.tableTotals = tableTotals;
    }

    public double getValidationTime() {
        return validationTime;
    }

    public void setValidationTime(double validationTime) {
        this.validationTime = validationTime;
    }

    public GtfsFeedContainer getFeedContainer() {
        return feedContainer;
    }

    public void setFeedContainer(GtfsFeedContainer feedContainer) {
        this.feedContainer = feedContainer;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public NoticeContainer getNoticeContainer() {
        return noticeContainer;
    }

    public void setNoticeContainer(NoticeContainer noticeContainer) {
        this.noticeContainer = noticeContainer;
    }

}
