package com.github.permadao.arseedingsdk.sdk.response;

import java.io.Serializable;

/**
 * @author shiwen.wy
 * @date 2023/10/1 22:07
 */
public class DataSendOrderResponse implements Serializable {
  private static final long serialVersionUID = -1764467976694511595L;
  private String itemId;

  private long size;

  private String bundler;

  private String currency;

  private int decimals;

  private String fee;

  private long paymentExpiredTime;

  private long expectedBlock;

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public String getBundler() {
    return bundler;
  }

  public void setBundler(String bundler) {
    this.bundler = bundler;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public int getDecimals() {
    return decimals;
  }

  public void setDecimals(int decimals) {
    this.decimals = decimals;
  }

  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public long getPaymentExpiredTime() {
    return paymentExpiredTime;
  }

  public void setPaymentExpiredTime(long paymentExpiredTime) {
    this.paymentExpiredTime = paymentExpiredTime;
  }

  public long getExpectedBlock() {
    return expectedBlock;
  }

  public void setExpectedBlock(long expectedBlock) {
    this.expectedBlock = expectedBlock;
  }
}