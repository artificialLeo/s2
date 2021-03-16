package com.example.sav.utils;

public class TbItem {
    private long ItemID;
    private long SortNO;
    private long CSKUID;
    private String CSKU;
    private String ItemName;
    private String ProdName;
    private String MarkName;
    private String TradeMarketMail;
    private long ProdID;
    private long MarkID;

    public TbItem() {
    }

    public TbItem(long itemID, long sortNO, long CSKUID, String CSKU, String itemName, String prodName, String markName, String tradeMarketMail, long prodID, long markID) {
        ItemID = itemID;
        SortNO = sortNO;
        this.CSKUID = CSKUID;
        this.CSKU = CSKU;
        ItemName = itemName;
        ProdName = prodName;
        MarkName = markName;
        TradeMarketMail = tradeMarketMail;
        ProdID = prodID;
        MarkID = markID;
    }

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long itemID) {
        ItemID = itemID;
    }

    public long getSortNO() {
        return SortNO;
    }

    public void setSortNO(long sortNO) {
        SortNO = sortNO;
    }

    public long getCSKUID() {
        return CSKUID;
    }

    public void setCSKUID(long CSKUID) {
        this.CSKUID = CSKUID;
    }

    public String getCSKU() {
        return CSKU;
    }

    public void setCSKU(String CSKU) {
        this.CSKU = CSKU;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
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

    public String getTradeMarketMail() {
        return TradeMarketMail;
    }

    public void setTradeMarketMail(String tradeMarketMail) {
        TradeMarketMail = tradeMarketMail;
    }

    public long getProdID() {
        return ProdID;
    }

    public void setProdID(long prodID) {
        ProdID = prodID;
    }

    public long getMarkID() {
        return MarkID;
    }

    public void setMarkID(long markID) {
        MarkID = markID;
    }

    @Override
    public String toString() {
        return "TbItemToString{" +
                "ItemID='" + ItemID + '\'' +
                ", SortNO='" + SortNO + '\'' +
                ", CSKUID='" + CSKUID + '\'' +
                ", CSKU='" + CSKU + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", ProdName='" + ProdName + '\'' +
                ", MarkName='" + MarkName + '\'' +
                ", TradeMarketMail='" + TradeMarketMail + '\'' +
                ", ProdID='" + ProdID + '\'' +
                ", MarkID='" + MarkID + '\'' +
                '}';
    }
}
