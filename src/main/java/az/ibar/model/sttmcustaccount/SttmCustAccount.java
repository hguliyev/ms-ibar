package az.ibar.model.sttmcustaccount;

public class SttmCustAccount {
    private String custNo;
    private String custAcNo;
    private String ccy;
    private String acyAvlBal;

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustAcNo() {
        return custAcNo;
    }

    public void setCustAcNo(String custAcNo) {
        this.custAcNo = custAcNo;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getAcyAvlBal() {
        return acyAvlBal;
    }

    public void setAcyAvlBal(String acyAvlBal) {
        this.acyAvlBal = acyAvlBal;
    }

    @Override
    public String toString() {
        return "SttmCustAccount{" +
                "custNo='" + custNo + '\'' +
                ", custAcNo='" + custAcNo + '\'' +
                ", ccy='" + ccy + '\'' +
                ", acyAvlBal='" + acyAvlBal + '\'' +
                '}';
    }
}
