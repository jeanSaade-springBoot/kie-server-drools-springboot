package com.neo.drools.model.fact;


public class AddressCheckResult {

    private boolean postCodeResult = false; // true:Passed verification; false: failed verification

    public boolean isPostCodeResult() {
        return postCodeResult;
    }

    public void setPostCodeResult(boolean postCodeResult) {
        this.postCodeResult = postCodeResult;
    }
}
