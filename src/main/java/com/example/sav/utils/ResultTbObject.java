package com.example.sav.utils;

import java.util.List;

public class ResultTbObject {
    private String senderMail;
    private String senderFIO;
    private String startDate;
    private String finishDate;
    private String actionComment;
    private String actionInitiator;
    private String actionType;
    private String actionLocal;
    private String budgetQuantity;
    private int budgetSize;
    private int discount;
    private String budgetFilial;
    private String budgetTT;
    private String addRemoveCSKU;
    private String TradeMarketMail;
    private String ProdName;
    private String MarkName;
    private List<TbItem> order;

    public ResultTbObject() {
    }

    public ResultTbObject(String senderMail, String senderFIO, String startDate, String finishDate, String actionComment, String actionInitiator, String actionType, String actionLocal, String budgetQuantity, int budgetSize, int discount, String budgetFilial, String budgetTT, String addRemoveCSKU, String tradeMarketMail, String prodName, String markName, List<TbItem> order) {
        this.senderMail = senderMail;
        this.senderFIO = senderFIO;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.actionComment = actionComment;
        this.actionInitiator = actionInitiator;
        this.actionType = actionType;
        this.actionLocal = actionLocal;
        this.budgetQuantity = budgetQuantity;
        this.budgetSize = budgetSize;
        this.discount = discount;
        this.budgetFilial = budgetFilial;
        this.budgetTT = budgetTT;
        this.addRemoveCSKU = addRemoveCSKU;
        TradeMarketMail = tradeMarketMail;
        ProdName = prodName;
        MarkName = markName;
        this.order = order;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getSenderFIO() {
        return senderFIO;
    }

    public void setSenderFIO(String senderFIO) {
        this.senderFIO = senderFIO;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getActionComment() {
        return actionComment;
    }

    public void setActionComment(String actionComment) {
        this.actionComment = actionComment;
    }

    public String getActionInitiator() {
        return actionInitiator;
    }

    public void setActionInitiator(String actionInitiator) {
        this.actionInitiator = actionInitiator;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionLocal() {
        return actionLocal;
    }

    public void setActionLocal(String actionLocal) {
        this.actionLocal = actionLocal;
    }

    public String getBudgetQuantity() {
        return budgetQuantity;
    }

    public void setBudgetQuantity(String budgetQuantity) {
        this.budgetQuantity = budgetQuantity;
    }

    public int getBudgetSize() {
        return budgetSize;
    }

    public void setBudgetSize(int budgetSize) {
        this.budgetSize = budgetSize;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getBudgetFilial() {
        return budgetFilial;
    }

    public void setBudgetFilial(String budgetFilial) {
        this.budgetFilial = budgetFilial;
    }

    public String getBudgetTT() {
        return budgetTT;
    }

    public void setBudgetTT(String budgetTT) {
        this.budgetTT = budgetTT;
    }

    public String getAddRemoveCSKU() {
        return addRemoveCSKU;
    }

    public void setAddRemoveCSKU(String addRemoveCSKU) {
        this.addRemoveCSKU = addRemoveCSKU;
    }

    public String getTradeMarketMail() {
        return TradeMarketMail;
    }

    public void setTradeMarketMail(String tradeMarketMail) {
        TradeMarketMail = tradeMarketMail;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getMarkName() {
        return MarkName;
    }

    public void setMarkName(String markName) {
        MarkName = markName;
    }

    public List<TbItem> getOrder() {
        return order;
    }

    public void setOrder(List<TbItem> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "ResultTbObjectTOSTRING{" +
                "senderMail='" + senderMail + '\'' +
                ", senderFIO='" + senderFIO + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", actionComment='" + actionComment + '\'' +
                ", actionInitiator='" + actionInitiator + '\'' +
                ", actionType='" + actionType + '\'' +
                ", actionLocal='" + actionLocal + '\'' +
                ", budgetQuantity='" + budgetQuantity + '\'' +
                ", budgetSize=" + budgetSize +
                ", discount=" + discount +
                ", budgetFilial='" + budgetFilial + '\'' +
                ", budgetTT='" + budgetTT + '\'' +
                ", addRemoveCSKU='" + addRemoveCSKU + '\'' +
                ", TradeMarketMail='" + TradeMarketMail + '\'' +
                ", ProdName='" + ProdName + '\'' +
                ", MarkName='" + MarkName + '\'' +
                ", order=" + order +
                '}';
    }
}
