DROP TABLE IF EXISTS STTM_CUST_ACCOUNT;
DROP TABLE IF EXISTS XXTM_STOCKS;
 
CREATE TABLE STTM_CUST_ACCOUNT (
  id INT AUTO_INCREMENT  PRIMARY KEY,
      cust_no VARCHAR(250) NOT NULL,
      cust_ac_no VARCHAR(250) NOT NULL,
      ccy VARCHAR(3) NOT NULL,
      acy_avl_bal NUMBER
);

CREATE TABLE XXTM_STOCKS (
                                   id INT AUTO_INCREMENT  PRIMARY KEY,
                                   code VARCHAR(250) NOT NULL,
                                   currency VARCHAR(3) NOT NULL,
                                   price NUMBER NOT NULL

);